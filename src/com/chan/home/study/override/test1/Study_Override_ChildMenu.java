package com.chan.home.study.override.test1;

public class Study_Override_ChildMenu extends Study_Override_ParentMenu {
	
	public Study_Override_ChildMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void makeBeefChungGukJang() {
		System.out.println("���� û����");
	}
	
	public void makeHotDoenJangGuk() {
		System.out.println("��ū ���屹");
	}
	
	public void makeKongNaMool() {
		System.out.println("�ᳪ����");
	}
	
	@Override
	public void makeChungGukJang() { // ParentMenu�� �ִ� û���� �޼ҵ� ���� (�������̵�)
		// TODO Auto-generated method stub
		System.out.println("���� ���� û����");
	}
	
}
