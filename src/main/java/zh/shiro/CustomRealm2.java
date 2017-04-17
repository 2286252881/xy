package zh.shiro;

import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import zh.base.entity.TUser;
import zh.sys.service.ISysService;
import zh.sys.util.result.ExceptionResultInfo;

/**
 * 认证
 * 
 * @author Administrator
 *
 */
public class CustomRealm2 extends AuthenticatingRealm {
	private static final Logger LOGGER = Logger.getLogger(CustomRealm2.class);
	@Autowired
	private ISysService sysService;

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		System.out.println("[SecondRealm]:doGetAuthenticationInfo");
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
		Object credentials ="51eb40e5857eedc69423de1692e430e21c57ecec"/*u.getPassword()*/; 
		//3). realmName: 当前 realm 对象的 name. 调用父类的 getName() 方法即可
		String realmName = getName();
		System.out.println("[realmName2]:"+realmName);
		//4). 盐值.
		ByteSource credentialsSalt=ByteSource.Util.bytes(u.getSalt());
		SimpleAuthenticationInfo info = null; //new SimpleAuthenticationInfo(principal, credentials, realmName);
		info = new SimpleAuthenticationInfo(principal, credentials, credentialsSalt, realmName);
		return info;
	}

}
