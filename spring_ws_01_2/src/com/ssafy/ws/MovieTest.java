package com.ssafy.ws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MovieTest {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("ApplicationContext.xml");
		
		Movie movie = context.getBean("comic", Movie.class);
		movie.printTitle();
		
		Audience a = context.getBean("audience", Audience.class);
		a.getMovie().printTitle();
	}
}
