package com.example.demo.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Stud;

@Controller
public class InterceptorController {

	@RequestMapping("/interceptor/event")
	String view() {
		
		return "interceptor/event";
	}
	
	@RequestMapping("/interceptor/abcde")
	@ResponseBody
	String view2() {
		
		return "interceptor/abcde 여";
	}
	
	@RequestMapping("/eventfail")
	@ResponseBody
	String view3() {
		
		return "이벤트 지났어!";
	}
	
	
	@RequestMapping("/admin/main")
	@ResponseBody
	String admin1() {
		
		return "관리자 메인페이지";
	}
	
	@RequestMapping("/adminfail")	
	String adminfail(Model mm) {
				
		mm.addAttribute("msg","관리자 등급이 아닙니다.");
		mm.addAttribute("url","/home");
		
		return "session/alert";
	}
}
