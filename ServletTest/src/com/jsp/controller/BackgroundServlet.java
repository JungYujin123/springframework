package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost/ServletTest/background?color=red
@WebServlet("/background")
public class BackgroundServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		//servlet- jsp 연결 : attribute object
		//client- 서버  연결 : getparmiter String   (set은 client가 입력하기 떄문에 setparamiter 없음)
		
		String color = request.getParameter("color");
		
		request.setAttribute("color", color);
		
		request.getRequestDispatcher("/WEB-INF/views/background.jsp").forward(request, response);
		
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter out = response.getWriter();
//		
//		out.println("<DOCTYPE! html>");
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>");
//		out.println("</title>");
//		out.println("<style>");
//		out.println("body {");
//		out.println("background:" +color+";");
//		out.println("}");
//		out.println("</style>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("</body>");
//		out.println("</html>");
		
	}
	
	
	
	
	
	
	
	
	
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
