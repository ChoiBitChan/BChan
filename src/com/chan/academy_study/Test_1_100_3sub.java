package com.chan.academy_study;

public class Test_1_100_3sub {
	public static void main(String[] args) {
		
		
		int result = 0;
		for(int i=1; i<=100; i++){
			
//			System.out.println(i);
			
			if(i%3 == 0){
//				System.out.println(i);
				result = result + i;
			}
			
		} 
		System.out.println(result);
		
		
	}
}
