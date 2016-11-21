package com.chan.test1;

import java.util.Scanner;

public class Test_calculator2 {
	public static void main(String[] args) {
		
		
		
		
		
//		System.out.println(calStr);
		
		
//		System.out.println(sign);
		
		
		
		
		while(true){
			Scanner sc = new Scanner(System.in);
			String calStr;
			calStr = sc.nextLine();
			String sign = calStr.substring(1, 2);
		switch(sign){
		
		case "+":
			String[] num1 = calStr.split("\\+");
			String[] num2 = num1[1].split("\\=");
			
			int n1 = Integer.parseInt(num1[0]);
			int n2 = Integer.parseInt(num2[0]);
			System.out.println(n1+n2);
			break;
		case "-":
			String[] num3 = calStr.split("\\-");
			String[] num4 = num3[1].split("\\=");
			
			int n3 = Integer.parseInt(num3[0]);
			int n4 = Integer.parseInt(num4[0]);
			System.out.println(n3-n4);
			break;
			
		case "*":
			String[] num5 = calStr.split("\\*");
			String[] num6 = num5[1].split("\\=");
			
			int n5 = Integer.parseInt(num5[0]);
			int n6 = Integer.parseInt(num6[0]);
			System.out.println(n5+n6);
			break;
			
		case "/":
			String[] num7 = calStr.split("\\/");
			String[] num8 = num7[1].split("\\=");
			
			int n7 = Integer.parseInt(num7[0]);
			int n8 = Integer.parseInt(num8[0]);
			System.out.println(n7+n8);
			break;
		default:
			System.out.println("¿À·ù");
			break;
			}
		
		}
		
		
		
		
//		String[] num1 = calStr.split("\\+");
//		String[] num2 = num1[1].split("\\=");
//		
//		int n1 = Integer.parseInt(num1[0]);
//		int n2 = Integer.parseInt(num2[0]);
		
//		System.out.println(n1);
//		System.out.println(n2);
//		System.out.println(n1+n2);
		
		
	}
}
