package com.example.demo.controll;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.CalcDAO;
import com.example.demo.model.CalcDTO;
import com.example.demo.model.NoticeDAO;
import com.example.demo.model.NoticeDTO;

@Controller
public class NoticeController {
//----------------- 매우중요---------------------
	@Resource		
	NoticeDAO dao;
	
	@Resource
	CalcDAO dao2;
	
	@ModelAttribute("mainData")
	Object mmm(HttpServletRequest req, NoticeDTO dto) {
		String service = req.getRequestURI().substring("/notice/".length());
		System.out.println("mmm 실행:"+service);
		
		switch(service) {
			case "list":
				return dao.list();
			case "detail":
				return dao.detail(dto);
			case "insert":
				return dao.insert(dto);
			case "delete":
				return dao.delete(dto);
						
		}
		return null;
	}
	
	
	
//----------------- 매우중요----------------------
	@RequestMapping("/notice/list")
	String list(Model mm) {
		mm.addAttribute("title","목록입니다.");
		return "model/notice";
	}
	
	@RequestMapping("/notice/detail")
	String detail(Model mm) {
		mm.addAttribute("title","상세입니다.");
		return "model/notice";
	}
	
	@RequestMapping("/notice/insert")
	String insert(Model mm) {
		mm.addAttribute("title","추가입니다.");
		return "model/notice";
	}
	
	@RequestMapping("/notice/delete")
	String delete(Model mm) {
		mm.addAttribute("title","삭제입니다.");
		return "model/notice";
	}
	@RequestMapping("/model/calc")
	String calcc() {
		
		return "model/calc";
	}
}
