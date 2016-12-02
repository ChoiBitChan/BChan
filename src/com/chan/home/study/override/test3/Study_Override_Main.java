package com.chan.home.study.override.test3;

public class Study_Override_Main {

	public static void main(String[] args) {
		
		Study_Override_PHlist list;
		Study_Override_PHlist name;
		
		name = new Study_Override_PH1();
		name.PHname();
		
		list = new Study_Override_PH1();
		list.PHlist();
		
		name = new Study_Override_PH2();
		name.PHname();
		
		list = new Study_Override_PH2();
		list.PHlist();
	
	}
	
}
