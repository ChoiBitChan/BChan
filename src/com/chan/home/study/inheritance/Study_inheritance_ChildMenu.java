package com.chan.home.study.inheritance;

public class Study_inheritance_ChildMenu extends Study_inheritance_ParentMenu {

	//String childmenu;
	String[] childmenu = new String[3];
	
	public Study_inheritance_ChildMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public String[] childmenu(){
		/* 1��
		System.out.println("���� û����");
		System.out.println("��ū ���屹");
		System.out.println("�ᳪ����");
		return "";
		*/
		
		childmenu[0] = "���� û����";
		childmenu[1] = "��ū ���屹";
		childmenu[2] = "�ᳪ����";
				
		return childmenu;
		
	}
}
