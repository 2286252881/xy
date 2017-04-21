package zh.sys.service;

import java.util.List;

import zh.base.entity.TArticle;
import zh.base.entity.TArticletype;

public interface IArticleTypeService {
	public List<TArticletype> getArticleType(TArticletype tArticletype);
	// 查询v1会员最新的10条数据
	// 查询v2会员最新的10条数据
	// 查询v3会员最新的10条数据
	public List<TArticle> getArticles(TArticle article);
}
