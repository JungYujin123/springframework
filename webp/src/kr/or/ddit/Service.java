package kr.or.ddit;

import java.util.Map;

public class Service {
	
	private DAO dao;
	private static Service service;
	
	private Service() {
		dao = DAO.getInstance();
	}
	public static Service getInstance() {
		if(service ==null) {
			service = new Service();
		}
		return service;
	}
	public Map<String, Object> selectMemberOne(String name){
		if(service==null) {
			service = new Service();
		}
		return null;
	}
}
