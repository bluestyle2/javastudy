package aaa.di;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import aaa.model.BoardDTO;
import aaa.model.BoardMapper;

@Service
public class BoardInsertGid4 implements BoardService {

	@Resource
	BoardMapper bm;
	
	@Override
	public Object execute(BoardDTO dto) {
		//"마이바티스에서 받아올 목록 데이터";
		
		dto.setTitle("gid4제목이다");
		dto.setPname("gid4오병철");
		dto.setPw("1111");
		dto.setContent("gid4오병철 내용");
		dto.setUpfile("gid4오병철 파일");
		
		int res = bm.insertGid4(dto);
		System.out.println("BoardInsertGid3 결과 : "+dto);
		return dto;
	}

}
