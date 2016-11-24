package com.chan.academy_study;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Test {

	
	public static void main(String[] args) {
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		
		hs1.add(3); // 동일한 값 추가
		hs1.add(1); // 동일한 값 추가
		
/*		for(int i = 0; i < hs1.size(); i++){
			System.out.println(hs1.toString());
		}*/
		
		System.out.println(hs1.toString());
		// 동일한 값을 추가해도 출력되지 않는다
		// 출력 값 = [1, 2, 3, 4, 5]
		
		Iterator i_hs1 = (Iterator)hs1.iterator();
		while(i_hs1.hasNext()){
			System.out.println(i_hs1.next());
			
		}
		
	}
	
}
