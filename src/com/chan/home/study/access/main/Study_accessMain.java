package com.chan.home.study.access.main;

import com.chan.home.study.access.sub.Study_accessSub;

public class Study_accessMain {

	public static void main(String[] args) {
		
		Study_accessSub sub = new Study_accessSub();
		
		//System.out.println(sub.a);
		// a는 접근제한을 하여 import할 수 없다 
		System.out.println(sub.b);
		
	}
	
}
