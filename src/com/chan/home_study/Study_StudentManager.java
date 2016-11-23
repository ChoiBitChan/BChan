package com.chan.home_study;

import java.util.ArrayList;

public class Study_StudentManager {
	
	ArrayList<Study_Student> students = new ArrayList<>();
	Study_StudentExpel studentExpel = new Study_StudentExpel();
	
	
	
	public static void main(String[] args) {
		
		Study_StudentManager manager = new Study_StudentManager();
		manager.addStudent("홍길동", 22, 20123487, "연극영화과");
		manager.addStudent("홍길순", 24, 20106428, "수학과");
		manager.addStudent("이은영", 21, 20136788, "국문과");
		manager.addStudent("김철수", 23, 20113211, "체육과");
		manager.addStudent("김순희", 26, 2008887, "무용과");
		
		System.out.println(manager.students.get(0).getName());
		System.out.println(manager.students.get(0).getAge());
		System.out.println(manager.students.get(0).getStudentNum());
		System.out.println(manager.students.get(0).getMajor());
		
//		manager.students.get(0).
		
		
	}
	
	private void addStudent(String name, int age, int studentNum, String major) {
		// TODO Auto-generated method stub

		Study_Student student = new Study_Student(name, age, studentNum, major);
		students.add(student);
//		students.add(new Study_Student(name, age, studentNum, major));
//		이것과 같다
		
		System.out.println(name + " 학생정보 입력 성공");
		
	}
	
	
	
}
