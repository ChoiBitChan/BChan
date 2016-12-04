package com.chan.home.study.interface_test2;

public class Study_Interface_Main {
	
	public static void main(String[] args) {
		
		Study_Interface_Function aPhone = new Study_Interface_Aphone();
		Study_Interface_Function bPhone = new Study_Interface_Bphone();
		Study_Interface_Function cPhone = new Study_Interface_Cphone();
		
		Study_Interface_Function[] iFunctions = {aPhone, bPhone, cPhone,};
		
		for (int i = 0; i < iFunctions.length; i++) {
			iFunctions[i].callSenderReceive();
			iFunctions[i].canLte();
			iFunctions[i].tvRemoteController();
			System.out.println("========================");
		}
	}

}
