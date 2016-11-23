package com.chan.home_study;

import java.util.ArrayList;

public class Study_StudentManager {
	
	ArrayList<Study_Student> students = new ArrayList<>();
	Study_StudentExpel studentExpel = new Study_StudentExpel();
	
	
	
	public static void main(String[] args) {
		
		Study_StudentManager manager = new Study_StudentManager();
		manager.addStudent("È«±æµ¿", 22, 20123487, "¿¬±Ø¿µÈ­°ú");
		manager.addStudent("È«±æ¼ø", 24, 20106428, "¼öÇĞ°ú");
		manager.addStudent("ÀÌÀº¿µ", 21, 20136788, "±¹¹®°ú");
		manager.addStudent("±èÃ¶¼ö", 23, 20113211, "Ã¼À°°ú");
		manager.addStudent("±è¼øÈñ", 26, 2008887, "¹«¿ë°ú");
		
		System.out.println(manager.students.get(0).getName());
		System.out.println(manager.students.get(0).getAge());
		System.out.println(manager.students.get(0).getStudentNum());
		System.out.println(manager.students.get(0).getMajor());
		
		manager.students.get(0).updateInfo(1, "È«±æ¶Ë");
		
		System.out.println(manager.students.get(0).getName());
		
	}
	
	private void addStudent(String name, int age, int studentNum, String major) {
		// TODO Auto-generated method stub

		Study_Student student = new Study_Student(name, age, studentNum, major);
		students.add(student);
//		students.add(new Study_Student(name, age, studentNum, major));
//		ÀÌ°Í°ú °°´Ù
		
		System.out.println(name + " ÇĞ»ıÁ¤º¸ ÀÔ·Â ¼º°ø");
		
	}
	
	
	
}
