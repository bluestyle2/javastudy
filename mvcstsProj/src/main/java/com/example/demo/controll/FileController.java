package com.example.demo.controll;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Stud;

@Controller
public class FileController {

	@RequestMapping("/req/uploadForm")
	String uploadForm() {
		return "req/uploadForm";
	}
	
	@RequestMapping("/req/upCom1")
	String upCom1(Model mm,
			String pname, 
					int age,
					MultipartFile upfile_1,
					MultipartFile upfile_2,
					HttpServletRequest req
			) {
		mm.addAttribute("title","upCom1");
		mm.addAttribute("pname",pname);
		mm.addAttribute("age",age);
		mm.addAttribute("upfile_1",upfile_1);
		mm.addAttribute("upfile_2",upfile_2);
		mm.addAttribute("upfile_1_img",upfile_1.getOriginalFilename());
		System.out.println(pname+","+age+","+upfile_1+","+upfile_2);
		
		System.out.println(upfile_1.getOriginalFilename());
		System.out.println(upfile_1.getName());
		System.out.println(upfile_1.getContentType());
		System.out.println(upfile_1.getSize());	//용량
		System.out.println(upfile_1.isEmpty());	//비어있는가 유무
		
		String path = req.getRealPath("/up");
		path= "E:\\ojh\\study\\sts_work\\mvcProj\\src\\main\\webapp\\up";
		
		try {
			FileOutputStream fos = new FileOutputStream(path+"\\"+upfile_1.getOriginalFilename());
			fos.write(upfile_1.getBytes());
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "req/upCom1";
	}
	
	@RequestMapping("/req/upCom2")
	String upCom2(Model mm,
					MultipartHttpServletRequest mr
			) {
		
		MultipartFile upfile_1 = mr.getFile("upfile_1");
		MultipartFile upfile_2 = mr.getFile("upfile_2");
		
		mm.addAttribute("title","upCom2");
		mm.addAttribute("pname",mr.getParameter("pname"));
		mm.addAttribute("age",mr.getParameter("age"));
		mm.addAttribute("upfile_1",upfile_1.getOriginalFilename());
		mm.addAttribute("upfile_2",upfile_2);
		mm.addAttribute("upfile_1_img",upfile_1.getOriginalFilename());
		
		System.out.println(upfile_1.getOriginalFilename());
		System.out.println(upfile_1.getName());
		System.out.println(upfile_1.getContentType());
		System.out.println(upfile_1.getSize());	//용량
		System.out.println(upfile_1.isEmpty());	//비어있는가 유무
		
		String path = mr.getRealPath("/up");
		path= "E:\\ojh\\study\\sts_work\\mvcProj\\src\\main\\webapp\\up";
		
		try {
			FileOutputStream fos = new FileOutputStream(path+"\\"+upfile_1.getOriginalFilename());
			fos.write(upfile_1.getBytes());
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "req/upCom1";
	}
	
	@RequestMapping("/req/upCom3")
	String upCom3(Stud st, HttpServletRequest req) {
		
		
		
		System.out.println(st.getUpfile_1().getOriginalFilename());
		System.out.println(st.getUpfile_1().getName());
		System.out.println(st.getUpfile_1().getContentType());
		System.out.println(st.getUpfile_1().getSize());	//용량
		System.out.println(st.getUpfile_1().isEmpty());	//비어있는가 유무 boolean타입
		
		String path = req.getRealPath("/up");
		path= "E:\\ojh\\study\\sts_work\\mvcProj\\src\\main\\webapp\\up";
		
		try {
			FileOutputStream fos = new FileOutputStream(path+"\\"+st.getUpfile_1().getOriginalFilename());
			fos.write(st.getUpfile_1().getBytes());
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "req/upCom3";
	}
	@RequestMapping("/req/upCom4")
	String upCom4(Stud st, HttpServletRequest req) {
		
		
		
		System.out.println(st.getUpfile_1().getOriginalFilename());
		System.out.println(st.getUpfile_1().getName());
		System.out.println(st.getUpfile_1().getContentType());
		System.out.println(st.getUpfile_1().getSize());	//용량
		System.out.println(st.getUpfile_1().isEmpty());	//비어있는가 유무 boolean타입
		
		String path = req.getRealPath("/up");
		path= "E:\\ojh\\study\\sts_work\\mvcProj\\src\\main\\webapp\\up";
		
		try {
			FileOutputStream fos = new FileOutputStream(path+"\\"+st.getUpfile_1().getOriginalFilename());
			fos.write(st.getUpfile_1().getBytes());
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String fe = "";
		int i = st.getUpfile_2().getOriginalFilename().lastIndexOf('.');
		
		if (i > 0) {
		    fe = st.getUpfile_2().getOriginalFilename().substring(i+1);
		}
		System.out.println(st.getUpfile_2().getOriginalFilename());
		System.out.println(i);
		System.out.println("너의이름은"+fe);
		
		if(!fe.equals("hwp")&&!fe.equals("docx")&&!fe.equals("txt")) {
			st.setMsg("문서가아닙니당");
		}else {
			System.out.println("문서가아닙니당");
			st.setMsg("문서입니당");
		}
		
		return "req/upCom4";
	}
	
	@RequestMapping(value ="/req/joinForm", method = RequestMethod.GET)
	String joinForm() {
		return "req/joinForm";
	}
	
	@RequestMapping(value = "/req/joinForm", method = RequestMethod.POST)
	ModelAndView joinComplete(Stud st, HttpServletRequest req) {
		
		ModelAndView res = new ModelAndView();
		
		String ttt = "req/joinComplete";
		
		if(st.getUpfile_1().isEmpty() || st.getUpfile_2().isEmpty()) {
			System.out.println("파일 빈칸 에러");
			//ttt = "redirect:joinForm?age="+st.getAge();
			
			res.addObject("age",st.getAge());	//기본자료형과 문자열만 redirect 할때 parameter로 보낼수 있다.
			ttt= "redirect:joinForm";	//이방법도 있지만 alert띄워서 보내는 방법이 많다.
		}
		else if(!Pattern.matches(".*[.](jpg|jpeg|bmp|png|gif)", st.getUpfile_1().getOriginalFilename().toLowerCase())) {
			ttt = "req/alert";
		}
		else if(!Pattern.matches(".*[.](txt|doc|docx|hwp|pdf)", st.getUpfile_2().getOriginalFilename().toLowerCase())) {
			ttt = "req/alert";
		}
		
		res.setViewName(ttt);
			
			return res;
			
	}
	

	String joinComplete123(Stud st, HttpServletRequest req) {
		
		if(st.getUpfile_1().isEmpty() || st.getUpfile_2().isEmpty()) {
		System.out.println("파일 빈칸 에러");
		return "redirect:joinForm?age="+st.getAge();
		
		}
		if(!Pattern.matches(".*[.](jpg|jpeg|bmp|png|gif)", st.getUpfile_1().getOriginalFilename().toLowerCase())) {
			return "req/alert";
		}
		if(!Pattern.matches(".*[.](txt|doc|docx|hwp|pdf)",st.getUpfile_2().getOriginalFilename().toLowerCase())) {
			return "req/alert";
		}
		
			
			return "req/joinComplete";
	
	}
}