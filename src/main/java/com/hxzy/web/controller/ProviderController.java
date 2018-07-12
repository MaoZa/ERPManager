package com.hxzy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hxzy.pojo.Tb_provider;
import com.hxzy.service.ProviderService;
@RequestMapping("provider")
@Controller
public class ProviderController {

	@Autowired
	private ProviderService providerService;
	
	@RequestMapping("providerQuery")
	public String providerQuery(Model model) {
		List<Tb_provider> list = providerService.providerQuery();
		model.addAttribute("providerList", list);
		return "providerList";
	}
}
