package com.example.demo.di;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

import com.example.demo.model.Stud;

@Service
public class AdminInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		//request랑 response 둘다 매개변수로 받아오니까 세션을 보고 가게해줄지 말지도 해줄수있다. (session을 불러오면된다)
		HttpSession session = request.getSession();
		
		System.out.println("Admin preHandle() 진입");
		
		if(session.getAttribute("mem")!=null) {
			Stud st = (Stud)session.getAttribute("mem");
			
			if(st.getGrade()==1) {
				
				return true;
			}
		}
		
		response.sendRedirect("/adminfail");
		return false;
	}
}
