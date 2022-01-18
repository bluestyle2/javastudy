package aaa.di;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import aaa.model.BoardDTO;
import aaa.model.BoardMapper;

@Service
public class BoardInsertReg implements BoardService {

	@Resource
	BoardMapper bm;
	
	@Override
	public Object execute(BoardDTO dto) {
		//"마이바티스에서 받아올 목록 데이터";
		
		dto.setTitle("제목이다");
		dto.setPname("오병철");
		dto.setPw("1111");
		dto.setContent("오병철 내용");
		dto.setUpfile("오병철 파일");
		
		int res = bm.inserttt(dto);
		System.out.println("BoardInsertReg 결과 : "+res);
		return null;
	}

}
