package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Menus;
import com.demo.bean.MenusExample;
import com.demo.bean.MenusExample.Criteria;
import com.demo.bean.Sorts;
import com.demo.bean.SortsExample;
import com.demo.dao.MenusMapper;
import com.demo.dao.SortsMapper;
import com.demo.service.api.MenusAndSortService;

@Service
public class MenusAndSortServiceImpl implements MenusAndSortService {

	@Autowired
	MenusMapper menusDao;
	
	@Autowired
	SortsMapper sortsDao;
	/**
	 * 返回的菜单
	 */
	@Override
	public List<Menus> selectMenus() {
		// TODO Auto-generated method stub
		MenusExample example = new MenusExample();
		Criteria criteria = example.createCriteria();
		criteria.andMenuIdIsNotNull();
		List<Menus> menus= menusDao.selectByExample(example);
		return menus;
	}

	/**
	 * 返回对应菜单的子类
	 */
	@Override
	public List<Sorts> selectSortsByMenuId(Integer menuId) {
		// TODO Auto-generated method stub
		SortsExample example = new SortsExample();
		com.demo.bean.SortsExample.Criteria criteria = example.createCriteria();
		criteria.andMenusIdEqualTo(menuId);
		List<Sorts> sorts = sortsDao.selectByExample(example);
		return sorts;
	}

	@Override
	public List<Sorts> selectAllSorts() {
		// TODO Auto-generated method stub
		SortsExample example = new SortsExample();
		com.demo.bean.SortsExample.Criteria criteria = example.createCriteria();
		criteria.andMenusIdNotEqualTo(0);
		List<Sorts> sorts = sortsDao.selectByExample(example);
		return sorts;

	}

}
