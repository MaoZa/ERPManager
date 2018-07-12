package com.hxzy.service;

import java.util.List;

import com.hxzy.pojo.Tb_provider;

public interface ProviderService {
	public List<Tb_provider> providerQuery();
	public void providerDel();
	public void providerAdd();
	public void providerQModify();
}
