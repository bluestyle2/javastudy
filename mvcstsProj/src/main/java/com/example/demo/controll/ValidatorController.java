package com.example.demo.controll;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.di.StLoginChk;
import com.example.demo.model.Stud;

@Controller
@RequestMapping("/validator")
public class ValidatorController {

	@Resource
	StLoginChk chk;
	
	@RequestMapping(method = RequestMethod.GET)
	String form() {
		return "validator/form";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	String post(Stud st, BindingResult br) {
		
		chk.validate(st, br);
		if(br.hasErrors()) {
			System.out.println("에러가 있으요");
			return "validator/form";
		}
		
		return "validator/post";
	}
}
