package com.chan.home.study.abstract_test.lunchmenu;

public abstract class Study_Abstract_LunchMenu {
	
	public int rice; // �������
	public int bulgogi; // �������
	
	public int banana; // �������
	public int milk; // �������
	public int almond; // �������
	
	public Study_Abstract_LunchMenu(int rice, int bulgogi, int banana, int milk, int almond) { // ������, �Ű����� : int rice, int bulgogi, int banana, int milk, int almond
		// TODO Auto-generated constructor stub
		
		this.rice = rice; // ��������� �Ű������� ���� ���ڰ��� �Է�
		this.bulgogi = bulgogi; // ��������� �Ű������� ���� ���ڰ��� �Է�
		
		this.banana = banana; // ��������� �Ű������� ���� ���ڰ��� �Է�
		this.milk = milk; // ��������� �Ű������� ���� ���ڰ��� �Է�
		this.almond = almond; // ��������� �Ű������� ���� ���ڰ��� �Է�
	}
	
	public abstract int calculating(); // �߻�ȭ
}
