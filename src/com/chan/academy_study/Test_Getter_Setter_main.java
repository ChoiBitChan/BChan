package com.chan.academy_study;

public class Test_Getter_Setter_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		Test_Getter_Setter_extends bcat1 = new Test_Getter_Setter_extends();
		bcat1.agePrint();
		System.out.println(bcat1.age1);
		System.out.println(bcat1.age2);
		System.out.println(bcat1.age3);
//		System.out.println(bcat1.age4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		--------------------------------------------------
		
		Test_Getter_Setter_sub data1 = new Test_Getter_Setter_sub();
		data1.age = 3;	// 직접 접근
		data1.setAge(3);	// 간접 접근
		System.out.println(data1.age);	// 직접 접근
		System.out.println(data1.getAge());	// 간접 접근
		
		
		//data.species 				//private라서 직접 접근이 불가능
		data1.setSpices("mix");
		System.out.println(data1.getSpices());
		
		
		Test_Getter_Setter_sub.Count = 0;
		System.out.println(data1.Count);
		data1.Count = 4;
		System.out.println(data1.Count);
		
		
		
		
		Test_Getter_Setter_sub data2 = new Test_Getter_Setter_sub();
		System.out.println(data2.Count);
		
		
		
		Test_Getter_Setter_sub main_pi = new Test_Getter_Setter_sub();
		System.out.println(main_pi.sub_pi);
		
		
		Test_Getter_Setter_sub c1 = new Test_Getter_Setter_sub();
		
		c1.print_1();
//		c1.print_2(); 은 private 이므로 나오지 않는다
		
		
	}

}
