package com.bank.dao;

import com.bank.bean.MessageBoard;
import com.bank.bean.MessageBoardExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;



public interface MessageBoardMapper {
    long countByExample(MessageBoardExample example);

    int deleteByExample(MessageBoardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MessageBoard record);

    int insertSelective(MessageBoard record);

    List<MessageBoard> selectByExample(MessageBoardExample example);

    MessageBoard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MessageBoard record, @Param("example") MessageBoardExample example);

    int updateByExample(@Param("record") MessageBoard record, @Param("example") MessageBoardExample example);

    int updateByPrimaryKeySelective(MessageBoard record);

    int updateByPrimaryKey(MessageBoard record);
    
    //分页查询数据
    List<MessageBoard> queryData(Map<String,Integer> map);
     
    //查询数据总数
    int queryCount();
    
    //
    int countMessageIndexData(String format);
    
    //批量删除留言
    void deleteMessageBoardById(@Param("ids") List<Integer> ids);

	int countMessageStatusIndexData(int i);

	int countMessageIndexData__Everyday(String format);
}