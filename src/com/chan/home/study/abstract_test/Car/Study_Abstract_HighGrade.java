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
		System.out.println("���� : " + color);
		System.out.println("Ÿ�̾� : " + tire);
		System.out.println("��ⷮ : " + displacement);
		System.out.println("�ڵ� : " + handle);
	
		if(displacement > 2000) tax = 1500;
			System.out.println("���� : " + tax);
			System.out.println("==========================");
	
	}

}