package com.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd : HH:mm:ss.SSS");
	
	private static String CurrentTime() {
		return dateFormat.format(new Date());
	}
	//debug
	public static void d(String tag,String info) {
		System.out.println(CurrentTime()+"::"+tag+"::"+info);
	}
	//error
	public static void e(String tag,String info) {
		System.out.println(CurrentTime()+"::"+tag+"::"+info);
	}
	//warning
	public static void w(String tag,String info) {
		System.out.println(CurrentTime()+"::"+tag+"::"+info);
	}
}
