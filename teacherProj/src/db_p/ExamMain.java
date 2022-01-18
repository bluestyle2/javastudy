package db_p;

import java.util.ArrayList;

public class ExamMain {

	public static void main(String[] args) {
		
	//	ExamDAO dao = new ExamDAO();
		
	//	ArrayList<ExamDTO> arr = dao.List();
		
		ArrayList<ExamDTO> arr = new ExamDAO().List();
		
	//	System.out.println("목록-----");
		
		for (ExamDTO dto : arr) {
	//		System.out.println(dto);
		}
		
		System.out.println("상세------");		
		ExamDTO dto = new ExamDAO().detail("");
		System.out.println(dto);
		
		System.out.println("추가------");		
//		ExamDTO dto = new ExamDAO().detail("ddd");
//		System.out.println(dto);
		//dto = new ExamDTO("final","ccc",70,60,80);
		//int cnt = new ExamDAO().insert(dto);
		//System.out.println("실행갯수:"+cnt);
		
		System.out.println("수정------");
		dto = new ExamDTO("final","rrr", 12,22,33);
		
		new ExamDAO().modify(dto);
		//System.out.println("실행갯수:"+cnt);
		
		System.out.println("삭제------");
		
	//	cnt = new ExamDAO().delete("ttt");
	//	System.out.println("실행갯수:"+cnt);
		
		new ExamDAO().List2();
	}

}
