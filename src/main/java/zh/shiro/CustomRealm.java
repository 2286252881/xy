package zh.shiro;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import zh.base.entity.TRole;
import zh.base.entity.TUser;
import zh.sys.service.ISysService;
import zh.sys.util.result.ExceptionResultInfo;

/**
 * 认证
 * 
 * @author Administrator
 *
 */
public class CustomRealm extends AuthorizingRealm {
	private static final Logger LOGGER = Logger.getLogger(CustomRealm.class);
	@Autowired
	private ISysService sysService;

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		System.out.println("[Realm]:doGetAuthenticationInfo");
		System.out.println("2.AuthenticationInfo " + token.hashCode());
		// 1.从token中拿出用信息
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		// 2.获取登陆用户名
		String username = upToken.getUsername();
		// 3.根据用户名获取用户信息
		TUser u=null;
		try {
			u = sysService.getUserByUserName(username);
		} catch (ExceptionResultInfo e) {
			LOGGER.info(e.getMessage());
		}
		// 4.用户不存在，则抛出UnknownAccountException用户不存在异常
		if (null == u) {
			throw new UnknownAccountException("用户不存在!");
		}
		// 5.根据用户的信息情况，决定是否抛出其他的信息异常
		if (u.getLocked() == "1") {
			throw new UnknownAccountException("用户被锁定!");
		}
		// 6. 根据用户的情况, 来构建 AuthenticationInfo 对象并返回. 通常使用的实现类为:SimpleAuthenticationInfo
		// 1). principal: 认证的实体信息. 可以是 username, 也可以是数据表对应的用户的实体类对象.
		Object principal = u.getUsername();
		//2). credentials: 密码. 
		Object credentials = u.getPassword(); 
		//3). realmName: 当前 realm 对象的 name. 调用父类的 getName() 方法即可
		String realmName = getName();
		System.out.println("[realmName]:"+realmName);
		//4). 盐值.
		ByteSource credentialsSalt=ByteSource.Util.bytes(u.getSalt());
		SimpleAuthenticationInfo info = null; //new SimpleAuthenticationInfo(principal, credentials, realmName);
		info = new SimpleAuthenticationInfo(principal, credentials, credentialsSalt, realmName);
		return info;
	}
	//授权 shiro回调的方法
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		System.out.println("doGetAuthorizationInfo:授权");
		//1.从PrincipalCollection中获取用户登陆信息
		Object principal=principals.getPrimaryPrincipal();
		System.out.println(principal);
		TUser activeUser=null;
		try {
			activeUser= sysService.getUserByUserName((String) principal);
		} catch (ExceptionResultInfo e1) {
			e1.printStackTrace();
		}
		//2.从登陆用户的信息中获取用户权限和信息(数据库获取角色权限)
		Set<String> roles=new HashSet<String>();
		try {
			List<TRole> roList=sysService.getRoles(activeUser);
			for (TRole tRole : roList) {
				roles.add(tRole.getRolename());
			}
		} catch (ExceptionResultInfo e) {
			LOGGER.info(e.getMessage());
		}
		//3.创建SimpleAuthorizationInfo,并设置其roles属性
		SimpleAuthorizationInfo info= new SimpleAuthorizationInfo(roles);
		//4.返回SimpleAuthenticationInfo对象
		return info;
	}
}
