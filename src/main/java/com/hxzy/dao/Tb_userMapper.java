package com.hxzy.dao;

import com.hxzy.pojo.Tb_user;
import com.hxzy.pojo.Tb_userExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_userMapper {
    long countByExample(Tb_userExample example);

    int deleteByExample(Tb_userExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_user record);

    int insertSelective(Tb_user record);

    List<Tb_user> selectByExample(Tb_userExample example);

    Tb_user selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_user record, @Param("example") Tb_userExample example);

    int updateByExample(@Param("record") Tb_user record, @Param("example") Tb_userExample example);

    int updateByPrimaryKeySelective(Tb_user record);

    int updateByPrimaryKey(Tb_user record);
}