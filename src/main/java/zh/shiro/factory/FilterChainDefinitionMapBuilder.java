package zh.shiro.factory;

import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder {
	public LinkedHashMap<String, String> buildFilterChainDefinitionMap(){
		LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
				/*/comm/login.jsp = anon
				/first.html=anon
				/login.html=anon
				
				/jsp/admin/admin.jsp=roles[admin]
				/jsp/user/user.jsp=roles[user]
				/** = authc*/
		map.put("/comm/login.jsp", "anon");
		//首页
		map.put("/first.html", "anon");
		//登陆
		map.put("/login.html", "anon");
		//静态资源文件
		map.put("/plugins/**", "anon");
		//退出登陆
		map.put("/logout.html", "logout");
		//文章类型页面
		map.put("/toArticleType.html","authc,roles[admin]");
		
		
		
		map.put("/jsp/admin/admin.jsp", "authc,roles[admin]");
		map.put("/jsp/user/user.jsp", "authc,roles[v1]");
		map.put("/**", "authc");
		return map;
	}
}
