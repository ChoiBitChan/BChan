package com.chan.test1;

import java.util.Scanner;

public class Calculator {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		
		
//		System.out.println("�Է��� �� : "+i);
		
		
		
		
		if(i.contains("+")){
			String[] d = i.split("\\+");
			int result = Integer.parseInt(d[0]) + Integer.parseInt(d[1]);
			System.out.println(result);
		} else if(i.contains("-")){
			String[] d = i.split("\\-");
			int result = Integer.parseInt(d[0]) - Integer.parseInt(d[1]);
			System.out.println(result);
		} else if(i.contains("*")){
			String[] d = i.split("\\*");
			int result = Integer.parseInt(d[0]) * Integer.parseInt(d[1]);
			System.out.println(result);
		} else if(i.contains("/")){
			String[] d = i.split("\\/");
			int result = Integer.parseInt(d[0]) / Integer.parseInt(d[1]);
			System.out.println(result);
		} else{
			System.out.println("�ٽ� �Է��ϼ���");
		}
		
	
			
		
		
	}	
	
}
