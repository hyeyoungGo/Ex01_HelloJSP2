package com.bit_ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/brain/BBSPostServlet")
public class BBSPostServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>게시판 글스기 출력화면</title></head>");
		out.println("<body>");
		out.printf("이름 : %s <p>", name);
		out.printf("제목 : %s <p>", title);
		out.println("=======================<p>");
		out.printf("<pre> %s </pre>", content);
		out.println("=======================<p>");
		out.println("저장되었습니다.");
		out.println("</body>");
		out.println("</html>");
		
	}

}
