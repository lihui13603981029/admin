package com.demo.service.api;

import java.util.Map;

import com.demo.bean.User;

import net.sf.json.JSONObject;

public interface RegisterUserService {
	User selectedUserByName(String name);
	
	Map<String, Object> registerUser(JSONObject object);
	
	Map<String, Object> loginUser(JSONObject jsonObject);

}
