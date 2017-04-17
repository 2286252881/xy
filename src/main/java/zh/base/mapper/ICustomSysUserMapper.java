package zh.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import zh.base.entity.TRole;
import zh.base.entity.TUser;

public interface ICustomSysUserMapper {
	// 根据登陆用户获取登陆用户所有角色
	public List<TRole> getRoles(@Param("user")TUser user);
}
