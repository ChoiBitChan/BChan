package com.chan.academy.study.thread;

public class Thread_Main {

	public static void main(String[] args) {
		
		
		Thread_Avarta choi = new Thread_Avarta("�ֺ���", 1000);
		Thread_Avarta hong = new Thread_Avarta("ȫ�浿", 1800);
		Thread_GBB gbb = new Thread_GBB();
		
		choi.start();
		hong.start();
		gbb.start();
		
		
		
	}
	
}
