package com.hxzy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxzy.dao.Tb_providerMapper;
import com.hxzy.pojo.Tb_provider;
import com.hxzy.service.ProviderService;

@Service
public class ProviderServiceImpl implements ProviderService {

	@Autowired
	private Tb_providerMapper tb_providerMapper;
	
	@Override
	public List<Tb_provider> providerQuery() {
		return tb_providerMapper.selectByExample(null);
	}

	@Override
	public void providerDel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void providerAdd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void providerQModify() {
		// TODO Auto-generated method stub
		
	}

}
