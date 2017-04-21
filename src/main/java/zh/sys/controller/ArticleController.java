package zh.sys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	@RequestMapping("/toArticleType")
	public ModelAndView toArticleType(TArticletype articletype){
		System.out.println(articletype.getUserid());
		ModelAndView mv=new ModelAndView();
		List<TArticletype> articletypes=articleService.getArticleType(articletype);
		
		mv.addObject("articletypes", articletypes);
		mv.setViewName("/jsp/article/articleType");
		return mv;
	}
}
