package com.hxzy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxzy.dao.Tb_branchMapper;
import com.hxzy.pojo.Tb_branch;
import com.hxzy.pojo.Tb_branchDamage;
import com.hxzy.service.BranchService;

@Service
public class BranchServiceImpl implements BranchService {

	@Autowired
	private Tb_branchMapper tb_branchMapper;
	
	@Override
	public List<Tb_branch> branchQuery() {
		return tb_branchMapper.selectByExample(null);
	}

	@Override
	public int branchAdd(Tb_branch branch) {
		return tb_branchMapper.insert(branch);
	}

	@Override
	public int branchDel(int id) {
		return tb_branchMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Tb_branchDamage queryBanchDamage(int branchid) {
		return tb_branchMapper.queryBranchDamage(branchid);
	}


}
