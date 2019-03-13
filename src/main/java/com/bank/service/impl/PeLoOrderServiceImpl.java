package com.bank.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bean.PeLoOrder;
import com.bank.bean.PeLoOrderExample;
import com.bank.bean.PeLoOrderExample.Criteria;
import com.bank.dao.PeLoOrderMapper;
import com.bank.service.PeLoOrderService;

@Service
public class PeLoOrderServiceImpl implements PeLoOrderService {
	
	@Autowired
	PeLoOrderMapper peloordermapper;


	@Override
	public List<PeLoOrder> getAll() {
		// TODO Auto-generated method stub
		return peloordermapper.selectByExample(null);
	}


	@Override
	public List<PeLoOrder> getAllWhenPloDateBefore() {
		
		PeLoOrderExample example = new PeLoOrderExample();    
		Criteria criteria = example.createCriteria();   
		Date date=new Date();
		//SimpleDateFormat df1 =new SimpleDateFormat("yyyy-MM-dd");
		
		//tring nowdate=String.valueOf(df1.format(date));
		
		
		criteria.andPeloordateGreaterThan(date);
		//criteria.andPeloorda
	//	criteria.andUsernameIsNull();    
		//example.setOrderByClause("username asc,email desc");  
		// TODO Auto-generated method stub
		return peloordermapper.selectByExample(example);
	}


	@Override
	public PeLoOrder getPeLoOrderById(Integer id) {
		// TODO Auto-generated method stub
		return peloordermapper.selectByPrimaryKey(id);
	}


	@Override
	public int countPeLoOrderIndexData(String format) {
		// TODO Auto-generated method stub
		return peloordermapper.countPeLoOrderIndexData(format);
	}


	@Override
	public int countPeLoOrderIndexData_All() {
		// TODO Auto-generated method stub
		return peloordermapper.countPeLoOrderIndexData_All();
	}

}
