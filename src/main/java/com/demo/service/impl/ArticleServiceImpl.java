package com.demo.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.bean.Article;
import com.demo.bean.ArticleExample;
import com.demo.bean.ArticleExample.Criteria;
import com.demo.bean.ArticleWithBLOBs;
import com.demo.dao.ArticleMapper;
import com.demo.service.api.ArticleService;
import com.mysql.fabric.xmlrpc.base.Data;

import net.sf.json.JSONObject;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	ArticleMapper articleDao;

	@Override
	@Transactional
	public Map<String, Object> addAndUpdateArticle(JSONObject jsonObject) {
		// TODO Auto-generated method stub
		Map<String, Object> result = new HashMap<String,Object>();
		String status = "success";
		
				
		try {
			ArticleWithBLOBs article = new ArticleWithBLOBs();
			ArticleExample example = new ArticleExample();
			Criteria criteria = example.createCriteria();
			if (jsonObject.containsKey("userId")) {
				article.setUserId(jsonObject.getInt("userId"));
				criteria.andUserIdEqualTo(jsonObject.getInt("userId"));
			}
			if (jsonObject.containsKey("articleContent")) {
				article.setArticleContent(jsonObject.getString("articleContent"));
				
			}
			if (jsonObject.containsKey("articleText")) {
				article.setArticleText(jsonObject.getString("articleText"));
				
			}
			if (jsonObject.containsKey("articleViews")) {
				article.setArticleViews(jsonObject.getInt("articleViews"));
				
			}
			if (jsonObject.containsKey("articleTitle")) {
				article.setArticleTitle(jsonObject.getString("articleTitle"));
				
			}
			if (jsonObject.containsKey("articleId")) {
				article.setArticleId(jsonObject.getInt("articleId"));
			}
			if (jsonObject.containsKey("commentCount")) {
				article.setArticleCommentCount(jsonObject.getInt("commentCount"));
			}
			if (jsonObject.containsKey("likeCount")) {
				article.setArticleLikeCount(jsonObject.getInt("likeCount"));
			}
			if (jsonObject.containsKey("sortId")) {
				article.setSortId(jsonObject.getInt("sortId"));
			}
			if (jsonObject.containsKey("articleId")) {//修改
				articleDao.updateByPrimaryKeySelective(article);
								
			}else {//添加
				article.setArticleDate(new Date());
				
				articleDao.insert(article);
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		result.put("status", status);
		return result;
	}

	@Override
	public int deleteArticle(JSONObject jsonObject) {
		// TODO Auto-generated method stub
		ArticleExample example = new ArticleExample();
		Criteria criteria = example.createCriteria();
		if (jsonObject.containsKey("articleId")) {
			criteria.andArticleIdEqualTo(jsonObject.getInt("articleId"));
		}
		
		return articleDao.deleteByExample(example);
	}

	@Override
	public Map<String, Object> selectArticles(JSONObject jsonObject) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String,Object>();
		List<ArticleWithBLOBs> articles = null;
		List<ArticleWithBLOBs> pageList = null;
		ArticleExample example = new ArticleExample();
		Criteria criteria = example.createCriteria();
		
		example.setOrderByClause("article_date desc");
		
		if (jsonObject.containsKey("userId")) {
			criteria.andUserIdEqualTo(jsonObject.getInt("userId"));
		}
		if (jsonObject.containsKey("sortId")) {
			criteria.andSortIdEqualTo(jsonObject.getInt("sortId"));
		}
		
		articles = articleDao.selectByExampleWithBLOBs(example);
		map.put("length", articles.size());
		if(articles != null && articles.size() > 0) {
			if(jsonObject.containsKey("startNum") && jsonObject.containsKey("pageNum")) {
				Integer startNum = jsonObject.getInt("startNum");
				Integer endNum  = jsonObject.getInt("pageNum") +startNum;
				if (endNum > articles.size()) {
					endNum = articles.size();
				}
				pageList = articles.subList(startNum, endNum);
				map.put("msg", pageList);
				return map;
				
			}

		}
		map.put("msg", articles);
		
		
		
		return map;
	}

	@Override
	public ArticleWithBLOBs selectArticleByArticleId(Integer articleId) {
		// TODO Auto-generated method stub
		ArticleWithBLOBs articleWithBLOBs = null;
		if (articleId != null) {
			articleWithBLOBs = articleDao.selectByPrimaryKey(articleId);
		}
		return articleWithBLOBs;
	}

}
