package control;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.BoardDAO;
import model.BoardDTO;
import model.BoardModel;

public class BoardReplyReg implements BoardControl {

	@Override
	public BoardModel execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BoardReplyReg.execute() 실행");		
			
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			BoardDTO dto = new BoardDTO();
			dto.setTitle(request.getParameter("title"));
			dto.setPname(request.getParameter("pname"));
			dto.setPw(request.getParameter("pw"));
			dto.setContent(request.getParameter("content"));			
			dto.setId(Integer.parseInt(request.getParameter("id")));
			dto.setLev(Integer.parseInt(request.getParameter("lev")));
			dto.setSeq(Integer.parseInt(request.getParameter("seq")));
			dto.setGid(Integer.parseInt(request.getParameter("gid")));
			
			int id = new BoardDAO().reply(dto);
			
			request.setAttribute("mainUrl", "chk");	
			request.setAttribute("msg", "작성되었습니다.");			
			request.setAttribute("goUrl", "BoardDetail?id="+id+"&page="+request.getParameter("page"));	
	
		return null;
		
	}

}
