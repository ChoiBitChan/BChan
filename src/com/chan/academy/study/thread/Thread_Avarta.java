package com.chan.academy.study.thread;

public class Thread_Avarta extends Thread {
	String name;
	int time;
	
	public Thread_Avarta(String name, int time){
		System.out.println(name + " 접속!");
		this.name = name;
		this.time = time;
	}
	
	
	public void run(){
		for(int cnt = 0; cnt < 10; cnt++){
			System.out.println(name + " : Attack" + cnt);
			try{
				Thread.sleep(time);
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("Avarta 클래스 오류");
				e.printStackTrace();
			}
		}
	}
}
