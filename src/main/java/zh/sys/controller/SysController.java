package zh.sys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import zh.base.entity.TArticle;
import zh.base.entity.TUser;
import zh.sys.service.IArticleTypeService;
import zh.sys.service.IShiroService;
import zh.sys.util.result.ExceptionResultInfo;
import zh.sys.util.result.ResultInfo;

@Controller
public class SysController {
	private static final Logger LOGGER = Logger.getLogger(SysController.class);
	@Autowired
	private IShiroService shiroService;
	
	
	@Autowired
	private IArticleTypeService articleService;
	
	

	@RequestMapping("/first")
	public ModelAndView sysList() {
		ModelAndView mv=new ModelAndView();
		TArticle article=new TArticle();
		article.setArticlemodle("1");
		//查询v1会员最新的10条数据
		List<TArticle> v1=articleService.getArticles(article);
		//查询v2会员最新的10条数据
		article.setArticlemodle("2");
		List<TArticle> v2=articleService.getArticles(article);
		//查询v3会员最新的10条数据
		article.setArticlemodle("3");
		List<TArticle> v3=articleService.getArticles(article);
		mv.addObject("v1", v1);
		mv.addObject("v2", v2);
		mv.addObject("v3", v3);
		mv.setViewName("/comm/first");
		return mv;
	}

	@RequestMapping("/login")
	public String sysLogin(TUser sysUser) throws ExceptionResultInfo {
		Subject currentUser = SecurityUtils.getSubject();
		if (!currentUser.isAuthenticated()) {
			// 把用户名和密码封装为 UsernamePasswordToken 对象
			UsernamePasswordToken token = new UsernamePasswordToken(sysUser.getUsername(), sysUser.getPassword());
			// rememberme
			/* token.setRememberMe(true); */
			try {
				System.out.println("1.sysLogin " + token.hashCode());
				// 执行登录.
				currentUser.login(token);
			}
			// ... catch more exceptions here (maybe custom ones specific to
			// your application?
			// 所有认证时异常的父类.
			catch (AuthenticationException ae) {
				// unexpected condition? error?
				LOGGER.info("shiro登陆认证异常:" + ae.getMessage());
			}
		}
		return "redirect:/first.html";
	}

	@RequestMapping("/unauthorized")
	public ModelAndView unauthorized(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("exceptionResultInfo", "没有访问权限!");
		mv.setViewName("/comm/unauthorized");
		return mv;
	}
	
	
	
	
	@RequestMapping("/testShiroAnnotation")
	public String testShiroAnnotation(HttpServletRequest request) {
		request.getSession().setAttribute("key", "value1234");
		
		Subject subject = SecurityUtils.getSubject();
		System.out.println("================================role:"+subject.hasRole("admin"));
		try {
			shiroService.testMethod();
		} catch (ExceptionResultInfo e) {
			e.printStackTrace();
		}
		return "redirect:/first.html";
	}
}
