package com.chan.home.study.interface_test3;

public class Study_Interface_Actress implements Study_Interface_Chef, Study_Interface_Firefighter, Study_Interface_PoliceMan {

	@Override
	public void makePizza() {
		// TODO Auto-generated method stub
		System.out.println("피자를 만들 수 있습니다");
	}

	@Override
	public void makeSpaghetti() {
		// TODO Auto-generated method stub
		System.out.println("스파게티를 만들 수 있습니다");
	}

	@Override
	public void outFire() {
		// TODO Auto-generated method stub
		System.out.println("불을 끌 수 있습니다");
	}

	@Override
	public void saveMan() {
		// TODO Auto-generated method stub
		System.out.println("사람을 구할 수 있습니다");
	}

	@Override
	public void canCatchCriminal() {
		// TODO Auto-generated method stub
		System.out.println("범인을 잡을 수 있습니다");
	}

	@Override
	public void canSearch() {
		// TODO Auto-generated method stub
		System.out.println("물건을 찾을 수 있습니다");
	}

}
