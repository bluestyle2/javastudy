package aaa.di;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import aaa.model.BoardDTO;
import aaa.model.BoardMapper;

@Service
public class BoardModifyReg implements BoardService {

	@Resource
	BoardMapper bm;
	
	@Override
	public Object execute(BoardDTO dto) {
		//"마이바티스에서 받아올 목록 데이터";

		dto.setTitle("변경제목"+dto.getId());
		dto.setPname("변경작성자"+dto.getId());
		dto.setContent("변경내용"+dto.getId());
		
		int res = bm.modify(dto);
		System.out.println("BoardModifyReg 결과 : "+res);
		return null;
	}

}
