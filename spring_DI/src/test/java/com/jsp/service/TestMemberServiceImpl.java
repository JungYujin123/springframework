package com.jsp.service;


import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.jsp.command.Criteria;
import com.jsp.dto.MemberVO;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/spring/context/root-context.xml")
public class TestMemberServiceImpl {
	
	//@Autowired type 비교
	@Resource(name = "searchMemberService") //bean id 비교
	SearchMemberService memberService;
	
	@Test
	public void testGetList()throws Exception{
		Criteria cri = new Criteria();
		
		List<MemberVO> memberList
		=(List<MemberVO>)memberService.getSearchMemberList(cri).get("memberList");
		

		Assert.assertEquals(7,memberList.size());
		
	}

}
