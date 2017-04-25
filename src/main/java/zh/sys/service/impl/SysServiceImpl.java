package zh.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zh.base.entity.TRole;
import zh.base.entity.TUser;
import zh.base.entity.TUserExample;
import zh.base.mapper.ICustomSysUserMapper;
import zh.base.mapper.TUserMapper;
import zh.sys.service.ISysService;
import zh.sys.util.result.ExceptionResultInfo;

@Service("sysService")
public class SysServiceImpl implements ISysService {
	
	
	@Autowired
	private TUserMapper userMapper;
	
	
	@Autowired
	private ICustomSysUserMapper customSysUserMapper;
	

	@Override
	public TUser getUserById(TUser user)throws ExceptionResultInfo {
		return userMapper.selectByPrimaryKey(user.getId());
	}

	@Override
	public TUser getUserByUserName(String username)throws ExceptionResultInfo {
		TUserExample userExample=new TUserExample();
		TUserExample.Criteria criteria=userExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<TUser> us=userMapper.selectByExample(userExample);
		if(null==us||us.isEmpty()){
			return null;
		}
		return us.get(0);
	}

	@Override
	public List<TRole> getRoles(TUser user) throws ExceptionResultInfo {
		return customSysUserMapper.getRoles(user);
	}
	
	/**
	 * 管理员获取所有用户
	 */
	@Override
	public List<TUser> getAllUsers() throws ExceptionResultInfo {
		TUserExample userExample=new TUserExample();
		List<TUser> us=userMapper.selectByExample(userExample);
		return us;
	}
}
