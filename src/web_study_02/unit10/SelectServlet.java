package web_study_02.unit10;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String job = request.getParameter("job");
		String interests[] = request.getParameterValues("interest");
		
		if (interests == null)
			interests = new String[] { "선택한 분야가 없습니다." };
		String arrToInterests = Arrays.stream(interests).collect(Collectors.joining(", "));
		
		request.setAttribute("job", job);
		request.setAttribute("arrToItems", arrToInterests);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("10_result.jsp");
		dispatcher.forward(request, response);
	}

}
