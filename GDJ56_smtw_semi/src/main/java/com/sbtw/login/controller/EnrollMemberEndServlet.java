package com.sbtw.login.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smtw.member.model.service.MemberService;
import com.smtw.member.model.vo.Member;

/**
 * Servlet implementation class EnrollMemberEndServlet
 */
@WebServlet("/logIn/enrollMemberEnd.do")
public class EnrollMemberEndServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnrollMemberEndServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		//회원이 입력한 값 가져오기
		String memberId=request.getParameter("inputId");
		String memberPwd=request.getParameter("inputPwd");
		String memberName=request.getParameter("inputName");
		String birthYear=request.getParameter("yy");
		String birthMonth=request.getParameter("month");
		String birthDay=request.getParameter("day");
		String birth=birthYear+birthMonth+birthDay;
		String phone=request.getParameter("inputPhone");
		char gender=request.getParameter("gender").charAt(0);
		String email=request.getParameter("inputEmail");
		String address="("+request.getParameter("inputAddress_postcode")+")"+request.getParameter("inputAddress_address")+","+request.getParameter("inputAddress_detailAddress");
//		System.out.println(userId);
//		System.out.println(password);
//		System.out.println(userName);
//		System.out.println(birthYear);
//		System.out.println(birthMonth);
//		System.out.println(birthDay);
//		System.out.println(birth);
//		System.out.println(phone);
//		System.out.println(gender);
//		System.out.println(email);
//		System.out.println(address);
		Member m=Member.builder()
				.memberId(memberId)
				.memberPwd(memberPwd)
				.memberName(memberName)
				.email(email)
				.phone(phone)
				.birth(birth)
				.gender(gender)
				.address(address)
				.build();
		int result=new MemberService().insertMember(m);
		if(result>0) System.out.println("성공");
		else System.out.println("실패");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
