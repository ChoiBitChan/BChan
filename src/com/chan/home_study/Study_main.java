package com.chan.home_study;

import java.util.Scanner;

public class Study_main {
	public static void main(String[] args) {
		
		
		
		/*
		�ּ� ����
		
		
		
		//�⺻ �ڷ���
		int i = 10;
		double d = i;
		
		double d2 = 3.14;
		int i2 = (int)d2;
		
		System.out.println(d2);
		System.out.println(i2);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���. : ");
		int i = sc.nextInt();
				
		System.out.println(i+"�� �Է��ϼ̽��ϴ�.");
		
		
		
		//���
		if((i%3)==0){
			System.out.println(i+"�� 3�� ����Դϴ�");
		} else if((i%3)!=0) {
			System.out.println(i+"�� 3�� ����� �ƴմϴ�");
		}
		
		
		//������
		int i = 1;
		while (i <= 100){
			
			if((i%3)==0){
				System.out.println(i +", " + (i+i));
			}
			
			i++;
			
		} 
		
		
		
		
		//�迭 ����
		int[] iArr1 = {10, 20, 30, 40, 50}; // iArr1�� ������ �� �Է�
		int[] iArr2 = iArr1;
		
		for (int i = 0; i < iArr1.length; i++){
			System.out.println("iArr1["+i+"] = " + iArr1[i]);
			System.out.println("iArr2["+i+"] = " + iArr2[i]);
		}
		
		iArr2[0] = 100;
		iArr2[1] = 200;
		iArr2[2] = 300;
		iArr2[3] = 400;
		iArr2[4] = 500; // iArr2�� ����
		
		for (int i = 0; i < iArr1.length; i++){
			System.out.println("iArr1["+i+"] = " + iArr1[i]);
			System.out.println("iArr2["+i+"] = " + iArr2[i]);
		}
		
		
		
		
		//��ü ����
		Study_makeClass mC1 = new Study_makeClass(); // Study_makeClassŬ������ ���� ��ü ���� 
		Study_makeClass mC2 = new Study_makeClass();
		
		System.out.println(mC1.equals(mC2)); // mC1 �� mC2�� ���� �ʴ�
		
		�ּ� ��
		*/
		
		Study_makeClass mC3 = new Study_makeClass();
		Study_makeClass mC4 = new Study_makeClass(26, 174, 70, "010-6244-7748");
		System.out.println(mC4);
		
//		mC3.age(); makeClass���� ���������ڸ� private�� �Ͽ��� �ȵȴ�. 
		mC3.getAge();
		mC3.setAge(26);
		
		double d = mC3.calculateBMI();
		
		
		
	}
}
