package com.hxzy.web.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.tags.EscapeBodyTag;

import com.hxzy.dao.Tb_stock_mainMapper;
import com.hxzy.pojo.CartDemo;
import com.hxzy.pojo.Tb_goods;
import com.hxzy.pojo.Tb_provider;
import com.hxzy.pojo.Tb_stock_main;
import com.hxzy.pojo.Tb_stock_mainExample;
import com.hxzy.service.GoodsService;
import com.hxzy.service.InstorageService;
import com.hxzy.service.ProviderService;


@RequestMapping("instorage")
@Controller
public class InstorageController {
	
	@Autowired
	private GoodsService goodsService;
	@Autowired
	private ProviderService providerService;
	@Autowired
	private InstorageService instorageService;
	@Autowired
	private Tb_stock_mainMapper tb_stock_mainMapper;
	
	@RequestMapping("changeGoods/{id}")
	public String changeGoods(Model model, @PathVariable int id) {
		if(id > 0) {
			model.addAttribute("selectid" , id);
		}else {
			model.addAttribute("selectid" , 1);
		}
		List<Tb_goods> goodslist = goodsService.goodsQuery(0);
		List<Tb_provider> providerlist = providerService.providerQuery();
		model.addAttribute("goodslist", goodslist);
		model.addAttribute("providerlist", providerlist);
		return "stockAdd";
	}
	
	@RequestMapping("stockadd")
	public String stockadd(	int providerid, 
							double totalpay, 
							String principal, 
							String username, 
							Model model, 
							HttpServletRequest request) {
		
		List<CartDemo> stockgoods = (List<CartDemo>) request.getSession().getAttribute("stockgoods");
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("ddss");
		String format1 = simpleDateFormat1.format(new Date());
		String strsno = format1 + new Random().nextInt(99999);
		Tb_stock_main tb_stock_main = new Tb_stock_main();
		tb_stock_main.setSno(strsno);
		tb_stock_main.setPrincipal(principal);
		tb_stock_main.setProviderid(providerid);
		tb_stock_main.setUsername(username);
		tb_stock_main.setCreatetime(new Date());
		instorageService.addStockMain(tb_stock_main);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String format = simpleDateFormat.format(new Date());
		Date date = null;
		try {
			date = simpleDateFormat.parse(format);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Tb_stock_mainExample example  = new Tb_stock_mainExample();
		example.createCriteria().andSnoEqualTo(strsno);
		Tb_stock_main tb_stock_main2 = tb_stock_mainMapper.selectByExample(example).get(0);
		for (CartDemo cartDemo : stockgoods) {
			instorageService.addStockDetail(tb_stock_main2.getId(), cartDemo);
		}
		return "redirect:/ifDeal/inStockQuery";
	}
	
}
