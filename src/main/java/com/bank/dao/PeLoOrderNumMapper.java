package com.bank.dao;

import com.bank.bean.PeLoOrderNum;
import com.bank.bean.PeLoOrderNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeLoOrderNumMapper {
    long countByExample(PeLoOrderNumExample example);

    int deleteByExample(PeLoOrderNumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PeLoOrderNum record);

    int insertSelective(PeLoOrderNum record);

    List<PeLoOrderNum> selectByExample(PeLoOrderNumExample example);

    PeLoOrderNum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PeLoOrderNum record, @Param("example") PeLoOrderNumExample example);

    int updateByExample(@Param("record") PeLoOrderNum record, @Param("example") PeLoOrderNumExample example);

    int updateByPrimaryKeySelective(PeLoOrderNum record);

    int updateByPrimaryKey(PeLoOrderNum record);
}