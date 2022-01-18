package aop_p.model.naver;

import org.springframework.stereotype.Component;

@Component
public class SoundOfHeart {
	public String josuk() {
		System.out.println("josuk 실행()");
		return "조석";
	}
	
	public Integer ironKing() {
		System.out.println("조철왕 실행()");
		return 1234;
	}
	
	public boolean aebong(int a, double d) {
		System.out.println("애봉 실행():"+a+","+d);
		return true;
	}
	
	public boolean flower(int a) {
		System.out.println("꽃친구 실행():"+a);
		return true;
	}
	
	public boolean err() {
		System.out.println("err 실행()");
		int a = 10/0;
		return false;
	}
	
	
}
