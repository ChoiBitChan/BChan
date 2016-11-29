package com.chan.home.study.inheritance;

public class Study_inheritance_MenuMain {
	
	public static void main(String[] args) {
		
		Study_inheritance_ChildMenu child = new Study_inheritance_ChildMenu();
		/* 1번
		System.out.println(child.childmenu());
		System.out.println(child.parentmenu());
		*/
		
		child.childmenu(); // 호출
		child.parentmenu(); // 호출
		
//		System.out.println(child.childmenu[1]);
//		System.out.println(child.parentmenu[2]);
		
		for(int i = 0; i < child.childmenu().length; i++){
			System.out.println(child.childmenu[i]);
		}
		
		System.out.println("");
		
		for(int j = 0; j < child.parentmenu().length; j++){
			System.out.println(child.parentmenu[j]);
		}
		
	}
}
