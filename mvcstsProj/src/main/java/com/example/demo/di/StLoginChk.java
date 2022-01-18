package com.example.demo.di;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.demo.model.Stud;

@Component
public class StLoginChk implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub

		//id = aaa, pw = 1234 인 경우만 로그인 성공하도록 구현하세요
		
		Stud st = (Stud)target;
		if(st.getPid() == null || st.getPid().equals("aaa")) {
		System.out.println("validate : "+target);
		errors.rejectValue("pid", "invalid.pid", "id 에러 발생");
		}
		if(st.getPw() == null || st.getPw().equals("1234")) {
		errors.rejectValue("pw", "invalid.pw", "pw 에러 발생");
		}
	}

}
