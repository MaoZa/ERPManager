package com.hxzy.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hxzy.pojo.Tb_user;
import com.hxzy.service.UserSerivce;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceTest {
	
	@Autowired
	private UserSerivce userSerivce;
	
	@Test
	public void LoginCheck() {
		System.out.println(userSerivce.loginCheck("song", "song"));
	}
	@Test
	public void QueryUser() {
		System.out.println(userSerivce.queryUser());
	}
	@Test
	public void updateUser() {
		Tb_user user = new Tb_user();
		user.setName("song");
		user.setPwd("song");
		userSerivce.updateUser(user);
	}
}
