package com.hxzy.dao;

import com.hxzy.pojo.Tb_instorage;
import com.hxzy.pojo.Tb_instorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_instorageMapper {
    long countByExample(Tb_instorageExample example);

    int deleteByExample(Tb_instorageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_instorage record);

    int insertSelective(Tb_instorage record);

    List<Tb_instorage> selectByExample(Tb_instorageExample example);

    Tb_instorage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_instorage record, @Param("example") Tb_instorageExample example);

    int updateByExample(@Param("record") Tb_instorage record, @Param("example") Tb_instorageExample example);

    int updateByPrimaryKeySelective(Tb_instorage record);

    int updateByPrimaryKey(Tb_instorage record);
}