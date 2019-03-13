package com.bank.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.bean.MessageBoard;
import com.bank.bean.MessageBoardExample;
import com.bank.bean.MessageBoardExample.Criteria;
import com.bank.bean.PeLoOrderExample;
import com.bank.bean.ResponseData;
import com.bank.dao.MessageBoardMapper;
import com.bank.service.MessageBoardService;

@Service
public class MessageBoardServiceImpl implements MessageBoardService {
     
	@Autowired
	MessageBoardMapper messageBoardMapper;
	

	
	/**
	 * 获取未回复信息的留言
	 */


	/**
	 * 获取未回复信息的留言
	 */
	@Override
	@Transactional(readOnly = true)//page默认是从1开始的
	public ResponseData getMessageBoardNoReply(int page, int limit) {
		   // System.out.println("进入MessageBoardService层的queryData方法**************************************************************************************************");
	        ResponseData rd=new ResponseData();
	        List<MessageBoard> MessageBoardList;

	     //   System.out.println("page的值："+page+"****************************************************************************************************************");
	        page=(page-1)*limit;
	     //   System.out.println("page变换之后的值："+page+"****************************************************************************************************************");
	     //   System.out.println("limit的值："+limit+"***************************************************************************************************************");
	        try {
	            rd.setCode("0");
	            int num=messageBoardMapper.queryCount();
	        //    System.out.println("num的值为：" + num + "*****************************************************************************************************");
	            String snum=num+"";
	            rd.setCount(snum);//获取记录总数
	            Map<String,Integer> map = new HashMap<>();
	            map.put("page",page);//从第几页开始
	            map.put("limit",limit);//每页显示多少条记录
	            MessageBoardList = messageBoardMapper.queryData(map);
	        
	            rd.setData(MessageBoardList);
	            rd.setMsg("请求成功");
	        }catch(Exception ex){
	            ex.printStackTrace();
	        }
	        return rd;
	    }



	@Override
	public void deteleMessageBoardById(String[] id) {
		List<Integer> ids=new ArrayList<Integer>();
		for (String p : id) {
			  ids.add(Integer.valueOf(p));
		}
		 messageBoardMapper.deleteMessageBoardById(ids);;
	}



	@Override
	public MessageBoard getMessageBoardById(Integer ids) {
		// TODO Auto-generated method stub
		return messageBoardMapper.selectByPrimaryKey(ids);
	}



	@Override
	public void ReplyMessageBoard(MessageBoard messageBoard) {
		// TODO Auto-generated method stub
		messageBoard.setStatus(1);  //将状态改为 1。变成已回复
		messageBoardMapper.updateByPrimaryKeySelective(messageBoard);
		
	}



	@Override
	public int countMessageIndexData_Everyday(String format) {

		//MessageBoardExample example = new MessageBoardExample();    
		//Criteria criteria = example.createCriteria();  
	
		return messageBoardMapper.countMessageIndexData__Everyday(format);
	}



	@Override
	public int countMessageStatusIndexData(int i) {
		// TODO Auto-generated method stub
		return messageBoardMapper.countMessageStatusIndexData(i);
	}



	@Override
	public int countMessageIndexData(String format) {
		// TODO Auto-generated method stub
		return messageBoardMapper.countMessageIndexData(format);
	}

	}


