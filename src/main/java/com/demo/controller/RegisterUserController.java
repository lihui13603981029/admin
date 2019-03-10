package com.demo.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.api.RegisterUserService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping(value = "user")
public class RegisterUserController {

	@Autowired
	RegisterUserService registerUserService;
	
	@RequestMapping(value = "regist", method = RequestMethod.POST)
	public Map<String, Object> userRegist(@RequestBody JSONObject jsonObject) {
		System.out.println(jsonObject.toString());
		Map<String, Object> result = new HashMap<String, Object>();
		result= registerUserService.registerUser(jsonObject);
		
		return result;
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public Map<String, Object> userLogin(@RequestBody JSONObject jsonObject) {
		
		Map<String, Object> result =null;
		String status = "success";
		System.out.println(jsonObject.toString());
		
		result = registerUserService.loginUser(jsonObject);
		
		result.put("status", status);
		return result;
		
	}
	@RequestMapping(value = "saveFile",method = RequestMethod.POST)
	public Map<String, Object> saveFile(@RequestBody JSONObject object,HttpServletRequest request){
		
		Map<String, Object> result = new HashMap<String,Object>();
		
		String path = request.getContextPath(); 
		System.out.println("path="+path);
		
		String msg = "surr";
		System.out.println(object.toString());
		if (!object.containsKey("dataUrl")) // 图像数据为空
			return result;
 
		Base64 base64 = new Base64();
		//base64 decode image
		String data = object.getString("dataUrl");
		byte[] b = base64.decode(data.substring("data:image/png;base64,".length()).getBytes());
		String fileName = String.valueOf(System.currentTimeMillis());
		//image path
		String filePath ="/Users/lihui/java"+ File.separator + "DATAS";
		File dirfile = new File(filePath);
		if (!dirfile.exists()) {
			dirfile.mkdirs();
		}
		System.out.println("fliePaht="+filePath);
		//write imag
		File file = new File(filePath +"/"+fileName + ".png");
		try {
			FileUtils.writeByteArrayToFile(file, b);
		} catch (IOException e) {
			
			msg = "上传失败";
			e.printStackTrace();
		}
		result.put("msg", msg);
		return result;
		
	}
			

}
