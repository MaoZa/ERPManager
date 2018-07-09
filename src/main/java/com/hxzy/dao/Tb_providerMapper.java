package com.hxzy.dao;

import com.hxzy.pojo.Tb_provider;
import com.hxzy.pojo.Tb_providerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_providerMapper {
    long countByExample(Tb_providerExample example);

    int deleteByExample(Tb_providerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_provider record);

    int insertSelective(Tb_provider record);

    List<Tb_provider> selectByExample(Tb_providerExample example);

    Tb_provider selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_provider record, @Param("example") Tb_providerExample example);

    int updateByExample(@Param("record") Tb_provider record, @Param("example") Tb_providerExample example);

    int updateByPrimaryKeySelective(Tb_provider record);

    int updateByPrimaryKey(Tb_provider record);
}