package com.bit_ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/brain/pinfo-result")
public class PersonalInfoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String gender = request.getParameter("gender");
		if(gender.equals("male")) {
			gender = "남";
		} else {
			gender = "여";
		}
		String iNotice = request.getParameter("iNotice");
		String cNotice = request.getParameter("cNotice");
		String dNotice = request.getParameter("dNotice");
		String job = request.getParameter("job");
		
		System.out.println(iNotice);
		System.out.println(cNotice);
		System.out.println(dNotice);
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>개인정보 출력화면</title></head>");
		out.println("<body>");
		out.println("<h2>개인정보 입력</h2>");
		out.printf("이름 : %s <p>", name);
		out.printf("아이디 : %s <p>", id);
		out.printf("암호 : %s <p>",pw);
		out.printf("성별 : %s <p>", gender);
		out.printf("공지 메일 : %s <p>", noticeToHangul(iNotice));
		out.printf("광고 메일 : %s <p>", noticeToHangul(cNotice));
		out.printf("배송 메일 : %s <p>", noticeToHangul(dNotice));
		out.println("</body>");
		out.println("</html>");
		
		
	}
	
	private String noticeToHangul(String notice) {
		if(notice == null) {
			return "받지않음";
		} else if(notice.equals("on")) {
			return "받음";
		} else {
			return notice;
		}
		/*System.out.println("name : " + name);
		System.out.println("id : " + id);
		System.out.println("password : " + pw);
		System.out.println("gender : " + gender);
		System.out.println("iNotice : " + iNotice);
		System.out.println("cNotice : " + cNotice);
		System.out.println("job : " + job);	*/
	}

}
