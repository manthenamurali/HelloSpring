package springdemo.utils;

import org.apache.log4j.Logger;

public class MyLogger {
	
	private static Logger mLogger = Logger.getLogger(MyLogger.class);
	
	public static void info(String info) {
		mLogger.info(info);
	}
}
