package web_study_02.unit03;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MethodServlet")
public class MethodServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setAttribute("method", "get");
      processRequest(request, response);
   }
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setAttribute("method", "post");
      processRequest(request, response);
   }
   
   private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
      RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
      dispatcher.forward(request, response);
   }

}