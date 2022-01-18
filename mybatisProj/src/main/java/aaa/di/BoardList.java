package aaa.di;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import aaa.model.BoardDTO;
import aaa.model.BoardMapper;

@Service
public class BoardList implements BoardService {

	@Resource
	BoardMapper bm;
	
	@Override
	public Object execute(BoardDTO dto) {
		//"마이바티스에서 받아올 목록 데이터";
		return bm.bblist(dto);
	}

}
