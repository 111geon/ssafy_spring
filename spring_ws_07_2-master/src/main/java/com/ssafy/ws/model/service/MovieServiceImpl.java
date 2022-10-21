package com.ssafy.ws.model.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.ssafy.ws.model.dao.MovieDao;
import com.ssafy.ws.model.dto.Movie;

// bean으로 등록 할수 있도록 Service를 선언한다.
@Service
public class MovieServiceImpl implements MovieService {

	private MovieDao movieDao;
	
	@Autowired
	ServletContext servletContext;

	/**
	 * setter를 통해 movieRepo을 주입 받는다.
	 * 
	 * @param movieDao
	 */
	@Autowired
	public void setMovieDao(MovieDao movieDao) {
		this.movieDao = movieDao;
	}

	@Transactional
	@Override
	public int insert(Movie movie, byte[] bytes) {
		String uploadPath = servletContext.getRealPath("/resources/upload");
		String uploadName = movie.getImg();
		
		File target = new File(uploadPath, uploadName);
		
		if(!new File(uploadPath).exists()) new File(uploadPath).mkdir();
		
		try {
			FileCopyUtils.copy(bytes, target);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return movieDao.insert(movie);
	}

	@Override
	public Movie searchById(int id) {
		//코드작성
		return null;
	}

	@Override
	public List<Movie> searchByTitle(String title) {
		//코드작성
		return null;
	}

	@Override
	public List<Movie> selectAll() {
		// 코드작성
		return movieDao.selectAll();
	}

}
