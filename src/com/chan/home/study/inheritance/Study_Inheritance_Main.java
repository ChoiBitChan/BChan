package com.chan.home.study.inheritance;

public class Study_Inheritance_Main {

	public static void main(String[] args) {
		
		Study_Inheritance_Child Child = new Study_Inheritance_Child();
		System.out.println("아버지 이름 : ");
		Child.getPapaName();

		System.out.println("어머니 이름 : ");
		Child.getMamiName();
		
		System.out.println(Child.cStr);
		
		System.out.println("부모님 재산 : " + Child.pMoney);
		System.out.println("나의 재산 : " + Child.cMoney);
		System.out.println("재산 : " + (Child.pMoney + Child.cMoney));

	}
}
