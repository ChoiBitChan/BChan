package com.chan.home.study.abstract_test.lunchmenu;

public abstract class Study_Abstract_LunchMenu {
	
	public int rice; // 멤버변수
	public int bulgogi; // 멤버변수
	
	public int banana; // 멤버변수
	public int milk; // 멤버변수
	public int almond; // 멤버변수
	
	public Study_Abstract_LunchMenu(int rice, int bulgogi, int banana, int milk, int almond) { // 생성자, 매개변수 : int rice, int bulgogi, int banana, int milk, int almond
		// TODO Auto-generated constructor stub
		
		this.rice = rice; // 멤버변수에 매개변수에 들어온 인자값을 입력
		this.bulgogi = bulgogi; // 멤버변수에 매개변수에 들어온 인자값을 입력
		
		this.banana = banana; // 멤버변수에 매개변수에 들어온 인자값을 입력
		this.milk = milk; // 멤버변수에 매개변수에 들어온 인자값을 입력
		this.almond = almond; // 멤버변수에 매개변수에 들어온 인자값을 입력
	}
	
	public abstract int calculating(); // 추상화
}
