package com.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.ObjectUtils.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Menus;
import com.demo.bean.Sorts;
import com.demo.service.api.MenusAndSortService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping(value = "menus")
public class MenusAndSortController {
	
	@Autowired
	MenusAndSortService meunService;

	@RequestMapping(value="meunsSelect",method = RequestMethod.GET)
	public Map<String, Object> selectMenus() {
		Map<String, Object> result = new HashMap<String,Object>();
		List<Menus> menus = meunService.selectMenus();
		result.put("status", "success");
		result.put("msg", menus);
		
		return result;
	}
	@RequestMapping(value="sortByMenuId",method = RequestMethod.POST)
	public Map<String, Object> selectSorts(@RequestBody JSONObject jsonObject) {
		Map<String, Object> result = new HashMap<String,Object>();
		 
		if (jsonObject.containsKey("menuId")) {
			List<Sorts> sorts=	meunService.selectSortsByMenuId(jsonObject.getInt("menuId"));	
			result.put("status", "success");
			result.put("msg", sorts);
		}
		
		
		return result;
	
	}
	@RequestMapping(value ="allSorts",method = RequestMethod.GET)
	public Map<String, Object> selectedAllSorts(){
		Map<String, Object> result = new HashMap<String,Object>();	
		List<Sorts> sorts =meunService.selectAllSorts();
		result.put("status", "success");
		result.put("msg", sorts);
		return result;
	}
}
