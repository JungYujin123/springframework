package com.jsp.controller;

import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSessionFactory;

import com.jsp.dao.MemberDAO;
import com.jsp.dto.MemberVO;
import com.jsp.service.MemberService;
import com.jsp.service.MemberServiceImpl;


public class MemberUpdateServlet extends HttpServlet {
	
	private MemberService memberService;
	
	String url ="/WEB-INF/views/member/update.jsp";

	@Override
	public void init(ServletConfig config) throws ServletException {
		/*
		 * SqlSessionFactory sqlSessionFatory = new OracleMybatisSqlSessionFactory();
		 * MemberDAO memberDAO = new MemberDAOImpl();
		 */
		String memberServiceStr = config.getInitParameter("memberService");
		String memberDAOStr = config.getInitParameter("memberDAO");
		String sqlSessionFactoryStr = config.getInitParameter("sqlSessionFactory");
		
		try {
			memberService = (MemberService)Class.forName(memberServiceStr).newInstance();
			MemberDAO memberDAO = (MemberDAO)Class.forName(memberDAOStr).newInstance();
			SqlSessionFactory sqlSessionFactory = (SqlSessionFactory)Class.forName(sqlSessionFactoryStr).newInstance();
			
					
			
			if(memberService instanceof MemberServiceImpl ) {
				MemberServiceImpl memberServiceImpl = (MemberServiceImpl)memberService;
				memberServiceImpl.setSqlSessionFactory(sqlSessionFactory);
				memberServiceImpl.setMemberDAO(memberDAO);
				
				System.out.println("memberService injection clear!");
			}
		}catch(Exception e) {
			System.out.println("초기화 실패입니다.");
			e.printStackTrace();
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		String url = "/WEB-INF/views/member/update.jsp";
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		
		MemberVO member=null;
		try {
			member = memberService.getMember(id);
			request.setAttribute("member", member);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		request.getRequestDispatcher(url).forward(request, response);
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		
		 String id = request.getParameter("id"); 
		 String name =request.getParameter("name"); 
		 String pwd = request.getParameter("password");
		 String address = request.getParameter("address"); 
		 String email =request.getParameter("email"); 
		 String phone = request.getParameter("phone");
		
		 System.out.println(">>>"+id);
		 System.out.println(">>>"+name);
		 System.out.println(">>>"+pwd);
		 System.out.println(">>>"+address);
		 System.out.println(">>>"+email);
		 System.out.println(">>>"+phone);
		 
		 
		 
		 MemberVO member = new MemberVO();

	   	 member.setId(id); 
		 member.setName(name); 
		 member.setPwd(pwd);
		 member.setAddress(address); 
		 member.setEmail(email); 
		 member.setPhone(phone);
		 
		 int cnt = 0;
		 try {
			 cnt = memberService.update(member);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		 response.sendRedirect("detail?id="+id);
	}

}
