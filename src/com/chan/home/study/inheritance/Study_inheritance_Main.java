package com.chan.home.study.inheritance;

public class Study_inheritance_Main {

	public static void main(String[] args) {
		
		Study_inheritance_Child Child = new Study_inheritance_Child();
		System.out.println("�ƹ��� �̸� : ");
		Child.getPapaName();

		System.out.println("��Ӵ� �̸� : ");
		Child.getMamiName();
		
		System.out.println(Child.cStr);
		
		System.out.println("�θ�� ��� : " + Child.pMoney);
		System.out.println("���� ��� : " + Child.cMoney);
		System.out.println("��� : " + (Child.pMoney + Child.cMoney));

	}
}
