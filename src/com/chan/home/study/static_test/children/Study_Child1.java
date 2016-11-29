package com.chan.home.study.static_test.children;

import com.chan.home.study.static_test.papa.Study_papaPouch;

public class Study_Child1 {
	
	public Study_Child1(){ // 생성자
		
	}

	public void TakeMoney(int money){ // 메소드 생성
		Study_papaPouch.MONEY = Study_papaPouch.MONEY - money;
		if(Study_papaPouch.MONEY < 0){
			System.out.println("첫째는 돈이 없어 못받았습니다.");
		} else {
			System.out.println("첫째는 " + money + "원을 받았습니다.");
		}
	}
}
