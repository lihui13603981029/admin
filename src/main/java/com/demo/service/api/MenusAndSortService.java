package com.demo.service.api;

import java.util.List;

import com.demo.bean.Menus;
import com.demo.bean.Sorts;


public interface MenusAndSortService {
	List<Menus> selectMenus();
	
	List<Sorts> selectSortsByMenuId(Integer menuId);
	
	List<Sorts> selectAllSorts();
	

}
