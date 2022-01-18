package collection_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class StackMp3{

	String now = null;
	Stack back = new Stack();
	Stack next = new Stack();
	
	void song(String name) {
		
		
		if(now!=null) {
			back.push(now);
		}
		now = name;
		
		System.out.println("노래를 추가합니다 : "+name);
		ppp();
	}
	void ppp() {
		System.out.println("재생중인 곡 : "+now);
		System.out.println("다음곡"+next);
		System.out.println("이전곡"+back);
		System.out.println();
	}
	
	void goBack() {
		
		if(!back.empty()) {
			next.push(now);
			now = (String)back.pop();
			ppp();
		}else {
				System.out.println("뒤로 갈 재생목록이 없습니다.");
		}
	}
	void goNext() {
		
		if(!next.empty()) {
			back.push(now);
			now = (String)next.pop();
			ppp();
			
		}else {
			System.out.println("앞으로 갈 재생목록이 없습니다."+"\n");
			
		}
	}
}


public class StackMp3Me {

	public static void main(String[] args) {

		StackMp3 play = new StackMp3();
		
		play.song("노래_1");
		play.song("노래_2");
		play.song("노래_3");
		play.song("노래_4");
		play.goBack();
		play.goNext();
		play.goNext();
		play.goBack();
		play.goBack();
		play.goBack();
	}

}
