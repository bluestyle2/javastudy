package com.example.demo.controll;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")	//WebServlet 역할
	String home() {
		
		System.out.println("home 들어와요");
		return "home";
		
	}
	
	@RequestMapping("/gogo")	//주소창에 입력하는 값
	String gogo(Model mm,Model ss) {	//Model = 어튜리뷰트와 같음
		
		mm.addAttribute("data", new Date());
		ss.addAttribute("today", new Date());
		System.out.println("gogo 임돠");
		return "aaa";	//해당하는 jsp 파일명
		
	}
	
	@RequestMapping("/rbody")
	@ResponseBody	//자신의 리턴값으로 view페이지를 대신함 (view 페이지로 forwarding 하지 않고 리턴값으로 화면 처리
	String ttt() {
		
		System.out.println("ttt 들어와요");
		return "<h1>rbody 입니다.</h1>";
		
	}
	
	@RequestMapping("/rbody2")
	@ResponseBody	
	ArrayList ttt2() {
		
		System.out.println("ttt2 들어와요");
		
		ArrayList<String>res = new ArrayList<>();
		res.add("호랑이");
		res.add("사자");
		res.add("호랑이");
		res.add("늑대");
		//res.add("<h1>곰</h1>");
		
		return res;
		
	}
	
	@RequestMapping("/rbody3")
	@ResponseBody	
	HashMap ttt3() {
		
		System.out.println("ttt3 들어와요");
		
		HashMap<String, Integer>res = new HashMap<>();
		res.put("red", 10);
		res.put("blue", 20);
		res.put("red", 30);
		res.put("green", 40);
		res.put("green", 20);
		
		return res;
		
	}
	
	@RequestMapping("/mavGo")
	ModelAndView mavGo() {
		
		ModelAndView res = new ModelAndView("aaa");	//어느 뷰페이지로 갈건지 정해줄수 있음
		
		
		
		res.addObject("data", new Date());
		
		return res;
	}
	
}
