package com.example.demo.controll;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Stud;
import com.example.demo.model.StudArr;

@Controller
public class RequestController {

	@RequestMapping("/req/first")
	String req(Model mm, 
			@RequestParam("pname")String pname, 
			@RequestParam(name = "age", defaultValue = "10") int age) {	//기본값을 넣을 수 있다
		
		
		System.out.println(pname+","+age);
		
		mm.addAttribute("data",age);
		
		return "req/data";
	}
	
	@RequestMapping("/req/sec")
	String req2(Stud st) {	//기본값을 넣을 수 있다
				
		System.out.println("st:"+st);		
		
		return "req/stud";
	}
	
	@RequestMapping("/req/third")
	String req3(@ModelAttribute("st") Stud st) {	//매개변수를 재명칭할수있다
				
		System.out.println("st:"+st);		
		
		return "req/stud";
	}
	
	@RequestMapping(value="/req/exam", method = RequestMethod.GET)
	String formGo() {	
		System.out.println("formGo 실행");
		return "req/form";
	}
	
	@RequestMapping(value="/req/exam", method = RequestMethod.POST)
	String postGo(@ModelAttribute("st") Stud st) {
		System.out.println("postGo 실행");
		st.calc();
		return "req/post";
	}
	
	@RequestMapping(value="/req/examList", method = RequestMethod.GET)
	String formList() {	
		System.out.println("formList 실행");
		return "req/formList";
	}
	
	@RequestMapping(value="/req/examList", method = RequestMethod.POST)
	//String postList(Stud []st){
//	String postList(ArrayList<Stud> st) {
	String postList(StudArr st) {
		System.out.println("postList 실행"+st);
		for(Stud dto: st.getArr()) {
			dto.calc();
		}
		return "req/postList";
	}
}
