package com.chan.home.study.override.test2;

public class Study_Override_StoreNum1 extends Study_Override_HeadQuarterStore {

	public Study_Override_StoreNum1() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void orderKimChiJjigae() {
		// TODO Auto-generated method stub
		System.out.println("4500원 입니다");
	}
	
	@Override
	public void orderBuDaeJjigae() {
		// TODO Auto-generated method stub
		System.out.println("5000원 입니다");
	}
	
	@Override
	public void orderSunDaeGuk() {
		// TODO Auto-generated method stub
		System.out.println("판매하지 않습니다");
	}
}
