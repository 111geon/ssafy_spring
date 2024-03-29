package com.ssafy.ws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MovieTest {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		Person audience = context.getBean("audience", Person.class);
		try {
			audience.seeMovie();
		} catch (CallException e) {
//			e.printStackTrace();
		}
	}
}
