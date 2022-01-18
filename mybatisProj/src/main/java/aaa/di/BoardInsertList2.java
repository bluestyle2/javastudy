package aaa.di;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import aaa.model.ArrDTO;
import aaa.model.BoardDTO;
import aaa.model.BoardMapper;

@Service
public class BoardInsertList2 implements BoardService {

	@Resource
	BoardMapper bm;
	
	@Override
	public Object execute(BoardDTO dto) {
		//"마이바티스에서 받아올 목록 데이터";
		
		ArrayList<BoardDTO> arr = new ArrayList<>();
		for(int i = 200; i< 205; i++) {
			BoardDTO one = new BoardDTO("제목"+i, "작성자"+i, "1111", "내용"+i);
			arr.add(one);
		}
		ArrDTO ad = new ArrDTO();
		ad.setArr(arr);
		
		int res = bm.insertList2(ad);
		System.out.println("BoardInsertList 결과 : "+res);
		return null;
	}

}
