package com.bank.dao;

import com.bank.bean.PeLoOrFrontWebWords;
import com.bank.bean.PeLoOrFrontWebWordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeLoOrFrontWebWordsMapper {
    long countByExample(PeLoOrFrontWebWordsExample example);

    int deleteByExample(PeLoOrFrontWebWordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PeLoOrFrontWebWords record);

    int insertSelective(PeLoOrFrontWebWords record);

    List<PeLoOrFrontWebWords> selectByExample(PeLoOrFrontWebWordsExample example);

    PeLoOrFrontWebWords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PeLoOrFrontWebWords record, @Param("example") PeLoOrFrontWebWordsExample example);

    int updateByExample(@Param("record") PeLoOrFrontWebWords record, @Param("example") PeLoOrFrontWebWordsExample example);

    int updateByPrimaryKeySelective(PeLoOrFrontWebWords record);

    int updateByPrimaryKey(PeLoOrFrontWebWords record);
}