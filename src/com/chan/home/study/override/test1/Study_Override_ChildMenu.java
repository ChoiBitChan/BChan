package com.chan.home.study.override.test1;

public class Study_Override_ChildMenu extends Study_Override_ParentMenu {
	
	public Study_Override_ChildMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void makeBeefChungGukJang() {
		System.out.println("쇠고기 청국장");
	}
	
	public void makeHotDoenJangGuk() {
		System.out.println("얼큰 된장국");
	}
	
	public void makeKongNaMool() {
		System.out.println("콩나물국");
	}
	
	@Override
	public void makeChungGukJang() { // ParentMenu에 있는 청국장 메소드 수정 (오버라이드)
		// TODO Auto-generated method stub
		System.out.println("냄새 없는 청국장");
	}
	
}
