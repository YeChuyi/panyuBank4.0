package com.bank.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.bean.MessageBoard;
import com.bank.bean.PeLoOrder;
import com.bank.service.MessageBoardService;
import com.bank.service.PeLoOrderService;
import com.bank.service.UserPersonalService;


/**
 * 用于页面跳转的相应
 * @author 雨中林。
 *
 */
@Controller
public class pageController {
	
	@Autowired
	PeLoOrderService peloorderservice;
	
	@Autowired
	MessageBoardService messageBoardService;
	
	@Autowired
	UserPersonalService userPersonalService;
	
	@RequestMapping("index")
	public String index(Map<String, Object> map){
		 //获取当前时间
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
        //根据当前时间，获取用户总量
		int countUser = userPersonalService.countUserIndexData(df.format(date));
	//	System.out.println(countUser);
		
		//获取有效预约,即未过期的个贷预约总量
        int countPeLoOrder_All=peloorderservice.countPeLoOrderIndexData_All();
      // System.out.println(countPeLoOrder_All);
         
         
		//根据当前时间，获取留言板总量
		int countMessage = messageBoardService.countMessageIndexData(df.format(date));
		//System.out.println(countMessage);
		
		//调用方法，统计留言板已读/未读消息
		int countMessageYes = messageBoardService.countMessageStatusIndexData(1);
		//System.out.println(countMessageYes);
		
		int countMessageNo = messageBoardService.countMessageStatusIndexData(0);
		//System.out.println(countMessageNo);
		
		map.put("countUser", countUser);
		map.put("countPeLoOrder_All",countPeLoOrder_All);
		map.put("countMessage", countMessage);
		map.put("countMessageYes", countMessageYes);
		map.put("countMessageNo", countMessageNo);
		return "index";
		
	}
	
	@RequestMapping("/personal")
	public String Personal(Map<String, Object> map){
		List<PeLoOrder> peloorderlist=peloorderservice.getAllWhenPloDateBefore();
		map.put("peloorderlist", peloorderlist);
		return "personal";
		
	}
	
	@RequestMapping("/PersonalDetail")
	public String personalDetail(@RequestParam(value = "id") String id,Map<String, Object> map){
		Integer ids=Integer.valueOf(id);
	   // System.out.println(id);
		PeLoOrder peloorder=peloorderservice.getPeLoOrderById(ids);
		//System.out.println(peloorder.getPeloorname());
		map.put("peloorder", peloorder);
		return "personalDetail";
	}
	
	
	@RequestMapping("/Speak")
	public String Speak(Map<String, Object> map){
		return "speak";
		
	}
	
	@RequestMapping("/SpeakReplied")
	public String SpeakReplied(Map<String, Object> map){
		return "speakReplied";
	}
	
	
	@RequestMapping("/speakReply")
	public String speakReply(@RequestParam(value = "id") String id,Map<String, Object> map){
		Integer ids=Integer.valueOf(id);
		MessageBoard messageBoard=messageBoardService.getMessageBoardById(ids);
		map.put("messageBoard", messageBoard);
		return "speakReply";
	}

}
