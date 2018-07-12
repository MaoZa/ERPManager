package com.hxzy.service;

import com.hxzy.pojo.Tb_goods;

public interface InstorageService {

	/***
	 * 选择指定物资信息后的查询
	 * @param goodsid
	 * @return Tb_goods
	 */
	public Tb_goods queryGoods(int goodsid);
	
	/***
	 * 保存采购单信息
	 * @param List<Tb_goods> list
	 * @return int
	 */
	public int stockadd() ;
	
	/***
	 * 审核入库
	 * @param stockDetailId,list
	 * @return
	 */
	public int eligible();
	
	/***
	 * 审核不合格处理
	 * @return
	 */
	public int uneligible();
	
}
