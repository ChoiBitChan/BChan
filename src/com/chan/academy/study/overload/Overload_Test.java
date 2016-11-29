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
	// 같은 이름이지만 인자값이 다르면 생성된다.
}
