package com.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.UserPersonalMapper;
import com.bank.service.UserPersonalService;

@Service
public class UserPersonalServiceImpl implements UserPersonalService {
	 @Autowired
     UserPersonalMapper userpersonalmapper;
	@Override
	public int countUserIndexData_Everyday(String format) {
		// TODO Auto-generated method stub
		return userpersonalmapper.countUserIndexData_Everyday(format);
	}
	@Override
	public int countUserIndexData(String format) {
		// TODO Auto-generated method stub
		return userpersonalmapper.countUserIndexData(format);
	}

}
