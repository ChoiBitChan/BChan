package com.chan.home.study.abstract_test.Car;

public class Study_Abstract_HighGrade extends Study_Abstract_Car {
	
	private int tax = 1000;
	
	public Study_Abstract_HighGrade(String color, String tire, int displacement, String handle) {
		// TODO Auto-generated constructor stub
		super(color, tire, displacement, handle);
	}
	
	
	@Override
	public void getSpec() {
		// TODO Auto-generated method stub
		
		System.out.println("==========================");
		System.out.println("HighCar");
		System.out.println("색상 : " + color);
		System.out.println("타이어 : " + tire);
		System.out.println("배기량 : " + displacement);
		System.out.println("핸들 : " + handle);
	
		if(displacement > 2000) tax = 1500;
			System.out.println("세금 : " + tax);
			System.out.println("==========================");
	
	}

}
