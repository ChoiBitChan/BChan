package com.chan.test1;

public class Test_Getter_Setter_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Getter_Setter_sub data = new Test_Getter_Setter_sub();
		data.age = 3;	// 流立 立辟
		data.setAge(3);	// 埃立 立辟
		System.out.println(data.age);	// 流立 立辟
		System.out.println(data.getAge());	// 埃立 立辟
		
		
		//data.species 				//private扼辑 流立 立辟捞 阂啊瓷
		data.setSpices("mix");
		System.out.println(data.getSpices());
		
		
		
	}

}
