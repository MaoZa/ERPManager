package com.hxzy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxzy.dao.Tb_goodsMapper;
import com.hxzy.pojo.Tb_goods;
import com.hxzy.pojo.Tb_goodsExample;
import com.hxzy.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private Tb_goodsMapper tb_goodsMapper;
	
	
	@Override
	public List<Tb_goods> goodsQuery(int val) {
		Tb_goodsExample example = new Tb_goodsExample();
		if(val == 1) {
			example.createCriteria().andIfdelEqualTo(true);
		}else {
			example.createCriteria().andIfdelEqualTo(false);
		}
		return tb_goodsMapper.selectByExample(example);
	}
	
	@Override
	public int goodsAdd(Tb_goods goods) {
		return tb_goodsMapper.insert(goods);
	}

	@Override
	public void goodsModiQuery() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int goodsModifyIfdel(int id, Byte ifdel) {
		Tb_goods goods = goodsQueryOne(id);
		if(ifdel == 1) {
			goods.setIfdel(true);
		}else if(ifdel == 0){
			goods.setIfdel(false);
		}
		return tb_goodsMapper.updateByPrimaryKey(goods);
	}

	@Override
	public void goodsdel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tb_goods goodsQueryOne(int id) {
		return tb_goodsMapper.selectByPrimaryKey(id);
	}

	@Override
	public int goodsModify(Tb_goods goods) {
		return tb_goodsMapper.updateByPrimaryKey(goods);
	}

}
