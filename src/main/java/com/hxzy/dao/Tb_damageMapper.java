package com.hxzy.dao;

import com.hxzy.pojo.Tb_damage;
import com.hxzy.pojo.Tb_damageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_damageMapper {
    long countByExample(Tb_damageExample example);

    int deleteByExample(Tb_damageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_damage record);

    int insertSelective(Tb_damage record);

    List<Tb_damage> selectByExample(Tb_damageExample example);

    Tb_damage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_damage record, @Param("example") Tb_damageExample example);

    int updateByExample(@Param("record") Tb_damage record, @Param("example") Tb_damageExample example);

    int updateByPrimaryKeySelective(Tb_damage record);

    int updateByPrimaryKey(Tb_damage record);
}