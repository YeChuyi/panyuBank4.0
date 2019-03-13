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
	 * ��ȡδ�ظ���Ϣ������
	 */


	/**
	 * ��ȡδ�ظ���Ϣ������
	 */
	@Override
	@Transactional(readOnly = true)//pageĬ���Ǵ�1��ʼ��
	public ResponseData getMessageBoardNoReply(int page, int limit) {
		   // System.out.println("����MessageBoardService���queryData����**************************************************************************************************");
	        ResponseData rd=new ResponseData();
	        List<MessageBoard> MessageBoardList;

	     //   System.out.println("page��ֵ��"+page+"****************************************************************************************************************");
	        page=(page-1)*limit;
	     //   System.out.println("page�任֮���ֵ��"+page+"****************************************************************************************************************");
	     //   System.out.println("limit��ֵ��"+limit+"***************************************************************************************************************");
	        try {
	            rd.setCode("0");
	            int num=messageBoardMapper.queryCount();
	        //    System.out.println("num��ֵΪ��" + num + "*****************************************************************************************************");
	            String snum=num+"";
	            rd.setCount(snum);//��ȡ��¼����
	            Map<String,Integer> map = new HashMap<>();
	            map.put("page",page);//�ӵڼ�ҳ��ʼ
	            map.put("limit",limit);//ÿҳ��ʾ��������¼
	            MessageBoardList = messageBoardMapper.queryData(map);
	        
	            rd.setData(MessageBoardList);
	            rd.setMsg("����ɹ�");
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
		messageBoard.setStatus(1);  //��״̬��Ϊ 1������ѻظ�
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


