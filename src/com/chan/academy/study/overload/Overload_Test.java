package com.chan.academy.study.overload;

public class Overload_Test {
	
	public void overMethod(){
		System.out.println("overMethod ");
	}
	
	public void overMethod(int num){
		System.out.println("overMethod " + num);
	}
	
	public void overMethod(String name){
		System.out.println("overMethod " + name);
	}
	
	public void overMethod(int num, String name){
		System.out.println("overMethod " + num + " & " + name);
	}
	// ���� �̸������� ���ڰ��� �ٸ��� �����ȴ�.
}
