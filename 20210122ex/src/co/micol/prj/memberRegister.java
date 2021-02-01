package co.micol.prj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/memberRegister")
public class memberRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public memberRegister() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		    request.setCharacterEncoding("utf-8");
	
		    String name = request.getParameter("name");
		    String id = request.getParameter("id");
		    String pw = request.getParameter("pw");
		    String hobbys[] = request.getParameterValues("hobbys");
		    String gender =  request.getParameter("gender");
		    String tel = request.getParameter("tel");
		    
		    String message = null;
		    
		    if(id.equals("hong") && pw.equals("1234")) {
				message = "회원가입 됐습니다.";
			}else {
				message = "가입 불가능..";
			}
			
			request.setAttribute("msg", message);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/member/memberRegister.jsp");
			dispatcher.forward(request, response); 

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
