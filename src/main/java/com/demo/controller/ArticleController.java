package com.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Article;
import com.demo.bean.ArticleWithBLOBs;
import com.demo.service.api.ArticleService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping(value= "article")
public class ArticleController {
	
	@Autowired
	ArticleService articleService;

	/**
	 * 博文创建和修改
	 * @return
	 */
	@RequestMapping(value="add",method = RequestMethod.POST)
	public Map<String, Object> artilceInsetAndUpdate(@RequestBody JSONObject jsonObject) {
		Map<String, Object> result  =  new HashMap<String,Object>();
		
		result = articleService.addAndUpdateArticle(jsonObject);
		
		return result;
	}
	/**
	 * 删除博文
	 * @return
	 */
	@RequestMapping(value = "delete",method = RequestMethod.POST)
	public Map<String, Object>articleDelete(@RequestBody JSONObject jsonObject){
		Map<String, Object> result = new HashMap<String,Object>();
		String msg = "error";
		int state = articleService.deleteArticle(jsonObject);
		
		if (state == 1) {
			msg = "success";	
		}
		result.put("state", msg);
		
		return result;
	}
	/**
	 * 查询博文
	 * @param jsonObject
	 * @return
	 */
	@RequestMapping(value = "select", method = RequestMethod.POST)
	public Map<String, Object>articleSelect(@RequestBody JSONObject jsonObject){
		Map<String, Object> result = new HashMap<String,Object>();
		String status = "success";
		result = articleService.selectArticles(jsonObject);
				
		result.put("status", status);
		return result;
	}
	@RequestMapping(value = "selectById", method = RequestMethod.POST)
	public Map<String, Object>articlesSelectByArticleId(@RequestBody JSONObject jsonObject){
		Map<String, Object> result = new HashMap<String,Object>();
		String status = "success";
		ArticleWithBLOBs articleWithBLOBs  = null;
		if (jsonObject.containsKey("articleId")) {
			articleWithBLOBs = articleService.selectArticleByArticleId(jsonObject.getInt("articleId"));
		}
		result.put("status", status);
		result.put("msg", articleWithBLOBs);
		return result;
	}


}
