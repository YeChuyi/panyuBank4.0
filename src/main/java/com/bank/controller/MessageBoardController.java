package com.bank.controller;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.bank.bean.MessageBoard;
import com.bank.bean.ResponseData;
import com.bank.service.MessageBoardService;

@Controller
public class MessageBoardController {
	@Autowired
	MessageBoardService messageBoardService;
	
	@RequestMapping(value="/ReplyMessageBoard",method=RequestMethod.PUT)
	public String saveEmp(MessageBoard messageBoard){
		System.out.println("将要更新的留言数据数据:"+ messageBoard);
		System.out.println(messageBoard);
		
		messageBoardService.ReplyMessageBoard(messageBoard);
		
		return "redirect:/Speak";
		
	}
	
	@RequestMapping(value="/GetMessageBoardNoReply",method = RequestMethod.GET)
	@ResponseBody
	public ResponseData getMessageBoardNoReply(@RequestParam(value = "page")String page,
			@RequestParam(value = "limit")String  limit){
		Integer pages=Integer.valueOf(page);
		Integer limits=Integer.valueOf(limit);
		
		return messageBoardService.getMessageBoardNoReply(pages,limits);
		
	}
	
	
	@RequestMapping("/DeleteMessageBoard")
	public @ResponseBody String DeleteMessageBoard(HttpServletRequest request) throws UnsupportedEncodingException {
		String[] ids = request.getParameterValues("id");
	
		messageBoardService.deteleMessageBoardById(ids);
		org.json.JSONObject jsonObject=new org.json.JSONObject();
		jsonObject.put("status",1);
		//JSONObject json = new JSONObject();
		return jsonObject.toString();
		
		
	}
	
}
