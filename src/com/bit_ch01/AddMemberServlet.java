package com.bit_ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddMemberServlet")
public class AddMemberServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		String mId = requset.getParameter("ID");
		String mName = requset.getParameter("NAME");
		String mPw = requset.getParameter("PW");
		String mPwpw = requset.getParameter("PWPW");
		String mPwhint = requset.getParameter("PW_HINT");
		String mHintAn = requset.getParameter("HINT_ANSWER");
		String mTel1 = requset.getParameter("TEL1");
		String mTel2 = requset.getParameter("TEL2");
		String mTel3 = requset.getParameter("TEL3");
		String mEmail = requset.getParameter("EMAIL");
		
		int tel1 = Integer.parseInt(mTel1);
		int tel2 = Integer.parseInt(mTel2);
		int tel3 = Integer.parseInt(mTel3);
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>가입 확인</title></head>");
		out.printf(mId + "<br>" + mName + "<br>" + mPw + "<br>" + mPwpw + "<br>" + mPwhint + "<br>" + mHintAn + "<br>");
		out.printf("%d - %d - %d", tel1, tel2, tel3 ); 
		out.printf("<br>" + mEmail);
		out.println("</html>");
		
	}

}
