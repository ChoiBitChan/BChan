package com.chan.academy_study;

class Car<T>{ // �ڷ����� �������� �ʾ� �ִ�
	
	private T description;
	public void carInfoPrint(){
		System.out.println(description);
	}
	
	
	public T getDescription() {
		return description;
	}
	public void setDescription(T description) {
		this.description = description;
	}
	
	
}






public class Generic_Test {

	public static void main(String[] args) {
		
		Car<Integer> truck1 = new Car<Integer>();
		truck1.setDescription(100);
		truck1.carInfoPrint();
		
		Car<String> bungbung = new Car<String>();
		bungbung.setDescription("�غ� �ڵ���");
		bungbung.carInfoPrint();
		
	}
	
	
	
}
