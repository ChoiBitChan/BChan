package com.chan.test1;

import java.util.Scanner;

public class Test_calculator_Main {
	public static void main(String[] args) {
		System.out.println("입력값을 넣어주세요.");
		Scanner scan = new Scanner(System.in);
		String inputVal = scan.nextLine();
		
		
//		System.out.println(inputVal);
		
		
//		String inputVal2 = ("20+30-20*2=");
//		String inputVal2 = ("20+30-40=");
					      // 13
		String[] splitValues = inputVal.split("\\+|\\-|\\*|\\/|\\=");	// 문자열로 나누기
		
		
		
		
		int[] intValues = new int[splitValues.length];	// 배열크기를 입력값 길이만큼
		
		for(int cnt=0; cnt<splitValues.length; cnt++){
			
			try{
				intValues[cnt] = Integer.parseInt(splitValues[cnt]);
//				System.out.println(intValues[cnt]);
			} catch(java.lang.NumberFormatException e){
				System.out.println("입력범위 초과.");
			} finally {
				
			}	// 예외처리
			
		}	// 기호로 쪼개기, 정수로 바꾸기
		

		
		
		
		
		
		String [] signArray = {"+", "-", "*", "/", "="};
		
		char sign = '+';
		
		
		// ------------------------------------------------------------- 기호 찾기
		
		int result = 0;
		int j = 0;
		boolean check = true;
		
		while(check){ 
			
			for(int cnt=0; cnt<signArray.length; cnt++){
				
				int signOrder = inputVal.indexOf(signArray[cnt]);
				
//				System.out.println(signOrder); // 기호가 있는 위치
				
				if(signOrder < 0){
					continue;
				} else {
//					System.out.println(signOrder);
					sign = inputVal.charAt(signOrder);
//					System.out.println(sign);
					inputVal = inputVal.substring(signOrder+1, inputVal.length()); // 기호를 찾으면 그 앞부분은 자르기
//					System.out.println(inputVal.substring(signOrder+1, inputVal.length()));
					break;
				}
				
			}	
			
			
			// ----------------------------------------------------------- 계산
			
			try {
				
				switch(sign){	
				case '+':
//					System.out.println(intValues[j]+intValues[j+1]);
					intValues[j+1] = intValues[j]+intValues[j+1];
					break;
					
				case '-': 
//					System.out.println(intValues[j]-intValues[j+1]);
					intValues[j+1] = intValues[j]-intValues[j+1];
					break;
					
				case '*': 
//					System.out.println(intValues[j]*intValues[j+1]);
					intValues[j+1] = intValues[j]*intValues[j+1];
					break;
					
				case '/': 
//					System.out.println(intValues[j]/intValues[j+1]);
					intValues[j+1] = intValues[j]/intValues[j+1];
					break;
				case '=':
					System.out.println(intValues[j]);
					check = false;
					break;
				default :
					break;
			}	
			j++;
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("입력값 형식이 잘못되었습니다.");
				check = false;
			}
			
		}
		

		
		
		
	}
	
}
