package com.spring.pointcut;

public class BehaviorImpl implements Behavior {

	@Override
	public void 잠자기() {
     System.out.println("잠");
	}

	@Override
	public void 공부하기() {
		 System.out.println("공부");

	}

	@Override
	public void 밥먹기() {
		 System.out.println("밥");

	}

	@Override
	public void 데이트() {
		 System.out.println("데");
	}

	@Override
	public void 운동() {
		 System.out.println("운");

	}

	@Override
	public void 놀기() {
		 System.out.println("놀");

	}

	@Override
	public void 정신수양() {
		 System.out.println("정신");

	}

}
