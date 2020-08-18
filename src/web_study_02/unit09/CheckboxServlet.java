package web_study_02.unit09;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CheckboxServlet")
public class CheckboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String items[] = request.getParameterValues("item");
		if (items == null)
			items = new String[] { "선택한 항목이 없습니다." };
		String arrToItems = Arrays.stream(items).collect(Collectors.joining(", "));

		request.setAttribute("arrToItems", arrToItems);

		RequestDispatcher dispatcher = request.getRequestDispatcher("09_result.jsp");
		dispatcher.forward(request, response);

		/*
		 * response.setContentType("text/html; charset=UTF-8");
		 * 
		 * PrintWriter out = response.getWriter(); out.print("<html><body>"); String
		 * items[] = request.getParameterValues("item");
		 * 
		 * if (items == null) { out.println("선택한 항목이 없습니다."); } else {
		 * out.println("당신이 선택한 항목입니다.<hr>"); for (String item : items) {
		 * out.println(item + " "); }
		 * 
		 * } out.println("<br><a href='javascript:history.go(-1)'>뒤로가기</a>");
		 * out.print("</body></html>"); out.close();
		 */
	}

}
