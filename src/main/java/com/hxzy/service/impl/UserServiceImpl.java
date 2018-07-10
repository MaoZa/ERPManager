package com.hxzy.service.impl;

import java.util.List;

import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxzy.dao.Tb_userMapper;
import com.hxzy.pojo.Tb_user;
import com.hxzy.pojo.Tb_userExample;
import com.hxzy.service.UserSerivce;

@Service
public class UserServiceImpl implements UserSerivce {

	@Autowired
	private Tb_userMapper tb_userMapper;
	
	public int loginCheck(String username, String password) {
		Tb_userExample example = new Tb_userExample();
		example.createCriteria().andNameEqualTo(username).andPwdEqualTo(password);
		return tb_userMapper.selectByExample(example).size();
	}

	public List<Tb_user> queryUser() {
		return tb_userMapper.selectByExample(null);
	}

	public int removeUser(int uid) {
		return tb_userMapper.deleteByPrimaryKey(uid);
	}

	public int addUser(Tb_user user) {
		return tb_userMapper.insert(user);
	}

	public Tb_user queryUserQ(String name) {
		Tb_userExample example = new Tb_userExample();
		example.createCriteria().andNameEqualTo(name);
		return tb_userMapper.selectByExample(example).get(0);
	}

	public int updateUser(Tb_user user) {
		Tb_userExample example = new Tb_userExample();
		example.createCriteria().andNameEqualTo(user.getName());
		user.setSetbasic(null);
		user.setSetdeal(null);
		user.setSetinstorage(null);
		user.setSetoutstorage(null);
		user.setSetquery(null);
		user.setSetsys(null);
		return tb_userMapper.updateByExampleSelective(user, example);
	}

	public int updateUserQ(Tb_user user) {
		Tb_userExample example = new Tb_userExample();
		example.createCriteria().andNameEqualTo(user.getName());
		return tb_userMapper.updateByExample(user, example);
	}


	
	
	
	
	
}
