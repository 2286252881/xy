package zh.shiro.factory;

import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder {
	public LinkedHashMap<String, String> buildFilterChainDefinitionMap(){
		LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
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
		//添加文章分类页面
		map.put("/toAddArticleType.html","authc,perms[admin:add]");
		//文章详细信息列表
		map.put("/toArticle.html", "authc,roles[admin,v1]");
		return map;
	}
}
