package com.hxzy.service;

public interface IfDealService {
	public void stockIf();
	
	
	/***
	 * 采购详细信息查询
	 */
	public void stockDetail();
	/***
	 * “入库审核”时调用的查询
	 */
	public void inStockIf();
	/***
	 * “入库查询”时调用的查询
	 */
	public void inStorageSQuery();
	/***
	 * “借出审核”时调用的查询
	 */
	public void loanApproveQuery();
	/***
	 * “借出归还”时调用的查询
	 */
	public void loanBackQuery();
	/***
	 * 借出查询
	 */
	public void loanQuery();
	/***
	 * 借出详细信息查询
	 */
	public void loanDetail();
	/***
	 * 部门报损查询
	 */
	public void damageQuery();
	/***
	 * 部门领用查询
	 */
	public void getuseQuery();
	/***
	 * 部门领用汇总查询
	 */
	public void getuseTotal();
	/***
	 * 部门报损汇总查询
	 */
	public void damageTotal();
	/***
	 * 部门汇总查询
	 */
	public void branchTotal();
}
