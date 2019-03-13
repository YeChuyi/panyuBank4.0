package com.bank.controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.service.MessageBoardService;
import com.bank.service.PeLoOrderService;
import com.bank.service.UserPersonalService;

/**
 * 首页数据的加载
 * @author 雨中林。
 *
 */
@Controller
public class IndexController {
	@Autowired
	UserPersonalService userPersonalService;
	
	@Autowired
	MessageBoardService messageBoardService;
    
	@Autowired
	PeLoOrderService peLoPeLoOrderService;
	
	
	@RequestMapping("/IndexData")
	public @ResponseBody String IndexData(HttpServletRequest request) throws UnsupportedEncodingException {
	    
		
		//获取当前日期
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		
		//json数组
		JSONArray date_Array = new JSONArray();
		JSONArray countUser_Array = new JSONArray();
		JSONArray countMessage_Array = new JSONArray();
		JSONArray countPeLoOrder_Array = new JSONArray();
		
		
	for (int i = 6; i >= 0; i--) {
			
			//根据日期，调用方法，计算每日新增-用户

			int countUser = userPersonalService.countUserIndexData_Everyday(df.format(new Date(date.getTime() - (long)i * 24 * 60 * 60 * 1000)));
			
			//根据日期，调用方法，计算每日新增-留言

			int countMessage = messageBoardService.countMessageIndexData_Everyday(df.format(new Date(date.getTime() - (long)i * 24 * 60 * 60 * 1000)));

			//根据日期，调用方法，计算每日新增-个贷预约

			int countPeLoOrder = peLoPeLoOrderService.countPeLoOrderIndexData(df.format(new Date(date.getTime() - (long)i * 24 * 60 * 60 * 1000)));
			
			date_Array.put(df.format(new Date(date.getTime() - (long)i * 24 * 60 * 60 * 1000)));	//压入到，日期json数组
			countUser_Array.put(countUser);		//压入到，用户量json数组
			countMessage_Array.put(countMessage);		//压入到，留言量json数组
			countPeLoOrder_Array.put(countPeLoOrder);		//压入到，每日预约json数组

		}
		
	//调用方法，统计留言板已读/未读消息

	int countMessageYes = messageBoardService.countMessageStatusIndexData(1);
	int countMessageNo = messageBoardService.countMessageStatusIndexData(0);

	
	
	
	
	
    //打印测试
//	System.out.println("date_Array的数据："+date_Array);
//	System.out.println("countUser_Array的数据："+countUser_Array);
//	System.out.println("countMessage_Array的数据："+countMessage_Array);
//	System.out.println("countMessageYes的数据："+countMessageYes);
//	System.out.println("countMessageNo的数据："+countMessageNo);
//	System.out.println("countPeLoOrder_Array的数据："+countPeLoOrder_Array);

	//输出到前端

	org.json.JSONObject jsonObject=new org.json.JSONObject();	//声明一个json对象
	jsonObject.put("date_Array",date_Array);	//日期数组，压入json对象
	jsonObject.put("countUser_Array",countUser_Array);	//用户量数组，压入json对象
	jsonObject.put("countMessage_Array",countMessage_Array);	//留言量数组，压入json对象
	jsonObject.put("countMessageYes",countMessageYes);	//已读留言，压入json对象
	jsonObject.put("countMessageNo",countMessageNo);	//未读留言，压入json对象
	jsonObject.put("countPeLoOrder_Array",countPeLoOrder_Array);	//每日预约，压入json对象
	
	return jsonObject.toString();
		
	}
		
	

}
