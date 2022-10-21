package com.ssafy.ws;

import java.util.Random;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class RestaurantAspect {
//	@Autowired
//	@Qualifier("japaneseRestaurant")
	Restaurant res;
	


	@Pointcut("execution(public void com.ssafy.ws.*.open())")
	public void mypt() {
	}
	
	@Before(value="mypt()", argNames = "jp")
	public void before(JoinPoint jp) {
		res = (Restaurant) jp.getTarget();
		System.out.println(res.getInfo() + "을 위해 재료를 준비합니다.");
	}
	
	@AfterReturning(value="mypt()")
	public void afterReturning() {
		System.out.println(res.getInfo() + "점 영업중 사고가 발생하지 않았습니다.");
		System.out.print("직원들에게 보너스 지급 !! : ");
		System.out.print((int) (new Random().nextDouble() * 100000));
		System.out.println("원");
	}
	
	@AfterThrowing(value = "mypt()", throwing="th")
	public void afterThrowing(Throwable th) {
		System.out.println(res.getInfo() + "에서 머리카락이 발견되어 손님에게 음식값을 환불해줍니다.");
		if(th instanceof HairFoundException) {
			((HairFoundException) th).hair();
			System.out.println("사고가 발생해서 보너스를 지급하지 않습니다.");
		}
	}
	
	@After(value="mypt()")
	public void after() {
		System.out.println(res.getInfo() + "점 영업을 종료하고 마무리합니다.");
	}
	
}
