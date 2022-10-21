package com.ssafy.ws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class RestaurantAopTest {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		Restaurant korean = context.getBean("koreanRestaurant", Restaurant.class);
		try {
			korean.open();
		}
		catch(HairFoundException e) {
			
		}
	}
}
