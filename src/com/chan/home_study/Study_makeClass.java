package com.chan.home_study;

public class Study_makeClass {
	
	private int age; // �ν��Ͻ� ����
	private int height; // �ν��Ͻ� ����
	private int weight; // �ν��Ͻ� ����
	private String phoneNumber; // �ν��Ͻ� ����
	// ���������ڸ� private�� ����Ͽ� �� Ŭ���� �������� ����� �� �ִ�.(���� ��ȣ)
	
	// int i = 1; �� public int i = 1; �� ����
	// public�� ���� ����
	
	
	/*
	public Study_makeClass(){ //�Ķ���Ͱ� ����
		System.out.println("����� \"makeClass\" ������ �Դϴ�");
	}
	*/
	
	
	
	
	public Study_makeClass(){ // ������
		
	}
	
	public Study_makeClass(int age, int height, int weight, String phoneNumber){ // ������
		
		this.age = age;
//		this�� '�� �ڽ�' �̶�� ��� ����
//		age = age; �͵� ���� �������� ������ �ϱ� ���� ���
		this.height = height;
		this.weight = weight;
		this.phoneNumber = phoneNumber;
		
	}
	
	
	public double calculateBMI() {
		
	double result = weight / (height * height);
	return result;
		
	}

	
		
		
		
		
		
	// getter_setter
	// ���������� public
	// �ܺο��� ��� �����ϴ�
			
	//get : �ܺο��� ����
	//set : �ܺο��� ������ �� �ִ�	
		
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
