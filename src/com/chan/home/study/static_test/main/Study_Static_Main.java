package com.chan.home.study.static_test.main;

import com.chan.home.study.static_test.children.Study_Child1;
import com.chan.home.study.static_test.children.Study_Child2;
import com.chan.home.study.static_test.children.Study_Child3;
import com.chan.home.study.static_test.papa.Study_papaPouch;

public class Study_Static_Main {

	public static void main(String[] args) {
		
		Study_Child1 Child1 = new Study_Child1(); // 梓端 持失
		Child1.TakeMoney(100);
		
		Study_Child2 Child2 = new Study_Child2(); // 梓端 持失
		Child2.TakeMoney(100);
		
		Study_Child3 Child3 = new Study_Child3(); // 梓端 持失
		Child3.TakeMoney(100);
		
		System.out.println("papaPouch.MONEY : " + Study_papaPouch.MONEY);
		
	}
}
