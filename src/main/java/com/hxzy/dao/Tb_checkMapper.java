package com.hxzy.dao;

import com.hxzy.pojo.Tb_check;
import com.hxzy.pojo.Tb_checkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_checkMapper {
    long countByExample(Tb_checkExample example);

    int deleteByExample(Tb_checkExample example);

    int deleteByPrimaryKey(Integer stockid);

    int insert(Tb_check record);

    int insertSelective(Tb_check record);

    List<Tb_check> selectByExample(Tb_checkExample example);

    Tb_check selectByPrimaryKey(Integer stockid);

    int updateByExampleSelective(@Param("record") Tb_check record, @Param("example") Tb_checkExample example);

    int updateByExample(@Param("record") Tb_check record, @Param("example") Tb_checkExample example);

    int updateByPrimaryKeySelective(Tb_check record);

    int updateByPrimaryKey(Tb_check record);
}