package com.chan.home.study.static_test.children;

import com.chan.home.study.static_test.papa.Study_papaPouch;

public class Study_Child2 {
	
	public Study_Child2(){ // ������
		
	}

	public void TakeMoney(int money){ // �޼ҵ� ����
		Study_papaPouch.MONEY = Study_papaPouch.MONEY - money;
		if(Study_papaPouch.MONEY < 0){
			System.out.println("��°�� ���� ���� ���޾ҽ��ϴ�.");
		} else {
			System.out.println("��°�� " + money + "���� �޾ҽ��ϴ�.");
		}
	}
}
