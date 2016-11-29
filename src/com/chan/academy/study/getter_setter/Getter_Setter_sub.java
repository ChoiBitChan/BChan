package com.chan.academy.study.getter_setter;

public class Getter_Setter_sub {
	
	public int age1 = 1;
	protected int age2 = 2;
	int age3 = 3;
	private int age4 = 4;
	
	
	public void agePrint(){
		System.out.println(age1);
		System.out.println(age2);
		System.out.println(age3);
		System.out.println(age4);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	------------------------------------------------------
	
	int age;
	String name;
	static int salary;
	private String spices;	// 이 안에 클래스에서만 접근 가능
	static int Count;
	public static int price;
	final double sub_pi = 3.14;
	
//	sub_pi = 3.14159; --- 위에서 final로 설정해놨기때문에 재설정이 불가능하다
	
	public void print_1(){
		System.out.println("public");
	}
	
	private void print_2(){
		System.out.println("private");
	}
	
	
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public static int getSalary() {
		return salary;
	}
	public static void setSalary(int salary) {
		Getter_Setter_sub.salary = salary;
	}
	
	
	
	public String getSpices() {
		return spices;
	}
	public void setSpices(String spices) {
		this.spices = spices;
	}
	
	
	
	public static int getCount() {
		return Count;
	}
	public static void setCount(int count) {
		Count = count;
	}
	
	
	
	
	
}
