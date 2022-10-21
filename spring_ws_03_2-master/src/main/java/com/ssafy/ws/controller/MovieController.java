package com.ssafy.ws.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssafy.ws.model.dto.Movie;

// 이 클래스가 컨트롤러 임을 어노테이션으로 설정, 컴포넌트 스캔을 통해 빈으로 등록
@Controller
public class MovieController {
		
	/**
	 * '/' 또는 '/index' 요청이 get 방식으로 들어왔을 때 index로 연결한다.
	 * @return
	 */
	@GetMapping({"/", "/index" })
	public String showIndex() {
		return "index";
	}
	
	/**
	 * '/regist' 요청이 get 방식으로 들어왔을 때 regist로 연결한다.
	 * @return
	 */
	@GetMapping({"/regist"})
	public String showRegist() {
		return "regist";
	}


	/**
	 * '/regist' 요청이 post 방식으로 들어왔을 때 전달된 Movie 객체를 regist_result로 연결한다. 
	 * @param movie
	 * @return
	 */
	@PostMapping({"/regist"})
	public ModelAndView regist(Movie movie) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("movie", movie);
		mav.setViewName("regist_result");
		return mav;
	}
	
	@GetMapping("/list")
	public String showList(Model model) {
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie(1, "베놈 2: 렛 데어 비 카니지", "앤디 서키스", "액션", 97));
		movies.add(new Movie(2, "기생충", "봉준호", "드라마", 131));
		movies.add(new Movie(3, "해리포터와 마법사의 돌", "크리스 콜럼버스", "판타지", 152));
		model.addAttribute("movies", movies);
		return "list";
	}
	
	@PostMapping("/login")
	public String login(HttpSession session, String id, String pw) {
		if (id.equals("ssafy") && pw.equals("1234")) {
			session.setAttribute("loginUser", id);
			return "redirect:/";
		}
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
