package com.chan.academy_study;

import java.util.Scanner;

public class Thread_Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		String[]name;
		int cnt = 3;
		name = nameOut(cnt);
		
//		Thread.sleep(250);
		
//		try{
//			Thread.sleep(2000);
//		} catch(InterruptedException e){
//			System.out.println("InterruptedException ���ܰ� �߻��߽��ϴ�.");
//		} finally{
//			System.out.println("���� ����");
//		}
		
		for(int i=0; i<cnt; i++){
			System.out.println(i+1+"���� �̸� : "+name[i]);
			
		}
		
		
	}
		
	public static String[] nameOut(int cnt){
	    String[]name = {"�ٺ�1", "�ٺ�2", "�ٺ�3"};
//	    String[]outname; �ʱ� ���� �Է����� �ʾ� ������ ���� �ʴ´�
	    String[]outname = new String[cnt];

	    for(int i=0; i<cnt; i++){
	      outname[i] = name[i];
	    }
	    return outname;
	    
	  }
	
	
}
