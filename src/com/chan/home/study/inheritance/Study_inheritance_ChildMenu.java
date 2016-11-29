package com.chan.home.study.inheritance;

public class Study_inheritance_ChildMenu extends Study_inheritance_ParentMenu {

	//String childmenu;
	String[] childmenu = new String[3];
	
	public Study_inheritance_ChildMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public String[] childmenu(){
		/* 1번
		System.out.println("쇠고기 청국장");
		System.out.println("얼큰 된장국");
		System.out.println("콩나물국");
		return "";
		*/
		
		childmenu[0] = "쇠고기 청국장";
		childmenu[1] = "얼큰 된장국";
		childmenu[2] = "콩나물국";
				
		return childmenu;
		
	}
}
