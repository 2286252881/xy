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
		map.put("/first.html", "anon");
		map.put("/login.html", "anon");
		map.put("/plugins/**", "anon");
		map.put("/logout.html", "logout");
		map.put("/jsp/admin/admin.jsp", "authc,roles[admin]");
		map.put("/jsp/user/user.jsp", "authc,roles[user]");
		map.put("/**", "authc");
		return map;
	}
}
