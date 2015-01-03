package com.coderdream.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class HelloLog4j {

	 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System.out.println("This is println message.");
		
		 Logger logger = LoggerFactory.getLogger(HelloLog4j.class);
		// 记录debug级别的信息
		logger.debug("This is debug message.");
		// 记录info级别的信息
		logger.info("This is info message.");
		// 记录error级别的信息
		logger.error("This is error message.");
	}
}