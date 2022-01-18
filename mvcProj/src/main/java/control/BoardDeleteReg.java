package control;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.BoardDAO;
import model.BoardDTO;
import model.BoardModel;

public class BoardDeleteReg implements BoardControl {

	@Override
	public BoardModel execute(HttpServletRequest request, HttpServletResponse response) {			
		System.out.println("BoardDeleteReg.execute() 실행");
							
		String path = request.getRealPath("/fff");	//저장되는 경로 설정
		path = "E:\\ojh\\study\\java_work\\mvcProj\\src\\main\\webapp\\fff";	//저장경로
		
		BoardDTO dto = new BoardDTO();
		dto.setId(Integer.parseInt(request.getParameter("id")));
		dto.setPw(request.getParameter("pw"));
		
		BoardDTO res = new BoardDAO().idPwChk(dto);
		
		String msg = "삭제 실패";
		String goUrl = "BoardDeleteForm?id="+dto.getId()+"&page="+request.getParameter("page");
		
		if(res!=null) { //id pw가 일치할때
																				//trim은 빈공간을 짜르는것
			if(res.getUpfile()!=null && !res.getUpfile().trim().equals("")) {	//파일이름이 존재한다면 삭제해라
				new File(path+"\\"+res.getUpfile()).delete();
			}			
			
			new BoardDAO().delete(dto);
			
			msg = "삭제되었습니다.";
			goUrl = "BoardList?page="+request.getParameter("page");
		}
		
		request.setAttribute("mainUrl", "chk");	
		request.setAttribute("msg", msg);			
		request.setAttribute("goUrl", goUrl);	
		
		return null;
		
	}

}
