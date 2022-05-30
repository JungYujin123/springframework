package com.spring.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BasicController {

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test() {
		String url = "test/main";
		
		return url;
	}
	
	@RequestMapping(value="/test/param", method=RequestMethod.GET)
	public String testParam(HttpServletRequest request,HttpServletResponse response) {
		String url = "test/main";
		
		String message = request.getParameter("message");
		
		request.setAttribute("message", message);
		
		return url;
	}
	
	@RequestMapping(value="/test2/param", method=RequestMethod.GET)
	//Spring 400 error -> 요청한 parameter를 해당 타입으로 바꿀수 없을 때
	public String test2Param(String message,Model model) {
		String url = "test/main";
		
		model.addAttribute("message", message);
		
		return url;
	}
	
	@RequestMapping(value="/test3/param", method=RequestMethod.GET)
	public String test3Param(@ModelAttribute("message") String message) {
		String url = "test/main";
		
		return url;
	}
	
	//원래 value의 목적 : 요청 주소의 mapping >> 해당 페이지의 위치경로가 주소 와 동일하게 지정했다면
	// annotation이 해당주소로 연결
	@RequestMapping(value="/test/main", method=RequestMethod.GET)
	public void test4Param(@ModelAttribute("message") String message) {}

	
	/*url이 같기 때문에 생략
	 * 
	 * @RequestMapping(value="/test/main", method=RequestMethod.GET) public String
	 * test4Param(@ModelAttribute("message") String message) 
	 * { String url ="/test/main";
	 * 
	 * return url;
	 * 
	 * }
	 */

	
	// 어노테이션은 하나만 사용 권장(여러개 사용시 충돌)
	//url message 같은  주소줄 핸들링이 어려울 때 
	@RequestMapping(value="/test5/param", method=RequestMethod.GET)
	public String test5Param(@RequestParam(name="message", defaultValue="aa") String msg, Model model) {
		String url = "test/main";
		
		model.addAttribute("message",msg);
		
		return url;
	}
	
//	진짜 url이 없는경우(화면이 없는경우)
	// response가 있고, url이 없는 경우 Resolver는 화면을 연결하지 않는다.
	// boolean값의 경우 대소문자 상관없이 다 인식하여 넣음
	//VO를 넣을 떄 응용
	@RequestMapping(value="/test6/param", method=RequestMethod.GET)
	public void test6Param(CommandObject command,HttpServletResponse response) throws Exception{
		
		PrintWriter out = response.getWriter();
		out.print(command.a+":"+command.b+":"+command.c+":"+command.d+":"+command.k);
	}
	
}

class CommandObject{
	int a;
	String b;
	int c;
	Object d;
	boolean k;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public Object getD() {
		return d;
	}
	public void setD(Object d) {
		this.d = d;
	}
	public boolean isK() {
		return k;
	}
	public void setK(boolean k) {
		this.k = k;
	}
	
}



