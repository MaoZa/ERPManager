package com.hxzy.service;

import java.util.List;

import com.hxzy.pojo.Tb_branch;
import com.hxzy.pojo.Tb_branchDamage;

public interface BranchService {
	/***
	 * 查询所有branch信息
	 * @return
	 */
	public List<Tb_branch> branchQuery();
	
	/***
	 * 插入branch信息
	 * @param branch
	 * @return
	 */
	public int branchAdd(Tb_branch branch);
	
	/***
	 * 删除branch信息 (不做删除状态判断)
	 * @param id
	 * @return
	 */
	public int branchDel(int id);
	
	/***
	 * 查询部门报损信息
	 * @param branchid
	 * @return
	 */
	public Tb_branchDamage queryBanchDamage(int branchid) ;
}
