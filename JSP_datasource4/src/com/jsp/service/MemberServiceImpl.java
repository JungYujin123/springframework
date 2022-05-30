package com.jsp.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.jsp.dao.MemberDAO;
import com.jsp.dto.MemberVO;

public class MemberServiceImpl implements MemberService{
	
	private SqlSessionFactory sqlSessionFactory;
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	private MemberDAO memberDAO;
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	@Override
	public List<MemberVO> getMemberList() throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			List<MemberVO> memberList = memberDAO.selectMemberList(session);
			return memberList;		
		}finally {
			session.close();
		}
	}
	
	@Override
	public MemberVO getMember(String id) throws SQLException{
		SqlSession session= sqlSessionFactory.openSession(false);
		
		MemberVO member = null;
		try {
			member = memberDAO.selectMemberById(session, id);		
	
		}finally {
			session.close();
		}
		
		return member;
	}

	@Override
	public int insert(MemberVO member) throws SQLException {
	SqlSession session= sqlSessionFactory.openSession();
		int cnt = 0 ;
		try {
			cnt = memberDAO.insert(session, member);		
		}finally {
			session.close();
		}
		return cnt;
	}

	@Override
	public int update(MemberVO member) throws SQLException {
		SqlSession session= sqlSessionFactory.openSession();
		int cnt = 0 ;
		try {
			cnt = memberDAO.update(session, member);		
		}finally {
			session.close();
		}
		return cnt;
	} 

	@Override
	public int delete(String id) throws SQLException {
		SqlSession session= sqlSessionFactory.openSession();
		int cnt = 0 ;
		try {
			cnt = memberDAO.delete(session, id);		
		}finally {
			session.close();
		}
		return cnt;
	}


}
