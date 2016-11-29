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
		// ��°� = {banana=900, orange=1300, apple=1500, lemon=2000}
		// ������ ����� ����
		
		System.out.println(fruitPrice.get("lemon")); // ���� ���� �˷��ش�
		System.out.println(fruitPrice.values());
		
		
		
		
		Set entrySet = fruitPrice.entrySet(); // Key���� Value���� ���̺����·� ������ش�
		
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
