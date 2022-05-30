package com.jsp.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jsp.dto.MemberVO;

public class MemberDAOImpl implements MemberDAO {
	
	

	@Override
	public List<MemberVO> selectMemberList(SqlSession session) throws SQLException {
		List<MemberVO> memberList = session.selectList("Member-Mapper.selectMemberList");
		return memberList;
	}
	

	@Override
	public MemberVO selectMemberById(SqlSession session, String id) throws SQLException {
		MemberVO member=session.selectOne("Member-Mapper.selectMemberById",id);			
		return member;
	}


	@Override
	public int insert(SqlSession session, MemberVO member) throws SQLException {
		int cnt = 0;
		cnt=session.insert("Member-Mapper.insert", member );		
		return cnt;

	}


	@Override
	public int update(SqlSession session, MemberVO member) throws SQLException {
		int cnt = 0;
		cnt=session.update("Member-Mapper.update", member );		
		return cnt;
	}


	@Override
	public int delete(SqlSession session, String id) throws SQLException {
		int cnt = 0;
		cnt=session.delete("Member-Mapper.delete", id);		
		return cnt;
	}


}








