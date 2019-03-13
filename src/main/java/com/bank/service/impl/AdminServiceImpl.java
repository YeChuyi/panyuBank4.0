package com.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.AdminMapper;
import com.bank.bean.Admin;
import com.bank.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService {
	 @Autowired
     AdminMapper adminmapper;

	@Override
	public Admin checkLogin(String adminuser, String adminpassword) {
		Admin admin=adminmapper.findByAdmin(adminuser, adminpassword);
		if(admin!=null){
			return admin;
		}
		return null;
	}
}
