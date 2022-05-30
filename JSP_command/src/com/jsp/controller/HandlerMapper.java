package com.jsp.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import com.jsp.action.Action;
import com.sun.org.apache.regexp.internal.recompile;

public class HandlerMapper {

		private static final String path = "com/jsp/properties/url"; //.properties를 빼야함
		
		private Map<String, Action> commandMap = new HashMap<String, Action>();
        
		public HandlerMapper() throws Exception{
			this(path);
		}
		
		//인스턴스 받아 초기화하나 블럭초기화는 안에 값이 있을 때 가능하여, 외부에서 값 받을 시 생성자(Constructor) 사용
		public HandlerMapper(String path) throws Exception{
 			
		ResourceBundle rbHome = ResourceBundle.getBundle(path);
		
		Set<String> actionSetHome = rbHome.keySet(); //uri set
		
		Iterator<String> it = actionSetHome.iterator();
		while (it.hasNext()) {
			String command = it.next(); //key -> url
			String actionClassName = rbHome.getString(command);
			
			Class<?> actionClass = Class.forName(actionClassName);
			Action commandAction = (Action) actionClass.newInstance();
			
			commandMap.put(command, commandAction);
			System.out.println("[HandlerMapper]" + command + ":" + commandAction +"가 준비되었습니다.");
		}
			
			
		}
		
		public Action getAction(String url) {
			Action action = commandMap.get(url);
			return action;
		}
}
