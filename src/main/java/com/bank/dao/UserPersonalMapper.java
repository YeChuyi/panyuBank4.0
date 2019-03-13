package com.bank.dao;

import com.bank.bean.UserPersonal;
import com.bank.bean.UserPersonalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPersonalMapper {
    long countByExample(UserPersonalExample example);

    int deleteByExample(UserPersonalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserPersonal record);

    int insertSelective(UserPersonal record);

    List<UserPersonal> selectByExample(UserPersonalExample example);

    UserPersonal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserPersonal record, @Param("example") UserPersonalExample example);

    int updateByExample(@Param("record") UserPersonal record, @Param("example") UserPersonalExample example);

    int updateByPrimaryKeySelective(UserPersonal record);

    int updateByPrimaryKey(UserPersonal record);

	int countUserIndexData_Everyday(String format);

	int countUserIndexData(String format);
}