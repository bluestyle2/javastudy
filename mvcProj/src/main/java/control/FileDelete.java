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

public class FileDelete implements BoardControl {

	@Override
	public BoardModel execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("FileDelete.execute() 실행");
		
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
			dto.setId(Integer.parseInt(mm.getParameter("id"))	);			
			dto.setPw(mm.getParameter("pw"));
			dto.setUpfile(mm.getParameter("upfile")); 				
			
			String msg = "파일 삭제 실패";
			String goUrl = "BoardModifyForm?id="+dto.getId()+"&page="+mm.getParameter("page");
			
			if( new BoardDAO().idPwChk(dto) != null) { 				
				
				if(dto.getUpfile() != null && !dto.getUpfile().trim().equals("")) {	
					new File(path+"\\"+dto.getUpfile()).delete();
					new BoardDAO().fileDelete(dto);
				}	
				
				msg = "파일이 삭제되었습니다.";	
			}
						
			request.setAttribute("mainUrl", "chk");	
			request.setAttribute("msg", msg);			
			request.setAttribute("goUrl", goUrl);	
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
		
	}

}
