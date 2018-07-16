package com.hxzy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hxzy.pojo.Tb_stock_main;
import com.hxzy.service.InstorageService;

@Controller
@RequestMapping("ifDeal")
public class IfDealController {

	@Autowired
	private InstorageService instorageService;
	
	@RequestMapping("stockQuery/{state}")
	public String stockQuery(Model model, @PathVariable int state, String f) {
		System.out.println(f);
		List<Tb_stock_main> stockMainList = instorageService.queryStockByState(state);
		model.addAttribute("stockMainList", stockMainList);
		return "stockQuery";
		
	}
}
