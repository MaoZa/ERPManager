package com.hxzy.dao;

import com.hxzy.pojo.Tb_stock_main;
import com.hxzy.pojo.Tb_stock_mainExample;
import com.hxzy.pojo.Tb_stock_main_provider;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_stock_mainMapper {
    long countByExample(Tb_stock_mainExample example);

    int deleteByExample(Tb_stock_mainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_stock_main record);

    int insertSelective(Tb_stock_main record);

    List<Tb_stock_main> selectByExample(Tb_stock_mainExample example);

    Tb_stock_main selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_stock_main record, @Param("example") Tb_stock_mainExample example);

    int updateByExample(@Param("record") Tb_stock_main record, @Param("example") Tb_stock_mainExample example);

    int updateByPrimaryKeySelective(Tb_stock_main record);

    int updateByPrimaryKey(Tb_stock_main record);
    
    List<Tb_stock_main_provider> queryStockProvider(int stockId);
}