package com.chan.home.study.inheritance;

public class Study_inheritance_ParentMenu {

	//String parentmenu;
	String[] parentmenu = new String[4];
	
	public Study_inheritance_ParentMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public String[] parentmenu(){
		/* 1번
		System.out.println("청국장");
		System.out.println("된장국");
		System.out.println("갈비찜");
		System.out.println("콩비지");
		return "";
		*/
		
		parentmenu[0] = "청국장";
		parentmenu[1] = "된장국";
		parentmenu[2] = "갈비찜";
		parentmenu[3] = "콩비지";
		
		return parentmenu;
		
	}
}
