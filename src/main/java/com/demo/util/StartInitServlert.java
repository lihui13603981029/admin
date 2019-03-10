package com.demo.util;

import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class StartInitServlert implements ServletContextListener {

	private static Logger log = Logger.getLogger(StartInitServlert.class.toString());

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		log.info("》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》容器已销毁");
	
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		log.info("》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》启动结束");
		System.out.println("启动结束");
		//RunSqlScript.run("menu");

	}

}
