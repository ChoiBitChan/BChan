package com.chan.test1;

import java.util.Scanner;

public class Test_369 {
	public static void main(String[] args) {
		System.out.println("1~99");
		
		
		
		
//		System.out.println(input.length());
		
//		System.out.println(num0);
//		System.out.println(num1);
		
		while(true){
			
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			System.out.println(input);
		
			if(input.length() == 1){
				char num0 = input.charAt(0);
				if(num0 == '3' || num0 == '6' || num0 == '9'){
					System.out.println("¹Ú¼öÂ¦");
				}
			}
			else if(input.length() == 2){
				char num0 = input.charAt(0);
				char num1 = input.charAt(1);
				if(num0 == '3' || num0 == '6' || num0 == '9'){
					if(num1 == '3' || num1 == '6' || num1 == '9'){
						System.out.println("¹Ú¼öÂ¦Â¦");
					}
					System.out.println("¹Ú¼öÂ¦");
				}
				else if(num1 == '3' || num1 == '6' || num1 == '9'){
					System.out.println("¹Ú¼öÂ¦");
				}
			}
		}
		
	
		
	
	}	
}

//  3  6  9 13 16 19 23 26 29
// 33 36 39 63 66 69 93 96 99
// 11 12 13 21 22 23 31 32 33