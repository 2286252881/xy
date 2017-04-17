package zh.sys.service.impl;

import java.util.Date;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.springframework.stereotype.Service;

import zh.sys.service.IShiroService;
import zh.sys.util.result.ExceptionResultInfo;

@Service("shiroServcie")
public class ShiroServiceImpl implements IShiroService {

	@Override
	@RequiresRoles({ "admin" })
	public void testMethod() throws ExceptionResultInfo {
		Session session = SecurityUtils.getSubject().getSession();
		Object val = session.getAttribute("key");
		System.out.println("service session val:" + val);
		System.out.println("test shiro Method time:" + new Date());
	}
}
