package aaa.di;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import aaa.model.BoardDTO;
import aaa.model.BoardMapper;

@Service
public class BoardInsertGid implements BoardService {

	@Resource
	BoardMapper bm;
	
	@Override
	public Object execute(BoardDTO dto) {
		//"마이바티스에서 받아올 목록 데이터";
		
		int id = bm.maxId();
		
		dto.setId(id);
		dto.setGid(id);
		dto.setTitle("gid이다");
		dto.setPname("gid병철");
		dto.setPw("1111");
		dto.setContent("gid병철 내용");
		dto.setUpfile("gid병철 파일");
		
		int res = bm.insertGid(dto);
		System.out.println("BoardInsertGid 결과 : "+id+","+res);
		return dto;
	}

}
