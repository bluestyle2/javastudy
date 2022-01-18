package control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardModel;

public interface BoardControl {

	//excute를 실행하면 BoardModel를 리턴한다.
	BoardModel execute(HttpServletRequest request, HttpServletResponse response);
	
	
}
