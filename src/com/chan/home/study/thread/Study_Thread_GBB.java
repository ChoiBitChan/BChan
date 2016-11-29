package com.chan.home.study.thread;

public class Study_Thread_GBB extends Thread {

	String name;
	int result;

	public Study_Thread_GBB(String name) {
		this.name = name;
	}

	public void run() {

		try {

			int gbb_random = (int) (Math.random() * 3) + 1;
			result = gbb_random;

			if (gbb_random == 1) {
				System.out.println(name + " : 가위");
			}
			if (gbb_random == 2) {
				System.out.println(name + " : 바위");
			}
			if (gbb_random == 3) {
				System.out.println(name + " : 보");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
