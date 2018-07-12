package com.hxzy.service;

import java.util.List;

import com.hxzy.pojo.Tb_goods;

public interface GoodsService {

	/***
	 * 根据ifdel查询所有符合条件的
	 * @param val
	 * @return
	 */
	List<Tb_goods> goodsQuery(int val);
	
	/***
	 * 插入goods信息
	 * @param goods
	 * @return
	 */
	public int goodsAdd(Tb_goods goods);
	
	public void goodsModiQuery();
	
	/***
	 * 修改goods ifdel字段 (物资删除与恢复)
	 * @param id
	 * @param ifdel
	 * @return
	 */
	public int goodsModifyIfdel(int id, Byte ifdel);
	
	public void goodsdel();
	
	/***
	 * 根据id查询当个goods信息
	 * @param id
	 * @return
	 */
	public Tb_goods goodsQueryOne(int id);
	
	/***
	 * 修改goods信息
	 * @param goods
	 * @return
	 */
	int goodsModify(Tb_goods goods);
}
