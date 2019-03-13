package com.bank.service;

import java.util.List;

import com.bank.bean.MessageBoard;
import com.bank.bean.ResponseData;

public interface MessageBoardService {
  public ResponseData getMessageBoardNoReply(int page, int limit);

   public void deteleMessageBoardById(String[] ids);

   public MessageBoard getMessageBoardById(Integer ids);
   
	public void ReplyMessageBoard(MessageBoard messageBoard);

	public int countMessageIndexData_Everyday(String format);

	public int countMessageStatusIndexData(int i);

	public int countMessageIndexData(String format);
}
