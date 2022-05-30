package com.jsp.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.action.Action;
import com.jsp.command.MemberRegistCommand;
import com.jsp.controller.HttpRequsetParameterAdapter;
import com.jsp.dto.MemberVO;
import com.jsp.service.MemberService;

public class MemberRegistAction implements Action {
	MemberService memberService;
	
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url="/member/regist_success";
		
		try {
			MemberRegistCommand memberReq =(MemberRegistCommand)HttpRequsetParameterAdapter.excute(request, MemberRegistCommand.class);
			
			MemberVO member = memberReq.toMemberVO();
			System.out.println(member.getId());
			memberService.regist(member);
			request.setAttribute("member", member);
		}catch (Exception e) {
			e.printStackTrace();
			//exception 자리
			//response.sendError(response.SC_INTERNAL_SERVER_ERROR);
			url="/member/regist_fail";
		}
		
		
		return url;
	
	}

}
