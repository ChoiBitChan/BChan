package com.chan.test1;

import java.util.Scanner;

public class Test2_thread {
	
	public static void main(String[] args) throws InterruptedException {
		
		String[]name;
		int cnt = 3;
		name = nameOut(cnt);
		
		Thread.sleep(2000);
		
//		try{
//			Thread.sleep(2000);
//		} catch(InterruptedException e){
//			System.out.println("InterruptedException 예외가 발생했습니다.");
//		} finally{
//			System.out.println("정상 실행");
//		}
		
		for(int i=0; i<cnt; i++){
			System.out.println(i+1+"번의 이름 : "+name[i]);
			
		}
		
		
	}
		
	public static String[] nameOut(int cnt){
	    String[]name = {"바보1", "바보2", "바보3"};
//	    String[]outname; 초기 값을 입력하지 않아 실행이 되지 않는다
	    String[]outname = new String[cnt];

	    for(int i=0; i<cnt; i++){
	      outname[i] = name[i];
	    }
	    return outname;
	    
	  }
	
	
}
