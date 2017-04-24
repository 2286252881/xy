package zh.sys.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import zh.base.entity.TArticle;
import zh.base.entity.TArticletype;

public interface IArticleTypeService {
	public List<TArticletype> getArticleType(TArticletype tArticletype);

	// 查询v1会员最新的10条数据
	// 查询v2会员最新的10条数据
	// 查询v3会员最新的10条数据
	public List<TArticle> getArticles(TArticle article);

	// 根据文章id获取文章详细信息
	public TArticle getArticle(TArticle article);
}
