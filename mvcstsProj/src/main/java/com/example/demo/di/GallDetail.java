package com.example.demo.di;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.model.PathGallDAO;
import com.example.demo.model.PathGallDTO;

@Service
public class GallDetail implements PathService {

	@Resource
	PathGallDAO dao;
	
	@Override
	public Object execute(PathGallDTO dto) {

		dao.detail(dto);
		System.out.println("GallDetail execute()실행");
		
		return "갤러리 상세 데이터"+dto;
	}

}
