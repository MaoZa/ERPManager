package com.hxzy.dao;

import com.hxzy.pojo.Tb_branch;
import com.hxzy.pojo.Tb_branchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_branchMapper {
    long countByExample(Tb_branchExample example);

    int deleteByExample(Tb_branchExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_branch record);

    int insertSelective(Tb_branch record);

    List<Tb_branch> selectByExample(Tb_branchExample example);

    Tb_branch selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_branch record, @Param("example") Tb_branchExample example);

    int updateByExample(@Param("record") Tb_branch record, @Param("example") Tb_branchExample example);

    int updateByPrimaryKeySelective(Tb_branch record);

    int updateByPrimaryKey(Tb_branch record);
}