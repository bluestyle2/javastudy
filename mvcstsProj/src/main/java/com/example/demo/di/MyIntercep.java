package com.example.demo.di;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

@Service
public class MyIntercep implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession(); 
		
		System.out.println("MyIntercep preHandle() 진입");
		
		Date chkDay = new Date(2021-1900,12-1,25);
		
		if(chkDay.before(new Date())) {
			response.sendRedirect("/eventfail");
			System.out.println("이벤트지났다고 알려!"+chkDay);
			return false;
		}
		
		return true;
	}
	
}
