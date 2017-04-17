package zh.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zh.base.entity.TUserrole;
import zh.base.entity.TUserroleExample;

public interface TUserroleMapper {
    int countByExample(TUserroleExample example);

    int deleteByExample(TUserroleExample example);

    int deleteByPrimaryKey(String id);

    int insert(TUserrole record);

    int insertSelective(TUserrole record);

    List<TUserrole> selectByExample(TUserroleExample example);

    TUserrole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TUserrole record, @Param("example") TUserroleExample example);

    int updateByExample(@Param("record") TUserrole record, @Param("example") TUserroleExample example);

    int updateByPrimaryKeySelective(TUserrole record);

    int updateByPrimaryKey(TUserrole record);
}