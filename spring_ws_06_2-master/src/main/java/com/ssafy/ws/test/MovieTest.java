package com.ssafy.ws.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.ssafy.ws.model.dao.MovieDao;
import com.ssafy.ws.model.dao.UserDao;
import com.ssafy.ws.model.dto.Movie;

public class MovieTest {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		MovieDao movieDao =  context.getBean("movieDao", MovieDao.class);
		UserDao userDao =  context.getBean("userDao", UserDao.class);
		
		System.out.println(movieDao.selectAll());
		System.out.println(userDao.select("ssafy"));
		System.out.println(movieDao.searchById(1));
		Movie movie = new Movie(0, "Mighty YG", "yg", "drama", 100, "", "");
		System.out.println(movieDao.insert(movie));
		System.out.println(movieDao.searchByTitle("mighty"));
		
	}
}
