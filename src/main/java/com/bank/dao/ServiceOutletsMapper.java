package com.bank.dao;

import com.bank.bean.ServiceOutlets;
import com.bank.bean.ServiceOutletsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;


public interface ServiceOutletsMapper {
    long countByExample(ServiceOutletsExample example);

    int deleteByExample(ServiceOutletsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ServiceOutlets record);

    int insertSelective(ServiceOutlets record);

    List<ServiceOutlets> selectByExample(ServiceOutletsExample example);

    ServiceOutlets selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ServiceOutlets record, @Param("example") ServiceOutletsExample example);

    int updateByExample(@Param("record") ServiceOutlets record, @Param("example") ServiceOutletsExample example);

    int updateByPrimaryKeySelective(ServiceOutlets record);

    int updateByPrimaryKey(ServiceOutlets record);
}