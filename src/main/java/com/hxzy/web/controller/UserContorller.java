package com.hxzy.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hxzy.pojo.Tb_user;
import com.hxzy.service.UserSerivce;
@RequestMapping("user")
@Controller
public class UserContorller {
	
	@Autowired
	private UserSerivce userSerivce;
	
	@RequestMapping("login")
	public String userLogin(Tb_user user, Model model, HttpServletRequest request) {
		Tb_user user1 = userSerivce.loginCheck(user.getName(), user.getPwd());
		System.out.println(user1);
		if(user1!=null) {
			request.getSession().setAttribute("user", user1);
			return "main";
		}else {
			model.addAttribute("error", "用户名或密码错误");
			return "error";
		}
	}
	
	@RequestMapping("userQuery")
	public String queryUser() {
		return null;
	}
	
	@RequestMapping("userdel")
	public String removeUser() {
		return null;
	}
	
	@RequestMapping("useradd")
	public String addUser() {
		return null;
	}
	
	@RequestMapping("userMQuery")
	public String queryUserM() {
		return null;
	}
	
	@RequestMapping("pwsModify")
	public String updatePws() {
		return null;
	}
	
}
