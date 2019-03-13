package com.bank.dao;

import com.bank.bean.IP;
import com.bank.bean.IPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IPMapper {
    long countByExample(IPExample example);

    int deleteByExample(IPExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IP record);

    int insertSelective(IP record);

    List<IP> selectByExample(IPExample example);

    IP selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IP record, @Param("example") IPExample example);

    int updateByExample(@Param("record") IP record, @Param("example") IPExample example);

    int updateByPrimaryKeySelective(IP record);

    int updateByPrimaryKey(IP record);
}