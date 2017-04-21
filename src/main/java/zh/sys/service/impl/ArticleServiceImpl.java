package zh.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zh.base.entity.TArticle;
import zh.base.entity.TArticleExample;
import zh.base.entity.TArticletype;
import zh.base.entity.TArticletypeExample;
import zh.base.mapper.TArticleMapper;
import zh.base.mapper.TArticletypeMapper;
import zh.sys.service.IArticleTypeService;

@Service("articleService")
public class ArticleServiceImpl implements IArticleTypeService {
	
	@Autowired
	private TArticletypeMapper articletypeMapper;
	
	@Autowired
	private TArticleMapper articleMapper;
	
	/**
	 * 查询某个用户下的文章分类信息
	 */
	@Override
	public List<TArticletype> getArticleType(TArticletype articletype) {
		TArticletypeExample articletypeExample=new TArticletypeExample();
		TArticletypeExample.Criteria criteria=articletypeExample.createCriteria();
		if(null!=articletype.getUserid()||"".equals(articletype.getUserid())){
			criteria.andUseridEqualTo(articletype.getUserid());
		}
		if(null!=articletype.getArticletypename()||"".equals(articletype.getArticletypename())){
			criteria.andArticletypenameLike(articletype.getArticletypename());
		}
		return articletypeMapper.selectByExample(articletypeExample);
	}
	/**
	 * 根据会员级别查询会员分类下的文章
	 */
	@Override
	public List<TArticle> getArticles(TArticle article) {
		TArticleExample articleExample=new TArticleExample();
		TArticleExample.Criteria criteria=articleExample.createCriteria();
		if(null!=article.getArticlemodle()&&!"".equals(article.getArticlemodle())){
			criteria.andArticlemodleEqualTo(article.getArticlemodle());
		}
		return articleMapper.selectByExample(articleExample);
	}
	
}
