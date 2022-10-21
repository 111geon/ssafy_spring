package com.ssafy.ws;

import org.springframework.stereotype.Component;

@Component
public class Comic implements Movie {

	@Override
	public void printTitle() {
		System.out.println("코믹무비");
	}

}
