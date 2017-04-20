package zh.sys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String toArticleType(){
		return "/jsp/article/articleType";
	}
}
