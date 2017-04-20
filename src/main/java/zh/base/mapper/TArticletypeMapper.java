package zh.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zh.base.entity.TArticletype;
import zh.base.entity.TArticletypeExample;

public interface TArticletypeMapper {
    int countByExample(TArticletypeExample example);

    int deleteByExample(TArticletypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(TArticletype record);

    int insertSelective(TArticletype record);

    List<TArticletype> selectByExample(TArticletypeExample example);

    TArticletype selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TArticletype record, @Param("example") TArticletypeExample example);

    int updateByExample(@Param("record") TArticletype record, @Param("example") TArticletypeExample example);

    int updateByPrimaryKeySelective(TArticletype record);

    int updateByPrimaryKey(TArticletype record);
}