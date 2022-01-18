package com.example.demo.controll;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Stud;

@Controller
public class SessionController {

	@RequestMapping("/session/make")	
	@ResponseBody
	String make(HttpSession session) {
		
		
		session.setAttribute("pname", "오병철");
		return "session 생성";
	}
	
	@RequestMapping("/session/view")	
	String view() {
		
		return "sessionView";
	}
	
	@RequestMapping("/session/modify")	
	@ResponseBody
	String modify(HttpSession session) {
		
		
		session.setAttribute("pname", "사병철");
		session.setAttribute("age", 23);
		return "session 수정";
	}
	
	@RequestMapping("/session/delete")	
	@ResponseBody
	String delete(HttpSession session) {
		
		
		//session.removeAttribute("pname");
		session.invalidate();
		
		return "session 삭제";
	}
	
	@RequestMapping("/session/login")		
	String login() {
		
		
		
		return "session/login";
	}
	
	@RequestMapping("/session/loginReg")		
	String loginReg(Stud st, HttpSession session, Model mm) {		
		String msg = "로그인 실패";
		
		HashMap<String, Stud>map = new HashMap<String, Stud>();
		map.put("aaa", new Stud("aaa","장동건","1111",1));
		map.put("bbb", new Stud("bbb","장서건","2222",3));
		map.put("ccc", new Stud("ccc","장동건","3333",3));
		map.put("ddd", new Stud("ddd","장남건","1111",2));
		
		if(map.containsKey(st.getPid())) {
			Stud me = map.get(st.getPid());
			if(me.getPw().equals(st.getPw())) {
				msg = me.getPname()+" 로그인 성공";
				session.setAttribute("mem", me);
			}
			
		}
		
		mm.addAttribute("msg",msg);
		mm.addAttribute("url","/login");
		return "session/alert";
	}
	@RequestMapping("/session/logout")	
	@ResponseBody
	String logout(HttpSession session, Model mm) {
		
		
		Stud st = (Stud)session.getAttribute("mem");
		String msg = st.getPname()+"로그아웃되었습니다.";
		session.invalidate();
		
		mm.addAttribute("msg",msg);
		mm.addAttribute("url","/login");
		return "session/alert";
	}


}
