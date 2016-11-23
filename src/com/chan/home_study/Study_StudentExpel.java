package com.chan.home_study;

import java.util.ArrayList;

public class Study_StudentExpel {
	
	ArrayList<Study_Student> expelStudents; // 선언부
	
	public Study_StudentExpel() {
		// TODO Auto-generated constructor stub
		expelStudents = new ArrayList<Study_Student>();
		
	}
	
	public void addExpelStudent(String name, int age, int studentNum, String major) {
		// TODO Auto-generated method stub

		expelStudents.add(new Study_Student(name, age, studentNum, major));
		System.out.println("재적학생 정보등록 완료");
		
	}
	
}
