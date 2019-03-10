package com.demo.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTML.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.User;
import com.demo.bean.UserExample;
import com.demo.bean.UserExample.Criteria;
import com.demo.dao.UserMapper;
import com.demo.service.api.RegisterUserService;
//
//import com.demo.bean.User;
//import com.demo.bean.UserExample;
//import com.demo.bean.UserExample.Criteria;
//import com.demo.dao.UserMapper;
//import com.demo.service.api.RegisterUserService;
import com.demo.util.Logger;
import com.mysql.fabric.xmlrpc.base.Data;

import net.sf.json.JSONObject;

@Service
public class RegisterUserServiceImpl implements RegisterUserService{
	
	
	private static final String Tag = "RegisterUserServiceImpl";
	
	@Autowired
	UserMapper userDao;

	@Override
	public Map<String, Object> registerUser(JSONObject object) {
		// TODO Auto-generated method stub
		Map< String, Object> result = new HashMap<String,Object>();
		
		String status = "success";
		String msg = "注册成功";
		if (object.containsKey("userId")) {//更新
			User user = new User();
			user.setUserName(object.getString("userName"));
			user.setUserEmail(object.getString("userEmail"));
			int state = userDao.updateByPrimaryKey(user);
			msg = "修改信息成功";
			
		}else {//注册
			
			UserExample example = new UserExample();
			Criteria criteria = example.createCriteria();
			if (object.containsKey("userName")) {
				criteria.andUserNameEqualTo(object.getString("userName"));	
			}	
			List<User> users = userDao.selectByExample(example);
			if (users.size() > 0) {
				status = "error";
				msg = "用户名已经存在";
				result.put("status", status);
				result.put("msg", msg);
				return result;			
			}
			Date date = new Date();
			User user = new User();
			try {
				user.setUserName(object.getString("userName"));
				user.setUserPassword(object.getString("userPassword"));
				user.setUserEmail(object.getString("userEmail"));
				user.setUserRegistrationTime(date);
				int value= userDao.insert(user);
				if (value == 0) {
					status = "error";
					msg = "注册失败";
				}
			} catch (Exception e) {
				// TODO: handle exception
				Logger.e(Tag, "用户注册参数不全");
				status ="fail";
				msg = "注册失败";
			}		
		}
		
		result.put("status", status);
		result.put("msg", msg);
		
		return result;
	}

	@Override
	public User selectedUserByName(String name) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Map<String, Object> loginUser(JSONObject jsonObject) {
		// TODO Auto-generated method 
		Map<String, Object>result = new HashMap<String,Object>();
		
		User user = new User();
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		
		
		if (jsonObject.containsKey("userName")) {
			criteria.andUserNameEqualTo(jsonObject.getString("userName"));
		}
		if (jsonObject.containsKey("userEmail")) {
			criteria.andUserEmailEqualTo(jsonObject.getString("userEmail"));	
		}
		if(jsonObject.containsKey("phoneNum")) {
			criteria.andUserTelephoneNumberEqualTo(jsonObject.getString("phoneNum"));
		}
		List<User> users= userDao.selectByExample(example);
		if (users.size() >0) {
			user.setUserId(users.get(0).getUserId());
			user.setUserName(users.get(0).getUserName());
			user.setUserAge(users.get(0).getUserAge());
			user.setUserBirthday(users.get(0).getUserBirthday());
			if (jsonObject.getString("userPassword").equals(users.get(0).getUserPassword())) {
				result.put("msg", user);
			}else {
				result.put("msg", "用户密码错误");
			}
		}else {
			result.put("msg", "用户名不正确");
			
		}
		
		return result;
	}

}
