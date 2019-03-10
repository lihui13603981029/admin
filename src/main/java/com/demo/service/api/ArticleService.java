package com.demo.service.api;

import java.util.List;
import java.util.Map;

import com.demo.bean.Article;
import com.demo.bean.ArticleWithBLOBs;

import net.sf.json.JSONObject;

public interface ArticleService {
	
	
	Map<String, Object> addAndUpdateArticle(JSONObject jsonObject);
	
	int deleteArticle(JSONObject jsonObject);
	
	Map<String, Object> selectArticles(JSONObject jsonObject);
	
	ArticleWithBLOBs selectArticleByArticleId(Integer articleId);

}