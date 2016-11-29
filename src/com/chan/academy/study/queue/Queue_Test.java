package com.chan.academy.study.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Test {
	
	public static void main(String[] args) {
		
		Queue<String> q1 = new LinkedList<String>();
		
		q1.offer("첫번째");
		q1.offer("두번째");
		q1.offer("세번째");
		q1.offer("네번째");
		
		System.out.println(q1);
		// 순서대로 들어감
		// 출력값 = [첫번째, 두번째, 세번째, 네번째]
		
		System.out.println(q1.poll()); // Queue에서 빼낸다
		
		System.out.println(q1); // 첫번째가 나감
		
		System.out.println(q1.poll());
		
		System.out.println(q1);
		
		
		
	}

}
