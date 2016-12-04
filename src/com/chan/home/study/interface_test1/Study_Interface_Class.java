package com.chan.home.study.interface_test1;

public class Study_Interface_Class implements Study_Interface1, Study_Interface2 {

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("실제 구현은 여기서 합니다");
		
	}

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		System.out.println("실제 구현은 여기서 합니다");
		return null;
	}

}
