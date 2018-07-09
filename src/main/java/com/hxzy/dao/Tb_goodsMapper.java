package com.hxzy.dao;

import com.hxzy.pojo.Tb_goods;
import com.hxzy.pojo.Tb_goodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_goodsMapper {
    long countByExample(Tb_goodsExample example);

    int deleteByExample(Tb_goodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_goods record);

    int insertSelective(Tb_goods record);

    List<Tb_goods> selectByExample(Tb_goodsExample example);

    Tb_goods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_goods record, @Param("example") Tb_goodsExample example);

    int updateByExample(@Param("record") Tb_goods record, @Param("example") Tb_goodsExample example);

    int updateByPrimaryKeySelective(Tb_goods record);

    int updateByPrimaryKey(Tb_goods record);
}