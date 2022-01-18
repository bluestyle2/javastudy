package com.example.demo.model;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;



@Data
public class Stud {

	
	MultipartFile upfile_1, upfile_2;
	int phone;
	String pid,pname,msg,pw,tel;
	
	int age, kor, eng, mat, tot, avg, grade;
	
	boolean marriage;
	
	Date birth;
	
	
	
	public void calc() {
		tot = kor + eng + mat;
		avg = tot/3;
	}

	public Stud() {
		// TODO Auto-generated constructor stub
	}

	public Stud(String pid, String pname, String pw) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pw = pw;
	}
	
	public Stud(String pid, String pname, String pw,int grade) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pw = pw;
		this.grade = grade;
	}
	
}
