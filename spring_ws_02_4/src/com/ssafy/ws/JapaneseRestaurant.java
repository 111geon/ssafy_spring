package com.ssafy.ws;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class JapaneseRestaurant implements Restaurant {

	@Override
	public void open() throws HairFoundException {
		System.out.println("영업중 : 초밥, 돈카츠, 라멘을 팔고 있습니다.");
		if(new Random().nextBoolean()) {
			throw new HairFoundException();
		}
	}

	@Override
	public String getInfo() {
		return "일식";
		
	}

}
