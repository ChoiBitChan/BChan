package com.chan.academy.study.overload;

public class Overload_Run {
	public static void main(String[] args) {
		
		Overload_Test over1 = new Overload_Test();
		over1.overMethod();
		over1.overMethod(10);
		over1.overMethod("������");
		over1.overMethod(10, "������");
		// ����Ҷ��� ��� ����� �� �ִ�
	}
}
