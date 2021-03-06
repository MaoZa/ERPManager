package com.hxzy.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hxzy.pojo.Tb_branch;
import com.hxzy.pojo.Tb_branchDamage;
import com.hxzy.service.BranchService;

@RequestMapping("branch")
@Controller
public class BranchController {
	
	@Autowired
	private BranchService branchService;
	
	@RequestMapping("branchQuery")
	public String branchQuery(Model model) {
		List<Tb_branch> list = branchService.branchQuery();
		model.addAttribute("branchList", list);
		return "branchList";
	}
	
	@RequestMapping("branchadd")
	public String branchadd(Model model, Tb_branch branch) {
		int temp = branchService.branchAdd(branch);
		if(temp > 0) {
			model.addAttribute("para" , 1);
			return "branch_ok";
		}else {
			model.addAttribute("error", "部门信息添加失败");
			return "error";
		}
	}
	
	@RequestMapping("branchdel/{id}/{val}")
	public String branchdel(Model model, @PathVariable int id) {
		int temp = branchService.branchDel(id);
		if(temp > 0) {
			model.addAttribute("para" , 3);
			return "branch_ok";
		}else {
			model.addAttribute("error" , "部门信息删除失败");
			return "error";
		}
	}
	
	@RequestMapping("branchDamageInfo")
	public String branchDamageInfo(Model model) {
		
		List<Tb_branch> branchs = branchService.branchQuery();
		List<Tb_branchDamage> branchDamages  = new ArrayList<Tb_branchDamage>();
		for (Tb_branch tb_branch : branchs) {
			Tb_branchDamage queryBanchDamage = branchService.queryBanchDamage(tb_branch.getId());
			if(queryBanchDamage != null) {
				branchDamages.add(queryBanchDamage);
			}
		}
		System.out.println(branchDamages);
		model.addAttribute("branchDamages", branchDamages);
		model.addAttribute("branchDamagesSize", branchDamages.size());
		return "branchTotal";
	}
}
