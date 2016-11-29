package com.chan.academy.study.test;

import java.util.Scanner;

public class Test_calculator2 {
		public static void main(String[] args) {
			
			
//			계산연산
			
//			int ret;
//			ret = add(10,20);
//			System.out.println(ret);
			
			
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			String k = sc.next(); 
			int j = sc.nextInt();
			String r = sc.next();
			
			int result=0;
			//System.out.println(i+"+"+j+"="+add(i,j));
			
			
//			if(k.equals("+")){
//				result = add(i,j);
//			} else if(k.equals("-")){
//				result = sub(i,j);
//			} else if(k.equals("*")){
//				result = mul(i,j);
//			} else if(k.equals("/")){
//				result = div(i,j);
//			}
//			
//			System.out.println(i+k+j+"="+result);
			
			switch (k) {
			case "+": result = add(i,j);
				break;
			case "-": result = sub(i,j);
				break;	
			case "*": result = mul(i,j);
				break;	
			case "/": result = div(i,j);
				break;	
			}
			
			System.out.println(i+k+j+"="+result);
			
		}
		
		public static int add(int num1, int num2){
			int sum;
			sum = num1 + num2;
			return sum;
		}
		
		public static int sub(int num1, int num2){
			int sub;
			sub = num1 - num2;
			return sub;
		}
		public static int mul(int num1, int num2){
			int mul;
			mul = num1 * num2;
			return mul;
		}
		public static int div(int num1, int num2){
			int div;
			div = num1 / num2;
			return div;
		}

}
