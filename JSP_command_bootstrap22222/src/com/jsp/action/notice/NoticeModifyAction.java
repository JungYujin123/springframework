package com.jsp.action.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.action.Action;
import com.jsp.command.NoticeModifyCommand;
import com.jsp.controller.XSSHttpRequestParameterAdapter;
import com.jsp.dto.NoticeVO;
import com.jsp.service.NoticeService;

public class NoticeModifyAction implements Action {

	private NoticeService noticeService;
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//수정된 notice번호를 리다이렉트로 심어줌
		String url = "redirect:/notice/detail.do?form=modify&nno="+request.getParameter("nno"); 
		
		NoticeModifyCommand noticeReq = (NoticeModifyCommand)XSSHttpRequestParameterAdapter.execute(request, NoticeModifyCommand.class, true);
		
		
		NoticeVO notice = noticeReq.toNoticeVO();
		
		noticeService.modify(notice);
		
		
		return url;
	}

}
