package collection_p;

import java.util.Stack;

class StackBrowser{
	String now = null;
	Stack back = new Stack();
	Stack next = new Stack();
	
	void goUrl(String url) {
		
		next.clear();
		if(now!=null) {
			back.push(now);
		}
		now = url;
		
		System.out.println("goUrl("+url+")-------------");
		ppp();
	}
	
	void goBack() {
		System.out.println("goBack()-----------------");
		
		if(!back.empty()) {
			next.push(now);
			now = (String)back.pop();
			ppp();
		}else{
				System.out.println("뒤로 갈 페이지가 없습니다.");
		}
	}
	
	void goNext() {
		System.out.println("goNext()-----------------");
		
		if(!next.empty()) {
			back.push(now);
			now = (String)next.pop();
			ppp();
		}else{
				System.out.println("앞으로 갈 페이지가 없습니다.");
		}
	}
	
	void ppp() {
		
		System.out.println("now:"+now);
		System.out.println("back:"+back);
		System.out.println("next:"+next);
	}
}


public class StackBrowserMain {

	public static void main(String[] args) {
		StackBrowser sb = new StackBrowser();
		sb.goUrl("네이버");
		sb.goUrl("구글");
		sb.goUrl("네이트");
		sb.goUrl("줌");
		
		sb.goBack();
		sb.goBack();
		sb.goBack();
		sb.goNext();
		sb.goNext();
		sb.goUrl("다음");
	}

}
