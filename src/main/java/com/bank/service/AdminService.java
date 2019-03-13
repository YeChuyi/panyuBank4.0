package com.bank.service;

import com.bank.bean.Admin;

public interface AdminService {
	 Admin checkLogin(String username,String password);
}
