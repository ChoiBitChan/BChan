package com.chan.academy.study.arraylist;

import java.util.ArrayList;

public class Arraylist_Test {
	private static ArrayList<Integer> arrlist1;
	
	Integer [] array1 = {1, 2, 3, 4, 5};
	
	
		
	public void run1(){
		arrlist1 = new ArrayList<Integer>();
		arrlist1.add(1);
		arrlist1.add(2);
		arrlist1.add(3);
		arrlist1.add(4);
		arrlist1.add(5);
		
		
		System.out.println("\nArrayList");
		System.out.println("Arraylist size : " + arrlist1.size() + "\n");
		for(int i = 0; i < arrlist1.size(); i++){
			System.out.println(arrlist1.get(i));
		}
		
//		System.out.println(arrlist1.get(0));
//		System.out.println(arrlist1.get(1));
//		System.out.println(arrlist1.get(2));
//		System.out.println(arrlist1.get(3));
//		System.out.println(arrlist1.get(4));
		
		
		
		arrlist1.add(6);
//		System.out.println(arrlist1.get(5));
		System.out.println("\nArrayList 추가 후");
		System.out.println("Arraylist size : " + arrlist1.size() + "\n");
		for(int i = 0; i < arrlist1.size(); i++){
			System.out.println(arrlist1.get(i));
		}
		
		
		arrlist1.remove(3);
		System.out.println("\nArrayList 삭제 후");
		System.out.println("Arraylist size : " + arrlist1.size() + "\n");
		for(int i = 0; i < arrlist1.size(); i++){
			System.out.println(arrlist1.get(i));
		}
//		System.out.println("ArrayList 수정 후\n");
//		System.out.println(arrlist1.get(0));
//		System.out.println(arrlist1.get(1));
//		System.out.println(arrlist1.get(2));
//		System.out.println(arrlist1.get(3));
//		System.out.println(arrlist1.get(4));
//		System.out.println(arrlist1.get(5));
		
		
		
		
		System.out.println("\nArray\n");
		System.out.println(arrlist1.get(0));
		System.out.println(arrlist1.get(1));
		System.out.println(arrlist1.get(2));
		System.out.println(arrlist1.get(3));
		System.out.println(arrlist1.get(4));
		// 배열의 크기를 늘리거나 줄일 수 없다
		
		
	}
		
}
