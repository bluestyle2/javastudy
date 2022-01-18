package aaa.di;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import aaa.model.BoardDTO;
import aaa.model.BoardMapper;

@Service
public class BoardInsertList implements BoardService {

	@Resource
	BoardMapper bm;
	
	@Override
	public Object execute(BoardDTO dto) {
		//"마이바티스에서 받아올 목록 데이터";
		
		ArrayList<BoardDTO> arr = new ArrayList<>();
		for(int i = 100; i< 105; i++) {
			BoardDTO one = new BoardDTO("제목"+i, "작성자"+i, "1111", "내용"+i);
			arr.add(one);
		}
		
		int res = bm.insertList(arr);
		System.out.println("BoardInsertList 결과 : "+res);
		return null;
	}

}
