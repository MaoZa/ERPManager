package com.hxzy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hxzy.dao.Tb_goodsMapper;
import com.hxzy.pojo.Tb_goods;
import com.hxzy.service.GoodsService;

@RequestMapping("goods")
@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService goodsService;
	
	/***
	 * 查询所有物资 分开ifdel=1和0
	 * @param model
	 * @return
	 */
	@RequestMapping("goodsRequest")
	public String goodsRequest(Model model) {
		List<Tb_goods> list1 =  goodsService.goodsQuery(1);
		List<Tb_goods> list0 =  goodsService.goodsQuery(0);
		System.out.println(list1);
		System.out.println(list0);
		model.addAttribute("goodsList1", list1);
		model.addAttribute("goodsList0", list0);
		return "goodsList";
	}
	
	/***
	 * 修改物资ifdel状态
	 * @param id
	 * @param ifdel
	 * @param model
	 * @return
	 */
	@RequestMapping("goodsdel/{id}/{ifdel}")
	public String goodsdel1(@PathVariable int id, @PathVariable Byte ifdel, Model model) {
		System.err.println("删除前ifdel=" + goodsService.goodsQueryOne(id).getIfdel());
		int temp = goodsService.goodsModifyIfdel(id,ifdel);
		System.err.println("删除后ifdel=" + goodsService.goodsQueryOne(id).getIfdel());
		if(temp > 0) {
			model.addAttribute("para", 3);
			return "goods_ok";
		}else {
			model.addAttribute("error", "物资信息删除/恢复失败!");
			return "error";
		}	
	}
	
	/***
	 * 跳至goodsModify.jsp并回显
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("goodsMquery/{id}")
	public String goodsMquery(@PathVariable int id, Model model) {
		Tb_goods goods = goodsService.goodsQueryOne(id);
		model.addAttribute("goods", goods);
		return "goodsModify";
	}
	
	/***
	 * 提交修改物资
	 * @param goods
	 * @param model
	 * @return
	 */
	@RequestMapping("goodsModifyTrue")
	public String goodsModifyTrue(Tb_goods goods, Model model) {
		int temp = goodsService.goodsModify(goods);
		if(temp > 0) {
			model.addAttribute("para", 2);
			return "goods_ok";
		}else {
			model.addAttribute("error", "物资信息修改失败!");
			return "error";
		}	
	}
	
	/***
	 * 提交添加物资
	 * @param goods
	 * @param model
	 * @return
	 */
	@RequestMapping("goodsadd")
	public String goodsadd(Tb_goods goods, Model model) {
		int temp = goodsService.goodsAdd(goods);
		if(temp > 0) {
			model.addAttribute("para", 1);
			return "goods_ok";
		}else {
			model.addAttribute("error", "物资信息添加成功!");
			return "error";
		}
	}

}
