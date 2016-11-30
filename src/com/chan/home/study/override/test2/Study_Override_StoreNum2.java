package com.chan.home.study.override.test2;

public class Study_Override_StoreNum2 extends Study_Override_HeadQuarterStore {

	public Study_Override_StoreNum2() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void orderBuDaeJjigae() {
		// TODO Auto-generated method stub
		System.out.println("5000원 입니다");
	}
	
	@Override
	public void orderBiBimBap() {
		// TODO Auto-generated method stub
		System.out.println("5000원 입니다");
	}
	
	@Override
	public void orderSunDaeGuk() {
		// TODO Auto-generated method stub
		System.out.println("4000원 입니다");
	}
	
	@Override
	public void orderGongGiBap() {
		// TODO Auto-generated method stub
		System.out.println("무료 입니다");
	}
}
