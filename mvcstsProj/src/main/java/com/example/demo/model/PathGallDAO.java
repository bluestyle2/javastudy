package com.example.demo.model;

import org.springframework.stereotype.Service;

@Service
public class PathGallDAO {

	public PathGallDTO detail(PathGallDTO dto) {
		
		System.out.println("PathGallDAO detail() 실행");
		PathGallDTO res = new PathGallDTO();
		return res;
	}
}
