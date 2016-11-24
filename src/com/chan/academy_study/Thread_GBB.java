package com.chan.academy_study;

public class Thread_GBB extends Thread {

	public void run() {
		for (int cnt = 0; cnt < 10; cnt++) {
			
			
			try {
				System.out.println("가위\n");
				Thread.sleep(1400);
				System.out.println("바위\n");
				Thread.sleep(1400);
				System.out.println("보\n");
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("GBB 클래스 오류");
				e.printStackTrace();
			}

		}
	}

}
