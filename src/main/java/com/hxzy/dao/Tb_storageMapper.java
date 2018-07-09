package com.hxzy.dao;

import com.hxzy.pojo.Tb_storage;
import com.hxzy.pojo.Tb_storageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_storageMapper {
    long countByExample(Tb_storageExample example);

    int deleteByExample(Tb_storageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_storage record);

    int insertSelective(Tb_storage record);

    List<Tb_storage> selectByExample(Tb_storageExample example);

    Tb_storage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_storage record, @Param("example") Tb_storageExample example);

    int updateByExample(@Param("record") Tb_storage record, @Param("example") Tb_storageExample example);

    int updateByPrimaryKeySelective(Tb_storage record);

    int updateByPrimaryKey(Tb_storage record);
}