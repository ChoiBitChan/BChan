package com.chan.test1;

public class Test_Getter_Setter_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Test_Getter_Setter_sub data1 = new Test_Getter_Setter_sub();
		data1.age = 3;	// ���� ����
		data1.setAge(3);	// ���� ����
		System.out.println(data1.age);	// ���� ����
		System.out.println(data1.getAge());	// ���� ����
		
		
		//data.species 				//private�� ���� ������ �Ұ���
		data1.setSpices("mix");
		System.out.println(data1.getSpices());
		
		
		Test_Getter_Setter_sub.Count = 0;
		System.out.println(data1.Count);
		data1.Count = 4;
		System.out.println(data1.Count);
		
		
		
		
		Test_Getter_Setter_sub data2 = new Test_Getter_Setter_sub();
		System.out.println(data2.Count);
		
		
	}

}
