package com.chan.academy_study;

import java.util.Scanner;

public class Test_Up_Down {
	public static void main(String[] args) {
		
		
		
//		System.out.println(random);
		
		boolean check = true;
		int i = 0;
			while(check){
				try{
					System.out.println("랜덤숫자를 결정하였습니다. \n맞추어보세요. \n(1 ~ 500)\n");
					int random = (int)(Math.random() * 499) + 1;
					for(i = 0; i < 10; i ++){
					
						Scanner sc = new Scanner(System.in);
						System.out.println(i+1+"번째 도전");
						int input = sc.nextInt();
						
						if(input < random){
							System.out.println("Up");
							System.out.println(10-(i+1)+"번의 기회가 남았습니다.\n");
						}
						else if(input > random){
							System.out.println("Down");
							System.out.println(10-(i+1)+"번의 기회가 남았습니다.\n");
						}
						else if(input == random){
							System.out.println("정답입니다.");
							System.out.println("다시 하시겠습니까? (Y/N)");
							String yn = sc.next();
							
							if(yn.equals("Y") || yn.equals("y")){
								i = 0;
							}
							else if(yn.equals("N") || yn.equals("n")){
								System.out.println("감사합니다.");
								check = false;
							}
							break; // for문 빠져나가기
						}//else if
					}//for	
					System.out.println("실패하셨습니다.\n다시 도전해보세요.\n");
				}//try
				catch(Exception e){
					System.out.println("입력값 형식이 잘못되었습니다.\n");
			}//catch
		}//while
	}//main
}//class
