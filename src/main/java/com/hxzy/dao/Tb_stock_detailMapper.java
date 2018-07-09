package com.hxzy.dao;

import com.hxzy.pojo.Tb_stock_detail;
import com.hxzy.pojo.Tb_stock_detailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_stock_detailMapper {
    long countByExample(Tb_stock_detailExample example);

    int deleteByExample(Tb_stock_detailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_stock_detail record);

    int insertSelective(Tb_stock_detail record);

    List<Tb_stock_detail> selectByExample(Tb_stock_detailExample example);

    Tb_stock_detail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_stock_detail record, @Param("example") Tb_stock_detailExample example);

    int updateByExample(@Param("record") Tb_stock_detail record, @Param("example") Tb_stock_detailExample example);

    int updateByPrimaryKeySelective(Tb_stock_detail record);

    int updateByPrimaryKey(Tb_stock_detail record);
}