package com.chan.home.study.interface_test3;

public class Study_Interface_Main {
	
	public static void main(String[] args) {
		
		Study_Interface_Actress actress = new Study_Interface_Actress();
		actress.canCatchCriminal();
		actress.canSearch();
		actress.outFire();
		actress.saveMan();
		actress.makePizza();
		actress.makeSpaghetti();
		System.out.println("=======================");
		
		Study_Interface_PoliceMan actressP = new Study_Interface_Actress();
		actressP.canCatchCriminal();
		actressP.canSearch();
		System.out.println("=======================");
		
		Study_Interface_Firefighter actressF = new Study_Interface_Actress();
		actressF.outFire();
		actressF.saveMan();
		System.out.println("=======================");
		
		Study_Interface_Chef actressC = new Study_Interface_Actress();
		actressC.makePizza();
		actressC.makeSpaghetti();
		
	}

}
