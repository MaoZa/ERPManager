package com.hxzy.dao;

import com.hxzy.pojo.Tb_loan;
import com.hxzy.pojo.Tb_loanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_loanMapper {
    long countByExample(Tb_loanExample example);

    int deleteByExample(Tb_loanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_loan record);

    int insertSelective(Tb_loan record);

    List<Tb_loan> selectByExample(Tb_loanExample example);

    Tb_loan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_loan record, @Param("example") Tb_loanExample example);

    int updateByExample(@Param("record") Tb_loan record, @Param("example") Tb_loanExample example);

    int updateByPrimaryKeySelective(Tb_loan record);

    int updateByPrimaryKey(Tb_loan record);
}