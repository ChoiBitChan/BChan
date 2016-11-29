package com.chan.academy.study.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Test {

	public static void main(String[] args) {
		
		
		HashMap<String, Integer> fruitPrice = new HashMap<String, Integer>();
		fruitPrice.put("apple", 1500);
		fruitPrice.put("banana", 900);
		fruitPrice.put("lemon", 2000);
		fruitPrice.put("orange", 1300);
		
		System.out.println(fruitPrice);
		// 출력값 = {banana=900, orange=1300, apple=1500, lemon=2000}
		// 순서는 상관이 없다
		
		System.out.println(fruitPrice.get("lemon")); // 레몬 값을 알려준다
		System.out.println(fruitPrice.values());
		
		
		
		
		Set entrySet = fruitPrice.entrySet(); // Key값과 Value값을 테이블형태로 만들어준다
		
		Iterator i_entry = entrySet.iterator();
		while(i_entry.hasNext()){
			System.out.println(i_entry.next());
		}
		
		
		
		
		
		Set KeySet = fruitPrice.keySet();
		
		Iterator i_key = KeySet.iterator();
		while(i_key.hasNext()){
			System.out.println(i_key.next());
		}
		
		
		
		
		
		
		
	}
	
	
}
