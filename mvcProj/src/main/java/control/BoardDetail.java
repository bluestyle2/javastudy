package control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;
import model.BoardModel;

public class BoardDetail implements BoardControl {

	@Override
	public BoardModel execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		System.out.println("BoardDetail.execute() 실행");
		
//		for (BoardDTO dto : new BoardDAO().list()) {
//			System.out.println(dto);
//		}
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		//System.out.println(new BoardDAO().detail(id));
		new BoardDAO().addCount(id);//카운트를 끌어올린 다음에 디테일에서 가져오겠다는 뜻
		//request를 가져왔으니까 사용가능
		request.setAttribute("mainData", new BoardDAO().detail(id));
		request.setAttribute("mainUrl", "detail");	//include할때 어디로 가라라고 설정
		
		return null;
		
	}
}
	
