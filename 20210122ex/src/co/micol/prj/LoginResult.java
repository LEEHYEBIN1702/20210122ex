package co.micol.prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginResult")
public class LoginResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginResult() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String message = null;
		
		
		if(id.equals("hong") && pw.equals("1234")) {
			message = "환영합니다.";
		}else {
			message = "아이디 또는 패스워드가 틀려요.";
		}
		
		request.setAttribute("msg", message);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/member/loginResult.jsp");
		dispatcher.forward(request, response); // 돌아갈 페이지로 갈 때 내 요청도 가지고 가라.. //request, response 짝으로 써줘야함. 결과 값이 제대로 보임.
		//response.sendRedirect("jsp/member/loginResult.jsp"); //sendRedirect로 출력해보니 결과 값이 null 원하는 결과가 안 보여진다..
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
