package com.chan.academy.study.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Test {
	
	public static void main(String[] args) {
		
		Queue<String> q1 = new LinkedList<String>();
		
		q1.offer("ù��°");
		q1.offer("�ι�°");
		q1.offer("����°");
		q1.offer("�׹�°");
		
		System.out.println(q1);
		// ������� ��
		// ��°� = [ù��°, �ι�°, ����°, �׹�°]
		
		System.out.println(q1.poll()); // Queue���� ������
		
		System.out.println(q1); // ù��°�� ����
		
		System.out.println(q1.poll());
		
		System.out.println(q1);
		
		
		
	}

}
