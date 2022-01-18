package aaa.tran.di;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import aaa.model.ArrDTO;
import aaa.model.BoardDTO;
import aaa.model.GenMapper;

@Service
public class GenService {

	@Resource
	GenMapper gm;
	
	PlatformTransactionManager manager;
	
	public Object list() {
		return gm.bblist();
	}
	
	public void genInsert() {
		ArrDTO dto = new ArrDTO(); 
		ArrayList<BoardDTO> arr = new ArrayList<>();
		arr.add(new BoardDTO(110, 103, "일반제목10", "일반오병철10", "1111", "일반내용10"));
		arr.add(new BoardDTO(111, 104, "일반제목11", "일반오병철11", "1111", "일반내용11"));
		arr.add(new BoardDTO(105, 105, "일반제목2", "일반오병철2", "1111", "일반내용2"));
		dto.setArr(arr);
		
		
		int res = 0;
		try {
			res=gm.genInsert(dto);
		}catch(Exception e) {
			System.out.println("에러발생:"+e.getMessage());
		}
		System.out.println("GenService.genInsert() 결과:"+res);
		
	}
	
	public void genInsert2() {
		ArrDTO dto = new ArrDTO(); 
		ArrayList<BoardDTO> arr = new ArrayList<>();
		arr.add(new BoardDTO(220, 220, "일반2제목1a", "일반2오병철1a", "1111", "일반2내용a"));
		arr.add(new BoardDTO(221, 221, "일반2제목1a", "일반2오병철1a", "1111", "일반2내용a"));
		arr.add(new BoardDTO(202, 202, "일반2제목2", "일반2오병철2", "1111", "일반2내용2"));
		dto.setArr(arr);
		
		
		int res = 0;
		try {
			res=gm.genInsert2(dto);
		}catch(Exception e) {
			System.out.println("에러발생:"+e.getMessage());
		}
		System.out.println("GenService.genInsert2() 결과:"+res);
		
	}
	
	public void genInsert3() {
		ArrDTO dto = new ArrDTO(); 
		ArrayList<BoardDTO> arr = new ArrayList<>();
		arr.add(new BoardDTO(410, 410, "트랜젝션4제목10", "트랜젝션4오병철10", "1111", "트랜젝션4내용10"));
		arr.add(new BoardDTO(411, 411, "트랜젝션4제목11", "트랜젝션4오병철11", "1111", "트랜젝션4내용11"));
		arr.add(new BoardDTO(402, 402, "트랜젝션4제목2", "트랜젝션4오병철2", "1111", "트랜젝션4내용2"));
		dto.setArr(arr);
		
		
		TransactionStatus status = manager.getTransaction(new DefaultTransactionDefinition());
		
		int res = 0;
		try {
			res=gm.genInsert2(dto);	//에러가 발생할 경우 0을 받음
		}catch(Exception e) {
			System.out.println("에러발생:"+e.getMessage());
		}finally {
			if(res ==0) {	
				manager.rollback(status);
		}else {
				manager.commit(status);
			}
		}
		System.out.println("GenService.genInsert3() 결과:"+res);
		
	}
	
}
