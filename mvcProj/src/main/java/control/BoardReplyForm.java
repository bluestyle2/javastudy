package control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;
import model.BoardModel;

public class BoardReplyForm implements BoardControl {
		
	@Override
	public BoardModel execute(HttpServletRequest request, HttpServletResponse response) {	
		
		System.out.println("BoardReplyForm.execute() 실행");
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		request.setAttribute("mainData", new BoardDAO().detail(id));
		request.setAttribute("mainUrl", "replyForm");	//include할때 어디로 가라라고 설정
		
		return null;
		
	}

}
