package com.chan.academy_study;

public class Thread_GBB extends Thread {

	public void run() {
		for (int cnt = 0; cnt < 10; cnt++) {
			
			
			try {
				System.out.println("����\n");
				Thread.sleep(1400);
				System.out.println("����\n");
				Thread.sleep(1400);
				System.out.println("��\n");
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("GBB Ŭ���� ����");
				e.printStackTrace();
			}

		}
	}

}
