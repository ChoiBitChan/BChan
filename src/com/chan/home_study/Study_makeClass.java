package com.chan.home_study;

public class Study_makeClass {
	
	private int age; // 인스턴스 변수
	private int height; // 인스턴스 변수
	private int weight; // 인스턴스 변수
	private String phoneNumber; // 인스턴스 변수
	// 접근제한자를 private로 사용하여 이 클래스 내에서만 사용할 수 있다.(정보 보호)
	
	// int i = 1; 과 public int i = 1; 은 같다
	// public은 생략 가능
	
	
	/*
	public Study_makeClass(){ //파라미터가 없다
		System.out.println("여기는 \"makeClass\" 생성자 입니다");
	}
	*/
	
	
	
	
	public Study_makeClass(){ // 생성자
		
	}
	
	public Study_makeClass(int age, int height, int weight, String phoneNumber){ // 생성자
		
		this.age = age;
//		this는 '나 자신' 이라는 뜻과 같다
//		age = age; 와도 같은 뜻이지만 구분을 하기 위해 사용
		this.height = height;
		this.weight = weight;
		this.phoneNumber = phoneNumber;
		
	}
	
	
	public double calculateBMI() {
		
	double result = weight / (height * height);
	return result;
		
	}

	
		
		
		
		
		
	// getter_setter
	// 접근제한자 public
	// 외부에서 사용 가능하다
			
	//get : 외부에서 얻어간다
	//set : 외부에서 설정할 수 있다	
		
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
