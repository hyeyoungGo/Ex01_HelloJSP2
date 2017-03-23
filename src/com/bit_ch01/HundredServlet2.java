package com.bit_ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HundredServlet2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		int total = 0;
		for(int cnt=1; cnt<=100; cnt++) {
			total += cnt;
		}
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>1부터 100까지의 합</title></head>");
		out.println("<body>");
		out.printf("합계 : 1 + 2 + 3 + ... + 100 = %d", total);
		out.println("</body>");
		out.println("</html>");
	}

}
