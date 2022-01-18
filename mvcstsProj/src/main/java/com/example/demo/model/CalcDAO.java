package com.example.demo.model;

import org.springframework.stereotype.Service;

@Service
public class CalcDAO {
	
	CalcDTO res = new CalcDTO();
   public int plus(CalcDTO dto) {
	   
	  int tot = res.calc1 + res.calc2;
	   
	   
		return tot; 
	}
}
