package com.chan.home.study.word;

public class Study_Word_Money {

	public static void main(String[] args) { // 메인클래스
		
		
		
		//객체 생성(m1)
		
		Study_Word_Moneyput m1; // 레퍼런스 : Study_Word_Moneyput클래스로 객체를 만들때 m1으로 정의

		new Study_Word_Moneyput(); // 인스턴스 : Study_Word_Moneyput클래스로 객체를 만들때 인스턴스
								   // 인스턴스를 정의하면 메모리가 할당된다

		Study_Word_Moneyput m2 = new Study_Word_Moneyput(); // 객체 = 래퍼런스변수 + 인스턴스
															

		
		//객체 생성(m2)
		
		m2.sum(1000); // 인자값

		System.out.println(m2.count);
		System.out.println(m2.total);
		
		
		
		//객체 생성(m3)

		Study_Word_Moneyput m3 = new Study_Word_Moneyput();
		// 객체를 하나 더 만든다.
		// 래퍼런스변수 m3
		// 인스턴스는 Study_Word_Moneyput

		
		m3.sum(1000); // 인자값
		System.out.println(m3.count);

		System.out.println(m3.total);

	}

}
