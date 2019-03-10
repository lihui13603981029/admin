package com.demo.dao;

import com.demo.bean.Menus;
import com.demo.bean.MenusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenusMapper {
    int countByExample(MenusExample example);

    int deleteByExample(MenusExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(Menus record);

    int insertSelective(Menus record);

    List<Menus> selectByExampleWithBLOBs(MenusExample example);

    List<Menus> selectByExample(MenusExample example);

    Menus selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") Menus record, @Param("example") MenusExample example);

    int updateByExampleWithBLOBs(@Param("record") Menus record, @Param("example") MenusExample example);

    int updateByExample(@Param("record") Menus record, @Param("example") MenusExample example);

    int updateByPrimaryKeySelective(Menus record);

    int updateByPrimaryKeyWithBLOBs(Menus record);

    int updateByPrimaryKey(Menus record);
}