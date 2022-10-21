package com.ssafy.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Audience {
	private Movie movie;
//	public Audience(Movie movie) {
//		this.movie = movie;
//	}
	@Autowired
	@Qualifier("comic")
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Movie getMovie() {
		return movie;
	}
}
