package control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;
import model.BoardDTO;
import model.BoardModel;

public class BoardList implements BoardControl {

	@Override
	public BoardModel execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		System.out.println("BoardList.execute() 실행");
		
//		for (BoardDTO dto : new BoardDAO().list()) {
//			System.out.println(dto);
//		}
		//request를 가져왔으니까 사용가능
		
		int page = 1;
		int limit = 5;
		int pageLimit = 4;
		
		int total = new BoardDAO().total();
		
		int totalCnt = total/limit;
		
		if(total%limit > 0) {
			totalCnt++;
		}
		
		if(request.getParameter("page")!=null && !request.getParameter("page").trim().equals("")) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		
		int first = (page-1)*limit;
		int firstPage = (page-1)/pageLimit*pageLimit+1;
		int endPage = firstPage+pageLimit-1;
		
		if(endPage > totalCnt) {
			endPage = totalCnt;
		}
		
		System.out.println("현재 페이지:"+page+","+total+","+totalCnt+","+firstPage+","+endPage);
		
		request.setAttribute("nowPage", page);
		request.setAttribute("totalCnt", totalCnt);
		request.setAttribute("first", first);
		request.setAttribute("firstPage", firstPage);
		request.setAttribute("endPage", endPage);
		request.setAttribute("mainData", new BoardDAO().list(first, limit));
		request.setAttribute("mainUrl", "list");	//include할때 어디로 가라라고 설정
		
		return null;
		
	}

}
