package com.example.demo.model;

import org.springframework.stereotype.Service;

@Service
public class NoticeDAO {

	public String list() {		
		return "목록 데이터";
	}
	
	public String detail(NoticeDTO dto) {
		return "상세 데이터:"+dto.id;
	}
	
	public String insert(NoticeDTO dto) {		
		return "입력 처리:"+dto;
	}
	
	public String delete(NoticeDTO dto) {		
		return "삭제 처리:"+dto.id;
	}
	
	public String plus(CalcDTO dto) {		
		return "합계 결과 :"+dto;
	}
}
