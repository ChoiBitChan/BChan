package com.chan.test1;

import java.util.Scanner;

public class Test_GBB {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[1.����] [2.����] [3.��] �߿� �Է����ּ���.");
		
		
		
		
//		1.���� 2.���� 3.��
//		System.out.println(me);
		
		
		//left ~ right -> right-left+1
		
        
		int i=0;
		int result = 0;
		
		for(i=0;i<5;i++){
			
			int me = sc.nextInt();
			int com = (int) (Math.random() * 3) + 1;
			System.out.println(i+1+"��° ���\n");
			
		if (me == 1){
			System.out.println("����� ������ �½��ϴ�.");
			if(com == 3){
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
				System.out.println("�̰���ϴ�");
				result++;
			} else if(com == 2){
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("�����ϴ�");
			} else if(com == 1){
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("�����ϴ�");
			}
		} else if (me == 2){
			System.out.println("����� ������ �½��ϴ�.");
			if(com == 1){
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("�̰���ϴ�");
				result++;
			} else if(com == 3){
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
				System.out.println("�����ϴ�");
			} else if(com == 2){
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("�����ϴ�");
			}
		} else if (me == 3){
			System.out.println("����� ���� �½��ϴ�.");
			if(com == 2){
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("�̰���ϴ�");
				result++;
			} else if(com == 1){
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("�����ϴ�");
			} else if(com == 3){
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
				System.out.println("�����ϴ�");
			}
		} else {
			System.out.println("�Է°� ����");
		}
		
		}
		
		System.out.println("\n�� "+result+"�� �̰���ϴ�.");
		System.out.println("�·��� "+(100/5)*result+"% �Դϴ�.");
		
		
	}
}
