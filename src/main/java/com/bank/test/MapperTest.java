package com.bank.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bank.bean.Admin;
import com.bank.bean.PeLoOrder;
import com.bank.bean.PeLoOrderExample;
import com.bank.dao.AdminMapper;
import com.bank.dao.PeLoOrderMapper;
import com.bank.service.MessageBoardService;
import com.bank.service.PeLoOrderService;
import com.bank.service.UserPersonalService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	@Autowired
    PeLoOrderMapper plomapper;
	
	@Autowired
	PeLoOrderService peloorderservice;
	
	@Autowired
	MessageBoardService messageboardservice;
	
	@Autowired
	UserPersonalService userpersonalService;
	
	@Autowired
	PeLoOrderService peLoPeLoOrderService;

	@Autowired
	AdminMapper adminmapper;
	@Autowired
	SqlSession sqlSession;
	
	@Test
	public void testCRUD(){
		//System.out.println(peloordermapper);
		
		Admin admin1 =adminmapper.findByAdmin("admin", "123456");
		//Admin admin=adminmapper.selectByPrimaryKey(1);
		System.out.println(admin1.getAdminuser());
		
		//List<PeLoOrder> peloorder=peloorderservice.getAll();
		
		List<PeLoOrder> peloorder2=peloorderservice.getAllWhenPloDateBefore();
		
		
		for (PeLoOrder peLoOrder : peloorder2) {
			System.out.println(peLoOrder);
		}
		//System.out.println(admin.getAdminuser());
		
		
	}
	
	@Test
	public void CountMessageIndexData(){
		
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		int countMessage=0;
		int countUser=0;
		int countPeLoOrder=0;
		for (int i = 6; i >= 0; i--) {
		 countMessage = messageboardservice.countMessageIndexData_Everyday(df.format(new Date(date.getTime() - (long)i * 24 * 60 * 60 * 1000)));
		
		 countUser = userpersonalService.countUserIndexData_Everyday(df.format(new Date(date.getTime() - (long)i * 24 * 60 * 60 * 1000)));
		
		 countPeLoOrder = peLoPeLoOrderService.countPeLoOrderIndexData(df.format(new Date(date.getTime() - (long)i * 24 * 60 * 60 * 1000)));
		}
		System.out.println("countMessage:"+countMessage);
		System.out.println("countUser:"+ countUser);
		System.out.println("countPeLoOrder:"+countPeLoOrder);
	}
	@Test
	public void TestIndeData(){
		 //获取当前时间
			Date date = new Date();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			
	        //根据当前时间，获取用户总量
			int countUser = userpersonalService.countUserIndexData(df.format(date));
			System.out.println(countUser);
			
			//获取有效预约,即未过期的个贷预约总量
	        int countPeLoOrder_All=peloorderservice.countPeLoOrderIndexData_All();
	         System.out.println(countPeLoOrder_All);
	         
	         
			//根据当前时间，获取留言板总量
			int countMessage = messageboardservice.countMessageIndexData(df.format(date));
			System.out.println(countMessage);
			
			//调用方法，统计留言板已读/未读消息
			int countMessageYes = messageboardservice.countMessageStatusIndexData(1);
			System.out.println(countMessageYes);
			
			int countMessageNo = messageboardservice.countMessageStatusIndexData(0);
			System.out.println(countMessageNo);
	}
	
	

}
