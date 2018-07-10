package com.hxzy.service;

import java.util.List;

import com.hxzy.pojo.Tb_user;

public interface UserSerivce {
	
	/***
	 * 用户登录校验
	 * @param username
	 * @param password
	 * @return int
	 */
	public int loginCheck(String username, String password);
	
	/***
	 * 查询所有用户信息
	 * @return List<Tb_user>
	 */
	public List<Tb_user> queryUser();
	
	/***
	 * 删除用户信息
	 * @param uid
	 * @return int
	 */
	public int removeUser(int uid);
	
	/***
	 * 添加用户信息
	 * @param user
	 * @return int
	 */
	public int addUser(Tb_user user);
	
	/***
	 * 查询用户权限
	 * @param name
	 * @return Tb_user
	 */
	public Tb_user queryUserQ(String name);
	
	/***
	 * 更新用户信息
	 * @param user
	 * @return int
	 */
	public int updateUser(Tb_user user);
	
	/***
	 * 更新用户权限
	 * @param user
	 * @return int
	 */
	public int updateUserQ(Tb_user user);
	
}
