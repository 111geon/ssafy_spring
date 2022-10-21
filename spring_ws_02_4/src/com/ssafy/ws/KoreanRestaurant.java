package com.ssafy.ws;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class KoreanRestaurant implements Restaurant {
	
	
	@Override
	public void open() throws HairFoundException {
		System.out.println("영업중 : 비빔밥, 된장찌개, 소불고기를 팔고 있습니다.");
		if(new Random().nextBoolean()) {
			throw new HairFoundException();
		}
	}

	@Override
	public String getInfo() {
		return "한식";
	}

}
