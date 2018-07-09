package com.hxzy.dao;

import com.hxzy.pojo.Tb_getuse;
import com.hxzy.pojo.Tb_getuseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_getuseMapper {
    long countByExample(Tb_getuseExample example);

    int deleteByExample(Tb_getuseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_getuse record);

    int insertSelective(Tb_getuse record);

    List<Tb_getuse> selectByExample(Tb_getuseExample example);

    Tb_getuse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_getuse record, @Param("example") Tb_getuseExample example);

    int updateByExample(@Param("record") Tb_getuse record, @Param("example") Tb_getuseExample example);

    int updateByPrimaryKeySelective(Tb_getuse record);

    int updateByPrimaryKey(Tb_getuse record);
}