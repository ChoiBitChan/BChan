package com.chan.home.study.abstract_test.lunchmenu;

import com.chan.home.study.abstract_test.lunchmenu.Study_Abstract_Price.Price;

public class Study_Abstract_Main {
	
	public static void main(String[] args) {
		
		Study_Abstract_LunchMenu child1 = new Study_Abstract_Child1(Price.RICE, Price.BULGOGI, Price.BANANA, Price.MILK, Price.ALMOND);
		Study_Abstract_LunchMenu child2 = new Study_Abstract_Child2(Price.RICE, Price.BULGOGI, Price.BANANA, Price.MILK, Price.ALMOND);
		// 객체 = 레퍼런스 + 인스턴스
		// 레퍼런스 : child1, child2
		// 인스턴스 : Study_Abstract_Child1, Study_Abstract_Child2
		// 인자 : Price.RICE, Price.BULGOGI, Price.BANANA, Price.MILK, Price.ALMOND
		
		System.out.println("child1 의 식비 : " + child1.calculating() + "원");
		System.out.println("child2 의 식비 : " + child2.calculating() + "원");
		
	}

}
