package com.bank.dao;

import com.bank.bean.Admin;
import com.bank.bean.AdminExample;
import java.util.List;

import javax.validation.constraints.Pattern;

import org.apache.ibatis.annotations.Param;


public interface AdminMapper {
	
	Admin findByAdmin(@Param("adminuser") String adminuser,@Param("adminpassword") String adminpassword);
	
    long countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}