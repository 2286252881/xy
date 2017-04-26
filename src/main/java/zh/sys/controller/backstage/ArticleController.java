package zh.sys.controller.backstage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

import zh.base.customEntity.Node;
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
	
	@RequestMapping("/toZtree")
	public ModelAndView toZtree(){
		ModelAndView mv=new ModelAndView();
		List<Node> list=new ArrayList<Node>();
		JSON json=(JSON) JSON.toJSON(list);
		mv.addObject("nodes", json);
		mv.setViewName("/jsp/backstage/ztree");
		return mv; 
	}
}
