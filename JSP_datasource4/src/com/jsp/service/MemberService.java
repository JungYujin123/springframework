package com.jsp.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jsp.dto.MemberVO;

public interface MemberService {
	
	// 회원리스트조회
	List<MemberVO> getMemberList() throws SQLException;
	
	MemberVO getMember(String id) throws SQLException;

	int insert(MemberVO member) throws SQLException;
	int update(MemberVO member) throws SQLException;
	int delete(String id) throws SQLException;
}
