package com.chan.test1;

public class Test_Getter_Setter_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Getter_Setter_sub data = new Test_Getter_Setter_sub();
		data.age = 3;	// ���� ����
		data.setAge(3);	// ���� ����
		System.out.println(data.age);	// ���� ����
		System.out.println(data.getAge());	// ���� ����
		
		
		//data.species 				//private�� ���� ������ �Ұ���
		data.setSpices("mix");
		System.out.println(data.getSpices());
		
		
		
	}

}
