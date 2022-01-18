package com.example.demo.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.PathDTO;

@Controller
@RequestMapping("/path/{step1}")	//localhost/path 뒤에 아무거나 있으면 페이지이동된다
public class PathController {

	
	@ResponseBody
	@RequestMapping()
	String path1(@PathVariable String step1) {
		return "1단계 :"+step1;
	}
	
	@ResponseBody
	@RequestMapping("/{step2}")
	String path2(@PathVariable String step1,@PathVariable int step2) {
		return "1단계 :"+step1+" , 2단계 :"+step2;
	}
	
	@ResponseBody
	@RequestMapping("/obc")	//정적으로 쓴게 더 우선권을 가진다.
	String obc(@PathVariable String step1) {
		return "1단계 :"+step1+" , 2단계 : 오병철만세";
	}
	
	//path/pro/tv/list
	@ResponseBody
	@RequestMapping("/{cate}/{service}")	//정적으로 쓴게 더 우선권을 가진다.
	String proGo(PathDTO dto) {
		
		return "proGo :"+dto;
	}
}
