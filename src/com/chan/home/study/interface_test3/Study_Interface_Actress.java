package com.chan.home.study.interface_test3;

public class Study_Interface_Actress implements Study_Interface_Chef, Study_Interface_Firefighter, Study_Interface_PoliceMan {

	@Override
	public void makePizza() {
		// TODO Auto-generated method stub
		System.out.println("���ڸ� ���� �� �ֽ��ϴ�");
	}

	@Override
	public void makeSpaghetti() {
		// TODO Auto-generated method stub
		System.out.println("���İ�Ƽ�� ���� �� �ֽ��ϴ�");
	}

	@Override
	public void outFire() {
		// TODO Auto-generated method stub
		System.out.println("���� �� �� �ֽ��ϴ�");
	}

	@Override
	public void saveMan() {
		// TODO Auto-generated method stub
		System.out.println("����� ���� �� �ֽ��ϴ�");
	}

	@Override
	public void canCatchCriminal() {
		// TODO Auto-generated method stub
		System.out.println("������ ���� �� �ֽ��ϴ�");
	}

	@Override
	public void canSearch() {
		// TODO Auto-generated method stub
		System.out.println("������ ã�� �� �ֽ��ϴ�");
	}

}
