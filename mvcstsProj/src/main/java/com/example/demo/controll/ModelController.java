package com.example.demo.controll;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelController {

	@ModelAttribute("obc")	//해당 컨트롤러에서 모두 사용할수 있다.
	String mm1() {
		return "오병철 만세!";
	}
	
	@ModelAttribute("menu")	//해당 컨트롤러에서 모두 사용할수 있다.
	ArrayList<String> mm2(String cate) {
		
		
		System.out.println("mm2:"+cate);
		
		HashMap<String, ArrayList<String>>res = new HashMap<>();
		res.put("info",new ArrayList<String>());
		res.put("gall",new ArrayList<String>());
		res.put("center",new ArrayList<String>());
		
		res.get("info").add("인사말");
		res.get("info").add("연혁");
		res.get("info").add("오시는길");
		
		res.get("gall").add("봄");
		res.get("gall").add("여름");
		res.get("gall").add("가을");
		res.get("gall").add("겨울");
		
		res.get("center").add("공지사항");
		res.get("center").add("질문및답변");
		
		
		return res.get(cate);	//cate : 해당하는 값이 들어가면(gall) 해당 값에 add된것들을(봄,여름,가을,겨울) 출력한다
	}
	
	@RequestMapping("/model/view1")
	String viewGo1(Model mm) {
		mm.addAttribute("title","view1");
		return "model/view";
	}
	
	@RequestMapping("/model/view2")
	String viewGo2(Model mm) {
		mm.addAttribute("title","view2");
		return "model/view";
	}
	
	@RequestMapping("/model/view3")
	String viewGo3(Model mm) {
		mm.addAttribute("title","view3");
		return "model/view";
	}
}
