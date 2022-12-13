package com.smtw.mypage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smtw.mapage.model.service.MypageService;

/**
 * Servlet implementation class mapageRejectFriendsServlet
 */
@WebServlet("/mypage/rejectFriends.do")
public class mapageRejectFriendsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mapageRejectFriendsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		
		String userId=request.getParameter("id");
		String memberFrom = request.getParameter("memberfrom");
		int result = new MypageService().rejectFriends(userId,memberFrom);
		
		
		String msg="", loc="";
		if(result<1) {
			msg="친구 신청 거절에 실패했습니다. 다시 시도해주세요";
		}else {
			msg="친구 신청를 거절하셨습니다!";
		}
		loc="/mypage/mypageFriends.do?id="+userId;
		
		request.setAttribute("msg", msg);
		request.setAttribute("loc", loc);
		request.getRequestDispatcher("/views/common/msg.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
