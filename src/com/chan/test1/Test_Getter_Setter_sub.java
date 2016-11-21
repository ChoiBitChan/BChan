package com.chan.test1;

public class Test_Getter_Setter_sub {
	int age;
	String name;
	static int salary;
	private String spices;	// 이 안에 클래스에서만 접근 가능
	static int Count;
	public static int price;
	
	
	
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
		Test_Getter_Setter_sub.salary = salary;
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
