package com.jsp.action.common;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jsp.action.Action;
import com.jsp.controller.JSONViewResolver;
import com.jsp.dto.MenuVO;
import com.jsp.service.MenuService;

public class SubMenuAction implements Action {

	
	private MenuService MenuService;
	public void setMenuService(MenuService menuService) {
		this.MenuService = menuService;
	}
	
	
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url = null;
		
		String mCode = request.getParameter("mCode");
		List<MenuVO> subMenu = null;
		
		try {
			subMenu = MenuService.getSubMenuList(mCode);
			
		    JSONViewResolver.view(response, subMenu);
			
		} catch (Exception e) {
			e.printStackTrace();
			//Exception 처리...
			throw e;
		}
		
		return url;
	}

}
