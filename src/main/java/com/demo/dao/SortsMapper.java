package com.demo.dao;

import com.demo.bean.Sorts;
import com.demo.bean.SortsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SortsMapper {
    int countByExample(SortsExample example);

    int deleteByExample(SortsExample example);

    int deleteByPrimaryKey(Integer sortId);

    int insert(Sorts record);

    int insertSelective(Sorts record);

    List<Sorts> selectByExampleWithBLOBs(SortsExample example);

    List<Sorts> selectByExample(SortsExample example);

    Sorts selectByPrimaryKey(Integer sortId);

    int updateByExampleSelective(@Param("record") Sorts record, @Param("example") SortsExample example);

    int updateByExampleWithBLOBs(@Param("record") Sorts record, @Param("example") SortsExample example);

    int updateByExample(@Param("record") Sorts record, @Param("example") SortsExample example);

    int updateByPrimaryKeySelective(Sorts record);

    int updateByPrimaryKeyWithBLOBs(Sorts record);

    int updateByPrimaryKey(Sorts record);
}