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

public class BoardModifyReg implements BoardControl {

	@Override
	public BoardModel execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		System.out.println("BoardModifyReg.execute() 실행");
		
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
			dto.setTitle(mm.getParameter("title"));
			dto.setPname(mm.getParameter("pname"));
			dto.setPw(mm.getParameter("pw"));
			dto.setContent(mm.getParameter("content"));
			
			if(mm.getParameter("upfile")!=null) { 
				dto.setUpfile(mm.getParameter("upfile")); //text로 되었을때 이렇게 사용하겠다
			}else {
				dto.setUpfile(mm.getFilesystemName("upfile"));//text가 아니고 파일형태로 올라왔을때
			}
			
			System.out.println("upfile:"+mm.getFilesystemName("upfile"));
			
			int cnt = new BoardDAO().modify(dto);
			
			String msg = "수정되었습니다.";
			String goUrl = "BoardDetail?id="+dto.getId()+"&page="+mm.getParameter("page");
			
			if(cnt == 0) { 	//패스워드가 틀렸을때
				
				/*
				if(dto.getUpfile()!=null && !dto.getUpfile().trim().equals("")) {	//파일이름이 존재한다면 삭제해라
					new File(path+"\\"+dto.getUpfile()).delete();
				}*/			
				if(mm.getFilesystemName("upfile")!=null) {	//파일이름이 존재한다면 삭제해라
					new File(path+"\\"+dto.getUpfile()).delete();	//
				}
				msg = "수정실패.";
				goUrl = "BoardModifyForm?id="+dto.getId()+"&page="+mm.getParameter("page");
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
