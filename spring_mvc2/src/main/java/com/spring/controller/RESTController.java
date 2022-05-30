package com.spring.controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController    //붙이면 각각에 ResponseBody안붙여도 됨
public class RESTController {

	private Map<String, Object> dataMap = new HashMap<String, Object>();
	
	{
		dataMap.put("abc", "123");
		dataMap.put("ㄱㄴㄷ", "123");
		
		Map<String, String> tempMap = new HashMap<String, String>();
		tempMap.put("a", "1");
		tempMap.put("b", "2");
		tempMap.put("c", "3");
		tempMap.put("d", "4");
		
		dataMap.put("temp", tempMap);
	}
	
	@RequestMapping(value = "/rest/old",method=RequestMethod.GET)
	public void restOld(HttpServletResponse response)throws Exception{
		
		//출력
		ObjectMapper mapper = new ObjectMapper();
		
		//content Type 결정
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//내보내기
		out.println(mapper.writeValueAsString(dataMap));
		
		//out 객체를 종료하고 환원.
		out.close();
	}
	
	/* @ResponseBody
	 * 어뎁터는 스트링만 받음,
	 *  Json이 맵을 스트링으로 바꾼걸 어뎁터에 줘서 바디에 얹음, 
	 *  헤더를 application json으로 바꿈
	 */ 
	@RequestMapping(value = "/rest/spring",method=RequestMethod.GET)
	//@ResponseBody
	public Map<String,Object> restSpring(){
		return dataMap;
	}
	
	//ResponseEntity 결과와 응답코드를 한번에 
	@RequestMapping(value = "/rest/best",method=RequestMethod.GET)
	//@ResponseBody
	public ResponseEntity<Map<String,Object>> restSpringBest(){
		
		ResponseEntity<Map<String,Object>> result = null;
		
		
		try {
			if(1==1) throw new Exception();
			
			result = new ResponseEntity<Map<String,Object>>(dataMap,HttpStatus.OK);
		}catch (Exception e) {
			result = new ResponseEntity<Map<String,Object>>(dataMap,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return result;
	}
	
	
	
}
