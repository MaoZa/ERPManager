package com.hxzy.service;

public interface LoanService {
	/***
	 * 查询库存中的物资信息
	 */
	public void loanadd_request();
	/***
	 * 物资借出
	 */
	public void loanadd();
	/***
	 * 借出审核
	 */
	public void approveloan();
	/***
	 * 借出归还
	 */
	public void backloan();
}
