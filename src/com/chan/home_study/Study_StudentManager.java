package com.chan.home_study;

import java.util.ArrayList;

public class Study_StudentManager {
	
	ArrayList<Study_Student> students = new ArrayList<>();
	Study_StudentExpel studentExpel = new Study_StudentExpel();
	
	
	
	public static void main(String[] args) {
		
		Study_StudentManager manager = new Study_StudentManager();
		manager.addStudent("ȫ�浿", 22, 20123487, "���ؿ�ȭ��");
		manager.addStudent("ȫ���", 24, 20106428, "���а�");
		manager.addStudent("������", 21, 20136788, "������");
		manager.addStudent("��ö��", 23, 20113211, "ü����");
		manager.addStudent("�����", 26, 2008887, "�����");
		
		System.out.println(manager.students.get(0).getName());
		System.out.println(manager.students.get(0).getAge());
		System.out.println(manager.students.get(0).getStudentNum());
		System.out.println(manager.students.get(0).getMajor());
		
		manager.students.get(0).updateInfo(1, "ȫ���");
		
		System.out.println(manager.students.get(0).getName());
		
	}
	
	private void addStudent(String name, int age, int studentNum, String major) {
		// TODO Auto-generated method stub

		Study_Student student = new Study_Student(name, age, studentNum, major);
		students.add(student);
//		students.add(new Study_Student(name, age, studentNum, major));
//		�̰Ͱ� ����
		
		System.out.println(name + " �л����� �Է� ����");
		
	}
	
	
	
}
