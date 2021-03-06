package zh.sys.controller.home;

import java.util.List;

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
import zh.base.entity.TArticletype;
import zh.base.entity.TUser;
import zh.sys.service.IArticleTypeService;
import zh.sys.service.ISysService;
import zh.sys.util.result.ExceptionResultInfo;

@Controller
public class SysController {
	private static final Logger LOGGER = Logger.getLogger(SysController.class);

	@Autowired
	private IArticleTypeService articleService;
	
	@Autowired
	private ISysService sysService;
	/**
	 * 到达首页列表页面
	 * @return
	 */
	@RequestMapping("/first")
	public ModelAndView sysList() {
		ModelAndView mv = new ModelAndView();
		TArticle article = new TArticle();
		article.setArticlemodle("1");
		// 查询v1会员最新的10条数据
		List<TArticle> v1 = articleService.getArticles(article);
		// 查询v2会员最新的10条数据
		article.setArticlemodle("2");
		List<TArticle> v2 = articleService.getArticles(article);
		// 查询v3会员最新的10条数据
		article.setArticlemodle("3");
		List<TArticle> v3 = articleService.getArticles(article);
		mv.addObject("v1", v1);
		mv.addObject("v2", v2);
		mv.addObject("v3", v3);
		mv.setViewName("/comm/first");
		return mv;
	}
	
	
	/**
	 * 用户登录认证
	 * @param sysUser
	 * @return
	 * @throws ExceptionResultInfo
	 */
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
	
	/**
	 * 认证失败页面
	 * @return
	 */
	@RequestMapping("/unauthorized")
	public ModelAndView unauthorized() {
		ModelAndView mv = new ModelAndView();
		TUser user = (TUser) SecurityUtils.getSubject().getPrincipal();
		mv.addObject("exceptionResultInfo", user.getTruename() + ":您没有访问权限!");
		mv.setViewName("/comm/unauthorized");
		return mv;
	}

	// 到达后台首页
	@RequestMapping("/toManagement")
	public ModelAndView toArticleType(TArticletype articletype) throws ExceptionResultInfo {
		System.out.println(articletype.getUserid());
		ModelAndView mv = new ModelAndView();
		List<TUser> us=sysService.getAllUsers();
		mv.addObject("us", us);
		mv.setViewName("/jsp/backstage/management");
		return mv;
	}

}
