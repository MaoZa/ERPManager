package com.hxzy.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hxzy.dao.Tb_goodsMapper;
import com.hxzy.pojo.CartDemo;
import com.hxzy.service.GoodsService;

@Controller
@RequestMapping("cart")
public class CartController {
	
	@Autowired
	private GoodsService goodsService;
	@RequestMapping("add")
	public String add(int id, double price, int number, HttpServletRequest request, Model model) {
		System.out.println(id);
		List<CartDemo> stockgoods = (List<CartDemo>) request.getSession().getAttribute("stockgoods");
		double amount = 0;
		if(stockgoods != null) {
			CartDemo cartDemo = new CartDemo();
			cartDemo.setTb_goods(goodsService.goodsQueryOne(id));
			cartDemo.setNumber(number);
			cartDemo.getTb_goods().setPrice(Float.parseFloat(price+""));
			stockgoods.add(cartDemo);
			for (CartDemo cartDemo1 : stockgoods) {
				amount +=  (cartDemo1.getTb_goods().getPrice() * cartDemo1.getNumber());
			}
		}else {
			List<CartDemo> list = new ArrayList<>();
			CartDemo cartDemo = new CartDemo();
			cartDemo.setTb_goods(goodsService.goodsQueryOne(id));
			cartDemo.setNumber(number);
			cartDemo.getTb_goods().setPrice(Float.parseFloat(price+""));
			list.add(cartDemo);
			request.getSession().setAttribute("stockgoods", list);
			amount = price * number;
		}
		request.getSession().setAttribute("amount", amount);
		return "redirect:/instorage/changeGoods/0";
	}
	
	
	@RequestMapping("remove/{id}")
	public String remoce(@PathVariable int id, HttpServletRequest request) {
		List<CartDemo> stockgoods = (List<CartDemo>) request.getSession().getAttribute("stockgoods");
		System.out.println("Controller:UUID=" + id);
		for (CartDemo cartDemo : stockgoods) {
			if(cartDemo.getId() == id) {
				stockgoods.remove(cartDemo);
				System.out.println("移除" + cartDemo.getId());
				break;
			}
		}
		request.getSession().setAttribute("stockgoods", stockgoods);
		return "redirect:/instorage/changeGoods/0";
	}
	
}
