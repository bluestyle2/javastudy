package control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.BoardDAO;
import model.BoardDTO;
import model.BoardModel;

public class BoardInsertReg implements BoardControl {

	@Override
	public BoardModel execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		System.out.println("BoardInsertReg.execute() 실행");
		
		String path = request.getRealPath("/fff");	//저장되는 경로 설정
		path = "E:\\ojh\\study\\java_work\\mvcProj\\src\\main\\webapp\\fff";	//저장경로
				
		try {
			MultipartRequest mm = new MultipartRequest(
					request, 
					path, 
					1024*1024*10,
					"utf-8",
					new DefaultFileRenamePolicy());
			
			BoardDTO dto = new BoardDTO();
			dto.setTitle(mm.getParameter("title"));
			dto.setPname(mm.getParameter("pname"));
			dto.setPw(mm.getParameter("pw"));
			dto.setContent(mm.getParameter("content"));
			dto.setUpfile(mm.getFilesystemName("upfile"));
			
			int id = new BoardDAO().insert(dto);
			
			request.setAttribute("mainUrl", "chk");	
			request.setAttribute("msg", "작성되었습니다.");			
			request.setAttribute("goUrl", "BoardDetail?id="+id);	
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		return null;
		
	}

}
