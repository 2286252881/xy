package zh.sys.service;

import java.util.List;

import zh.base.entity.TRole;
import zh.base.entity.TUser;
import zh.sys.util.result.ExceptionResultInfo;

public interface ISysService {
	//根据id获取用户
	public TUser getUserById(TUser user)throws ExceptionResultInfo;
	//根据用户名获取用户
	public TUser getUserByUserName(String username)throws ExceptionResultInfo;
	//获取登陆用户所有角色
	public List<TRole>getRoles(TUser user)throws ExceptionResultInfo;
	//获取所有用户列表
	public List<TUser> getAllUsers()throws ExceptionResultInfo;
}
