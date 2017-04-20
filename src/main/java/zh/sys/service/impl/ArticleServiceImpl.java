package zh.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zh.base.entity.TArticletype;
import zh.base.entity.TArticletypeExample;
import zh.base.mapper.TArticletypeMapper;
import zh.sys.service.IArticleTypeService;

@Service("articleService")
public class ArticleServiceImpl implements IArticleTypeService {
	
	@Autowired
	private TArticletypeMapper articletypeMapper;
	@Override
	public List<TArticletype> getArticleType(TArticletype articletype) {
		TArticletypeExample articletypeExample=new TArticletypeExample();
		TArticletypeExample.Criteria criteria=articletypeExample.createCriteria();
		if(null!=articletype.getId()||"".equals(articletype.getId())){
			criteria.andIdEqualTo(articletype.getId());
		}
		return articletypeMapper.selectByExample(articletypeExample);
	}
	
}
