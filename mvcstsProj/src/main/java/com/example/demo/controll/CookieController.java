package com.example.demo.controll;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CookieController {

	@RequestMapping("/cookie/make")
	String make(Model mm, HttpServletResponse response) {
		
		
		response.addCookie(new Cookie("ppp","asdf"));
		
		mm.addAttribute("title", "쿠키생성");		
		return "cookie/status";
	}
	
	@RequestMapping("/cookie/modify")
	String modify(Model mm, HttpServletResponse response) {
		
		
		response.addCookie(new Cookie("ppp","qwer"));
		response.addCookie(new Cookie("rrr","1234"));
		
		mm.addAttribute("title", "쿠키수성");		
		return "cookie/status";
	}
	
	@RequestMapping("/cookie/view")
	String view(Model mm, 
			@CookieValue(value= "ppp", defaultValue = "zxcv")String ppp,
			@CookieValue(value= "rrr", defaultValue = "777")int rrr,
			@CookieValue(value= "ttt", defaultValue = "zxcv")String ttt,
			@CookieValue(value = "yyy", defaultValue = "888")int yyy) {
				
		mm.addAttribute("ppp", ppp);		
		mm.addAttribute("rrr", rrr);	
		mm.addAttribute("ttt", ttt);		
		mm.addAttribute("yyy", yyy);	
		return "cookie/view";
	}
	@RequestMapping("/cookie/login")
	String login(Model mm, HttpServletResponse response) {
		
		
		response.addCookie(new Cookie("ppp","asdf"));
		
		mm.addAttribute("title", "쿠키생성");		
		return "cookie/login";
	}
	
	@RequestMapping("/cookie/delete")
	String delete(Model mm, HttpServletResponse response) {
		
		Cookie coo = new Cookie("ppp", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		
		coo = new Cookie("rrr","");
		coo.setMaxAge(0);
		response.addCookie(coo);
		
		coo = new Cookie("ttt","");
		coo.setMaxAge(0);
		response.addCookie(coo);
		
		coo = new Cookie("yyy","");
		coo.setMaxAge(0);
		response.addCookie(coo);
		
		response.addCookie(new Cookie("ppp","asdf"));
		
		mm.addAttribute("title", "쿠키삭제");		
		return "cookie/status";
	}
}
