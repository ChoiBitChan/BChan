package com.chan.academy_study;

import java.util.Scanner;

public class Test_Up_Down {
	public static void main(String[] args) {
		
		
		
//		System.out.println(random);
		
		boolean check = true;
		int i = 0;
			while(check){
				try{
					System.out.println("�������ڸ� �����Ͽ����ϴ�. \n���߾����. \n(1 ~ 500)\n");
					int random = (int)(Math.random() * 499) + 1;
					for(i = 0; i < 10; i ++){
					
						Scanner sc = new Scanner(System.in);
						System.out.println(i+1+"��° ����");
						int input = sc.nextInt();
						
						if(input < random){
							System.out.println("Up");
							System.out.println(10-(i+1)+"���� ��ȸ�� ���ҽ��ϴ�.\n");
						}
						else if(input > random){
							System.out.println("Down");
							System.out.println(10-(i+1)+"���� ��ȸ�� ���ҽ��ϴ�.\n");
						}
						else if(input == random){
							System.out.println("�����Դϴ�.");
							System.out.println("�ٽ� �Ͻðڽ��ϱ�? (Y/N)");
							String yn = sc.next();
							
							if(yn.equals("Y") || yn.equals("y")){
								i = 0;
							}
							else if(yn.equals("N") || yn.equals("n")){
								System.out.println("�����մϴ�.");
								check = false;
							}
							break; // for�� ����������
						}//else if
					}//for	
					System.out.println("�����ϼ̽��ϴ�.\n�ٽ� �����غ�����.\n");
				}//try
				catch(Exception e){
					System.out.println("�Է°� ������ �߸��Ǿ����ϴ�.\n");
			}//catch
		}//while
	}//main
}//class
