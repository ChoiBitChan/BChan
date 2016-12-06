package com.chan.home.study.interface_test1;

public class Study_Interface_Main {
	
	public static void main(String[] args) {
		
		Study_Interface_Class interfaceClass = new Study_Interface_Class();
		interfaceClass.calculate();
		interfaceClass.getStr();
		
		Study_Interface1 interF1 = new Study_Interface_Class();
	    Study_Interface2 interF2 = new Study_Interface_Class();
	    interF1.calculate();
	    interF2.getStr();
		
	}

}
