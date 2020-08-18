package web_study_02.unit05;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
		/*
		 * response.setContentType("text/html; charset=UTF-8"); String id =
		 * request.getParameter("id"); int age =
		 * Integer.parseInt(request.getParameter("age"));
		 * 
		 * PrintWriter out = response.getWriter(); out.print("<html><body>");
		 * out.println("당신이 입력한 정보입니다.<br>"); out.println("아이디 : "); out.println(id);
		 * out.println("<br> 나이 : "); out.println(age);
		 * 
		 * // 자바스크립트로 이전 페이지로 이동하는 링크로 만들어줌
		 * out.println("<br><a href='javascript:history.go(-1)'>다시</a>");
		 * out.print("</body></html>"); out.close();
		 */
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id").trim();
		int age = Integer.parseInt(request.getParameter("age").trim());
		
		request.setAttribute("id", id);
		request.setAttribute("age", age);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("05_result.jsp");
		dispatcher.forward(request, response);
		
	}

}
