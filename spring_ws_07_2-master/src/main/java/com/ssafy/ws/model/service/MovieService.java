package com.ssafy.ws.model.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.ssafy.ws.model.dto.Movie;

public interface MovieService {

	int insert(Movie movie, byte[] bytes);

	Movie searchById(int id);

	List<Movie> selectAll();

	List<Movie> searchByTitle(String title);
}
