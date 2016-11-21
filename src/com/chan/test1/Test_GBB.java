package com.chan.test1;

import java.util.Scanner;

public class Test_GBB {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[1.가위] [2.바위] [3.보] 중에 입력해주세요.");
		
		
		
		
//		1.가위 2.바위 3.보
//		System.out.println(me);
		
		
		//left ~ right -> right-left+1
		
        
		int i=0;
		int result = 0;
		
		for(i=0;i<5;i++){
			
			int me = sc.nextInt();
			int com = (int) (Math.random() * 3) + 1;
			System.out.println(i+1+"번째 대결\n");
			
		if (me == 1){
			System.out.println("당신은 가위를 냈습니다.");
			if(com == 3){
				System.out.println("컴퓨터는 보를 냈습니다.");
				System.out.println("이겼습니다");
				result++;
			} else if(com == 2){
				System.out.println("컴퓨터는 바위를 냈습니다.");
				System.out.println("졌습니다");
			} else if(com == 1){
				System.out.println("컴퓨터는 가위를 냈습니다.");
				System.out.println("비겼습니다");
			}
		} else if (me == 2){
			System.out.println("당신은 바위를 냈습니다.");
			if(com == 1){
				System.out.println("컴퓨터는 가위를 냈습니다.");
				System.out.println("이겼습니다");
				result++;
			} else if(com == 3){
				System.out.println("컴퓨터는 보를 냈습니다.");
				System.out.println("졌습니다");
			} else if(com == 2){
				System.out.println("컴퓨터는 바위를 냈습니다.");
				System.out.println("비겼습니다");
			}
		} else if (me == 3){
			System.out.println("당신은 보를 냈습니다.");
			if(com == 2){
				System.out.println("컴퓨터는 바위를 냈습니다.");
				System.out.println("이겼습니다");
				result++;
			} else if(com == 1){
				System.out.println("컴퓨터는 가위를 냈습니다.");
				System.out.println("졌습니다");
			} else if(com == 3){
				System.out.println("컴퓨터는 보를 냈습니다.");
				System.out.println("비겼습니다");
			}
		} else {
			System.out.println("입력값 오류");
		}
		
		}
		
		System.out.println("\n총 "+result+"번 이겼습니다.");
		System.out.println("승률은 "+(100/5)*result+"% 입니다.");
		
		
	}
}
