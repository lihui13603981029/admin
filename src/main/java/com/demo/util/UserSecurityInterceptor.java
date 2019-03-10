package com.demo.util;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

//拦截器
public class UserSecurityInterceptor implements HandlerInterceptor {
	
	private static final Logger loger = Logger.getLogger(UserSecurityInterceptor.class.toString());
	
	private List<String> excludedUrls;

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		/*
		String requestUri = arg0.getRequestURI();
		loger.info("size = "+this.excludedUrls.size());
		loger.info("requestUri = "+requestUri);
        for (String url : excludedUrls) {
        	loger.info("excludedUrl = "+url);
            if (requestUri.endsWith(url)) {
            	
                return true;
            }
        }
        
        HttpSession session = arg0.getSession();
        if (session.getAttribute("username") == null) {
            System.out.println(arg0.getContextPath());
            arg1.sendRedirect(arg0.getContextPath() + "/tologin");
        }else {
			
        	return true;
		}
        return false;
        */
		return true;
	}

	public List<String> getExcludedUrls() {
		return excludedUrls;
	}

	public void setExcludedUrls(List<String> excludedUrls) {
		this.excludedUrls = excludedUrls;
	}

}
