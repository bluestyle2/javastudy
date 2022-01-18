package com.example.demo.controll;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CurrencyEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Stud;

@Controller
public class InitController {

	@RequestMapping("/init")
	String view(Stud st) {
		
		System.out.println("view:"+st);
		return "init";
	}
	
	@InitBinder
	void ewwpofjapo(WebDataBinder bbb) {	//이 컨트롤러에 타는 것들은 이 메소드를 무조건 진입
		System.out.println("오병철 바보 진입");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		
		CustomDateEditor cde = new CustomDateEditor(sdf, true); //데이터폼을 뭘로쓸거야 비어잇는거야 아닌거야
		
		bbb.registerCustomEditor(Date.class, "birth", cde);	//birth가 오면 date클래스로 가야되 변환하려는 애는 cde다
	}
	
	
	/// -> 날짜 두개를 입력 받아 두 날짜사이가 몇일인지 출력하세요
}

