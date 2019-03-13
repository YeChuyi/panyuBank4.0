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
 * ��ҳ���ݵļ���
 * @author �����֡�
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
	    
		
		//��ȡ��ǰ����
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		
		//json����
		JSONArray date_Array = new JSONArray();
		JSONArray countUser_Array = new JSONArray();
		JSONArray countMessage_Array = new JSONArray();
		JSONArray countPeLoOrder_Array = new JSONArray();
		
		
	for (int i = 6; i >= 0; i--) {
			
			//�������ڣ����÷���������ÿ������-�û�

			int countUser = userPersonalService.countUserIndexData_Everyday(df.format(new Date(date.getTime() - (long)i * 24 * 60 * 60 * 1000)));
			
			//�������ڣ����÷���������ÿ������-����

			int countMessage = messageBoardService.countMessageIndexData_Everyday(df.format(new Date(date.getTime() - (long)i * 24 * 60 * 60 * 1000)));

			//�������ڣ����÷���������ÿ������-����ԤԼ

			int countPeLoOrder = peLoPeLoOrderService.countPeLoOrderIndexData(df.format(new Date(date.getTime() - (long)i * 24 * 60 * 60 * 1000)));
			
			date_Array.put(df.format(new Date(date.getTime() - (long)i * 24 * 60 * 60 * 1000)));	//ѹ�뵽������json����
			countUser_Array.put(countUser);		//ѹ�뵽���û���json����
			countMessage_Array.put(countMessage);		//ѹ�뵽��������json����
			countPeLoOrder_Array.put(countPeLoOrder);		//ѹ�뵽��ÿ��ԤԼjson����

		}
		
	//���÷�����ͳ�����԰��Ѷ�/δ����Ϣ

	int countMessageYes = messageBoardService.countMessageStatusIndexData(1);
	int countMessageNo = messageBoardService.countMessageStatusIndexData(0);

	
	
	
	
	
    //��ӡ����
//	System.out.println("date_Array�����ݣ�"+date_Array);
//	System.out.println("countUser_Array�����ݣ�"+countUser_Array);
//	System.out.println("countMessage_Array�����ݣ�"+countMessage_Array);
//	System.out.println("countMessageYes�����ݣ�"+countMessageYes);
//	System.out.println("countMessageNo�����ݣ�"+countMessageNo);
//	System.out.println("countPeLoOrder_Array�����ݣ�"+countPeLoOrder_Array);

	//�����ǰ��

	org.json.JSONObject jsonObject=new org.json.JSONObject();	//����һ��json����
	jsonObject.put("date_Array",date_Array);	//�������飬ѹ��json����
	jsonObject.put("countUser_Array",countUser_Array);	//�û������飬ѹ��json����
	jsonObject.put("countMessage_Array",countMessage_Array);	//���������飬ѹ��json����
	jsonObject.put("countMessageYes",countMessageYes);	//�Ѷ����ԣ�ѹ��json����
	jsonObject.put("countMessageNo",countMessageNo);	//δ�����ԣ�ѹ��json����
	jsonObject.put("countPeLoOrder_Array",countPeLoOrder_Array);	//ÿ��ԤԼ��ѹ��json����
	
	return jsonObject.toString();
		
	}
		
	

}
