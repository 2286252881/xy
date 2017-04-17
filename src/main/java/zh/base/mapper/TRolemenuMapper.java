package zh.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zh.base.entity.TRolemenu;
import zh.base.entity.TRolemenuExample;

public interface TRolemenuMapper {
    int countByExample(TRolemenuExample example);

    int deleteByExample(TRolemenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(TRolemenu record);

    int insertSelective(TRolemenu record);

    List<TRolemenu> selectByExample(TRolemenuExample example);

    TRolemenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TRolemenu record, @Param("example") TRolemenuExample example);

    int updateByExample(@Param("record") TRolemenu record, @Param("example") TRolemenuExample example);

    int updateByPrimaryKeySelective(TRolemenu record);

    int updateByPrimaryKey(TRolemenu record);
}