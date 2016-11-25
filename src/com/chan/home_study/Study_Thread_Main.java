package com.chan.home_study;

public class Study_Thread_Main {
	public static void main(String[] args) {

		Study_Thread_GBB user1 = new Study_Thread_GBB("√÷∫˚¬˘");
		Study_Thread_GBB user2 = new Study_Thread_GBB("¡§πŒ¡ˆ");

		user1.start(); // 1
		user2.start(); // 2

		try {
			for (int cnt = 3; cnt > 0; cnt--) {
				Thread.sleep(250);
				System.out.println(cnt + "..");
			}
			Thread.sleep(250);
			if (user1.result == 1) {
				if (user2.result == 3) {
					System.out.println(user1.name + "¥‘¿Ã ¿Ã∞ÂΩ¿¥œ¥Ÿ");
				} else if (user2.result == 2) {
					System.out.println(user2.name + "¥‘¿Ã ¿Ã∞ÂΩ¿¥œ¥Ÿ");
				} else if (user2.result == 1) {
					System.out.println("∫Ò∞ÂΩ¿¥œ¥Ÿ");
				}
			} else if (user1.result == 2) {
				if (user2.result == 1) {
					System.out.println(user1.name + "¥‘¿Ã ¿Ã∞ÂΩ¿¥œ¥Ÿ");
				} else if (user2.result == 3) {
					System.out.println(user2.name + "¥‘¿Ã ¿Ã∞ÂΩ¿¥œ¥Ÿ");
				} else if (user2.result == 2) {
					System.out.println("∫Ò∞ÂΩ¿¥œ¥Ÿ");
				}
			} else if (user1.result == 3) {
				if (user2.result == 2) {
					System.out.println(user1.name + "¥‘¿Ã ¿Ã∞ÂΩ¿¥œ¥Ÿ");
				} else if (user2.result == 1) {
					System.out.println(user2.name + "¥‘¿Ã ¿Ã∞ÂΩ¿¥œ¥Ÿ");
				} else if (user2.result == 3) {
					System.out.println("∫Ò∞ÂΩ¿¥œ¥Ÿ");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
