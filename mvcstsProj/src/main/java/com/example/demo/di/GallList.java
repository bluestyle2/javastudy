package com.example.demo.di;

import org.springframework.stereotype.Service;

import com.example.demo.model.PathGallDTO;

@Service
public class GallList implements PathService {

	@Override
	public Object execute(PathGallDTO dto) {
		// TODO Auto-generated method stub
		return "갤러리 리스트 데이터"+dto;
	}

}
