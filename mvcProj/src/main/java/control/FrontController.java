package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/bbb/*")	//  /bbb/가 포함되면 FrontController로 이동한다
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글깨짐 현상 발생때문에 없애야된다
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 파일명 : BoardList만 잘라내기 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		
		String uri = request.getRequestURI();	// /mvcProj/bbb/BoardList라는 출력이 나옴 , contextPath는 /mvcProj/
		String service = uri.substring(request.getContextPath().length()+"/bbb/".length());	//BoardList
										//mvcProj ==> 7		+               5  =  5를 더해서 합인 13번째부터 글자를 가져온다
		//System.out.println(service);		
		//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ BoardList execute 메소드 실행 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
			
		
		try {
			
			//Object oo = new control.BoardList(); 로 이동을 한것
			
			//sub Controller(service) 실행, 데이터받는작업
			BoardControl con = (BoardControl)Class.forName("control."+service).newInstance();//control.BoardList로생성을함.
			//서비스에 진입 = BoardList의 execute를 실행					   //패키지명 //BoardList//새로운 객체생성
			con.execute(request, response);					
			//System.out.println(con);
			
			//forward = 경로 : /view/template.jsp   ※dispatcher = forward, include둘다 할수있다
			RequestDispatcher dispatcher = request.getRequestDispatcher("/view/template.jsp");	//여기서부터 view로 보냄
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
