package control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardModel;

public class BoardDeleteForm implements BoardControl {

	@Override
	public BoardModel execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		System.out.println("BoardDeleteForm.execute() 실행");

		request.setAttribute("mainUrl", "deleteForm");
		
		return null;
		
	}

}
//BoardInsertForm 서브 controller에서는 template.jsp가 글쓰기 폼(insertForm)을 mainUrl 값으로 지정해줍니다.
//새로 생성하는 것이기 때문에 db에서 가져올것이 없음. 그러므로 mainData는 필요없다.
//template.jsp에서 입력폼.jsp를 호출하도록 mainUrl만 지정해준다.