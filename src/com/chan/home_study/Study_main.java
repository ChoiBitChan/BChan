package com.chan.home_study;

import java.util.Scanner;

public class Study_main {
	public static void main(String[] args) {
		
		
		
		/*
		주석 시작
		
		
		
		//기본 자료형
		int i = 10;
		double d = i;
		
		double d2 = 3.14;
		int i2 = (int)d2;
		
		System.out.println(d2);
		System.out.println(i2);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : ");
		int i = sc.nextInt();
				
		System.out.println(i+"를 입력하셨습니다.");
		
		
		
		//제어문
		if((i%3)==0){
			System.out.println(i+"는 3의 배수입니다");
		} else if((i%3)!=0) {
			System.out.println(i+"는 3의 배수가 아닙니다");
		}
		
		
		//루프문
		int i = 1;
		while (i <= 100){
			
			if((i%3)==0){
				System.out.println(i +", " + (i+i));
			}
			
			i++;
			
		} 
		
		
		
		
		//배열 문법
		int[] iArr1 = {10, 20, 30, 40, 50}; // iArr1에 데이터 값 입력
		int[] iArr2 = iArr1;
		
		for (int i = 0; i < iArr1.length; i++){
			System.out.println("iArr1["+i+"] = " + iArr1[i]);
			System.out.println("iArr2["+i+"] = " + iArr2[i]);
		}
		
		iArr2[0] = 100;
		iArr2[1] = 200;
		iArr2[2] = 300;
		iArr2[3] = 400;
		iArr2[4] = 500; // iArr2를 수정
		
		for (int i = 0; i < iArr1.length; i++){
			System.out.println("iArr1["+i+"] = " + iArr1[i]);
			System.out.println("iArr2["+i+"] = " + iArr2[i]);
		}
		
		
		
		
		//객체 지향
		Study_makeClass mC1 = new Study_makeClass(); // Study_makeClass클래스로 부터 객체 생성 
		Study_makeClass mC2 = new Study_makeClass();
		
		System.out.println(mC1.equals(mC2)); // mC1 와 mC2는 같지 않다
		
		주석 끝
		*/
		
		Study_makeClass mC3 = new Study_makeClass();
		Study_makeClass mC4 = new Study_makeClass(26, 174, 70, "010-6244-7748");
		System.out.println(mC4);
		
//		mC3.age(); makeClass에서 접근제한자를 private로 하여서 안된다. 
		mC3.getAge();
		mC3.setAge(26);
		
		double d = mC3.calculateBMI();
		
		
		
	}
}
