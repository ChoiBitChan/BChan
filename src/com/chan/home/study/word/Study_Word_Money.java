package com.chan.home.study.word;

public class Study_Word_Money {

	public static void main(String[] args) { // ����Ŭ����
		
		
		
		//��ü ����(m1)
		
		Study_Word_Moneyput m1; // ���۷��� : Study_Word_MoneyputŬ������ ��ü�� ���鶧 m1���� ����

		new Study_Word_Moneyput(); // �ν��Ͻ� : Study_Word_MoneyputŬ������ ��ü�� ���鶧 �ν��Ͻ�
								   // �ν��Ͻ��� �����ϸ� �޸𸮰� �Ҵ�ȴ�

		Study_Word_Moneyput m2 = new Study_Word_Moneyput(); // ��ü = ���۷������� + �ν��Ͻ�
															

		
		//��ü ����(m2)
		
		m2.sum(1000); // ���ڰ�

		System.out.println(m2.count);
		System.out.println(m2.total);
		
		
		
		//��ü ����(m3)

		Study_Word_Moneyput m3 = new Study_Word_Moneyput();
		// ��ü�� �ϳ� �� �����.
		// ���۷������� m3
		// �ν��Ͻ��� Study_Word_Moneyput

		
		m3.sum(1000); // ���ڰ�
		System.out.println(m3.count);

		System.out.println(m3.total);

	}

}
