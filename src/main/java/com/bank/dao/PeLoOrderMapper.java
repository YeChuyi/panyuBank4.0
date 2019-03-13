package com.bank.dao;

import com.bank.bean.PeLoOrder;
import com.bank.bean.PeLoOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeLoOrderMapper {
    long countByExample(PeLoOrderExample example);

    int deleteByExample(PeLoOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PeLoOrder record);

    int insertSelective(PeLoOrder record);

    List<PeLoOrder> selectByExample(PeLoOrderExample example);

    PeLoOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PeLoOrder record, @Param("example") PeLoOrderExample example);

    int updateByExample(@Param("record") PeLoOrder record, @Param("example") PeLoOrderExample example);

    int updateByPrimaryKeySelective(PeLoOrder record);

    int updateByPrimaryKey(PeLoOrder record);

	int countPeLoOrderIndexData(String format);

	int countPeLoOrderIndexData_All();
}