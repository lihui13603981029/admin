package com.demo.util;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
//去除spring的文件解析
public class CommonsMultipartResolver extends org.springframework.web.multipart.commons.CommonsMultipartResolver {
	
	private static Logger log = Logger.getLogger("CommomsMultiparResolver");
	
	@Override
	public boolean isMultipart(HttpServletRequest request) {
		
		String uri = request.getRequestURI();
			
		//过滤使用百度EUditor上传的url
		if(uri.indexOf("admin/ueditor") > 0) {
			log.info(uri + ":  不做任何处理");
			return false;
		}
		
		return super.isMultipart(request);
		
	}

}
