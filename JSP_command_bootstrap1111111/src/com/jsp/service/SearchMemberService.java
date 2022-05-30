package com.jsp.service;

import java.util.Map;

import com.jsp.command.Criteria;

public interface SearchMemberService extends MemberService {

	Map<String,Object> getSearchMenmberList(Criteria cri)throws Exception; 



}
