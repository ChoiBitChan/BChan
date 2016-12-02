package com.chan.home.study.abstract_test.lunchmenu;

public class Study_Abstract_Child1 extends Study_Abstract_LunchMenu {

	
	public Study_Abstract_Child1(int rice, int bulgogi, int banana, int milk, int almond) { // 생성자, 매개변수 : int rice, int bulgogi, int banana, int milk, int almond
		// TODO Auto-generated constructor stub
		super(rice, bulgogi, banana, milk, almond);
	}
	
	@Override
	public int calculating() { // 메소드, 매개변수는 없음
		// TODO Auto-generated method stub
		return rice + bulgogi + banana;
	}

}
