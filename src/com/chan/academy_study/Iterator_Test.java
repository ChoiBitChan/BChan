package com.chan.academy_study;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Iterator_Test {

	public static void main(String[] args) {

		HashSet<Integer> hs1 = new HashSet<Integer>();
		
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);

		Iterator i_hs1 = (Iterator) hs1.iterator();
		while (i_hs1.hasNext()) {
			System.out.println(i_hs1.next());
		}
		
		
		
		
		ArrayList<Integer> arrlist1;
		arrlist1 = new ArrayList<Integer>();
		
		arrlist1.add(1);
		arrlist1.add(2);
		arrlist1.add(3);
		arrlist1.add(4);
		arrlist1.add(5);
		
		Iterator i_al1 = (Iterator)arrlist1.iterator();
		while(i_al1.hasNext()){
			System.out.println(i_al1.next());
		}
		
		
		
		
		
		
		
		
		Queue<String> q1 = new LinkedList<String>();
		
		q1.offer("첫번째");
		q1.offer("두번째");
		q1.offer("세번째");
		q1.offer("네번째");
		q1.offer("다섯번째");
		
		System.out.println(q1);
		Iterator i_q1 = (Iterator)q1.iterator();
		while(i_q1.hasNext()){
//			System.out.println(i_q1.next());
			System.out.println(q1.poll());
		}
		System.out.println(q1);
		
		
		
	}
}
