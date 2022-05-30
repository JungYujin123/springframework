package com.jsp.action.common;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.action.Action;
import com.jsp.dto.MenuVO;
import com.jsp.service.MenuService;

public class IndexPageAction implements Action {
	
	private MenuService menuService;
	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}
	
	
	

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//request에서  뺄건 메뉴뿐, 아이디는 세션으로 jsp
		//class 규정은 properties 여부로 interfase, extends(기존 건들지말고 메소드 바꾸고 싶을 떄), implements로 나눌 수 있음?? 
		
		String url = "common/indexPage";
		
		String mCode = request.getParameter("mCode");
		
		if(mCode==null) mCode="M000000";
		
		try {
		List<MenuVO> menuList = menuService.getMainMenuList();
		request.setAttribute("menuList", menuList);
		
		MenuVO menu = menuService.getMenuByMcode(mCode);
		request.setAttribute("menu", menu);
		} catch (SQLException e) {
			e.printStackTrace();
			//Exception 처리 : log 기록...
			throw e;
		}
		return url;
	}

}
