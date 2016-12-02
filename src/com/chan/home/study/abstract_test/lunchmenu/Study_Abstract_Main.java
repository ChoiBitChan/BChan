package com.chan.home.study.abstract_test.lunchmenu;

import com.chan.home.study.abstract_test.lunchmenu.Study_Abstract_Price.Price;

public class Study_Abstract_Main {
	
	public static void main(String[] args) {
		
		Study_Abstract_LunchMenu child1 = new Study_Abstract_Child1(Price.RICE, Price.BULGOGI, Price.BANANA, Price.MILK, Price.ALMOND);
		Study_Abstract_LunchMenu child2 = new Study_Abstract_Child2(Price.RICE, Price.BULGOGI, Price.BANANA, Price.MILK, Price.ALMOND);
		// ��ü = ���۷��� + �ν��Ͻ�
		// ���۷��� : child1, child2
		// �ν��Ͻ� : Study_Abstract_Child1, Study_Abstract_Child2
		// ���� : Price.RICE, Price.BULGOGI, Price.BANANA, Price.MILK, Price.ALMOND
		
		System.out.println("child1 �� �ĺ� : " + child1.calculating() + "��");
		System.out.println("child2 �� �ĺ� : " + child2.calculating() + "��");
		
	}

}
