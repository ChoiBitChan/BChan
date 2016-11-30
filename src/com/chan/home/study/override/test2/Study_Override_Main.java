package com.chan.home.study.override.test2;

public class Study_Override_Main {

	public static void main(String[] args) {
		
		Study_Override_HeadQuarterStore store1 = new Study_Override_StoreNum1();
		// 'Study_Override_HeadQuarterStore'·Î Super Class ÁöÁ¤
		store1.orderKimChiJjigae();
		store1.orderBuDaeJjigae();
		store1.orderBiBimBap();
		store1.orderSunDaeGuk();
		store1.orderGongGiBap();
		System.out.println("");
		
		Study_Override_HeadQuarterStore store2 = new Study_Override_StoreNum2();
		store2.orderKimChiJjigae();
		store2.orderBuDaeJjigae();
		store2.orderBiBimBap();
		store2.orderSunDaeGuk();
		store2.orderGongGiBap();
		System.out.println("");
		
		Study_Override_HeadQuarterStore store3 = new Study_Override_StoreNum3();
		store3.orderKimChiJjigae();
		store3.orderBuDaeJjigae();
		store3.orderBiBimBap();
		store3.orderSunDaeGuk();
		store3.orderGongGiBap();
		System.out.println("");
		
		
		
	}
}
