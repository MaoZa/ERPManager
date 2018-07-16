package com.hxzy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxzy.dao.Tb_goodsMapper;
import com.hxzy.dao.Tb_stock_detailMapper;
import com.hxzy.dao.Tb_stock_mainMapper;
import com.hxzy.pojo.CartDemo;
import com.hxzy.pojo.Tb_goods;
import com.hxzy.pojo.Tb_stock_detail;
import com.hxzy.pojo.Tb_stock_main;
import com.hxzy.pojo.Tb_stock_mainExample;
import com.hxzy.service.InstorageService;

@Service
public class InstorageServiceImpl implements InstorageService {

	@Autowired
	private Tb_goodsMapper tb_goodsMapper;
	@Autowired
	private Tb_stock_mainMapper tb_stock_mainMapper;
	@Autowired
	private Tb_stock_detailMapper tb_stock_detailMapper;
	
	@Override
	public Tb_goods queryGoods(int goodsid) {
		return null;
	}

	@Override
	public int stockadd() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eligible() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int uneligible() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addStockDetail(Integer stockid, CartDemo cartDemo) {
		Tb_stock_detail tDetail = new Tb_stock_detail();
		tDetail.setStockid(stockid);
		tDetail.setGoodsid(cartDemo.getTb_goods().getId());
		tDetail.setNumber(cartDemo.getNumber());
		tDetail.setPrice(Double.parseDouble(cartDemo.getTb_goods().getPrice().toString()));
		return tb_stock_detailMapper.insert(tDetail);
	}

	@Override
	public int addStockMain(Tb_stock_main stock_main) {
		return tb_stock_mainMapper.insert(stock_main);
	}

	@Override
	public List<Tb_stock_main> queryStockByState(int state) {
		Tb_stock_mainExample example = new Tb_stock_mainExample();
		example.createCriteria().andStateEqualTo(state);
		return tb_stock_mainMapper.selectByExample(example);
	}

	@Override
	public List<Tb_stock_main> queryStrockAll() {
		return tb_stock_mainMapper.selectByExample(null);
	}

}
