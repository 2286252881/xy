package zh.sys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import zh.base.entity.TArticle;
import zh.base.entity.TArticletype;
import zh.sys.service.IArticleTypeService;
/**
 * 文章分类、文章控制器
 * @author Administrator
 *
 */
@Controller
public class ArticleController {
	
	@Autowired
	private IArticleTypeService articleService;
	//查询所有分类列表
	@RequestMapping("/getArticleType")
	public List<TArticletype> getArticleType(){
		return null;
	}
	//到达分类列表页面
	@RequestMapping("/toManagement")
	public ModelAndView toArticleType(TArticletype articletype){
		System.out.println(articletype.getUserid());
		ModelAndView mv=new ModelAndView();
		List<TArticletype> articletypes=articleService.getArticleType(articletype);
		
		mv.addObject("articletypes", articletypes);
		mv.setViewName("/jsp/backstage/management");
		return mv;
	}
	//添加文章分类
	@RequestMapping("/toAddArticleType")
	public ModelAndView toAddArticleType(TArticletype articletype){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/jsp/article/addArticleType");
		return mv;
	}
	//文章详情页面
	@RequestMapping("/toArticleV1")
	public ModelAndView toArticleV1(TArticle article){
		ModelAndView mv=new ModelAndView();
		TArticle a=articleService.getArticle(article);
		mv.addObject("a", a);
		mv.setViewName("/jsp/article/articleShow");
		return mv;
	}
	
	@RequestMapping("/toArticleV2")
	public ModelAndView toArticleV2(TArticle article){
		ModelAndView mv=new ModelAndView();
		TArticle a=articleService.getArticle(article);
		mv.addObject("a", a);
		mv.setViewName("/jsp/article/articleShow");
		return mv;
	}
	@RequestMapping("/toArticleV3")
	public ModelAndView toArticleV3(TArticle article){
		ModelAndView mv=new ModelAndView();
		TArticle a=articleService.getArticle(article);
		mv.addObject("a", a);
		mv.setViewName("/jsp/article/articleShow");
		return mv;
	}
}
