package com.bank.dao;

import com.bank.bean.PageDescription;
import com.bank.bean.PageDescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PageDescriptionMapper {
    long countByExample(PageDescriptionExample example);

    int deleteByExample(PageDescriptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PageDescription record);

    int insertSelective(PageDescription record);

    List<PageDescription> selectByExample(PageDescriptionExample example);

    PageDescription selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PageDescription record, @Param("example") PageDescriptionExample example);

    int updateByExample(@Param("record") PageDescription record, @Param("example") PageDescriptionExample example);

    int updateByPrimaryKeySelective(PageDescription record);

    int updateByPrimaryKey(PageDescription record);
}