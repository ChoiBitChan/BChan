package com.chan.test1;

import java.util.Scanner;

public class Test_calculator_Main {
	public static void main(String[] args) {
		System.out.println("�Է°��� �־��ּ���.");
		Scanner scan = new Scanner(System.in);
		String inputVal = scan.nextLine();
		
		
//		System.out.println(inputVal);
		
		
//		String inputVal2 = ("20+30-20*2=");
//		String inputVal2 = ("20+30-40=");
					      // 13
		String[] splitValues = inputVal.split("\\+|\\-|\\*|\\/|\\=");	// ���ڿ��� ������
		
		
		
		
		int[] intValues = new int[splitValues.length];	// �迭ũ�⸦ �Է°� ���̸�ŭ
		
		for(int cnt=0; cnt<splitValues.length; cnt++){
			
			try{
				intValues[cnt] = Integer.parseInt(splitValues[cnt]);
//				System.out.println(intValues[cnt]);
			} catch(java.lang.NumberFormatException e){
				System.out.println("�Է¹��� �ʰ�.");
			} finally {
				
			}	// ����ó��
			
		}	// ��ȣ�� �ɰ���, ������ �ٲٱ�
		

		
		
		
		
		
		String [] signArray = {"+", "-", "*", "/", "="};
		
		char sign = '+';
		
		
		// ------------------------------------------------------------- ��ȣ ã��
		
		int result = 0;
		int j = 0;
		boolean check = true;
		
		while(check){ 
			
			for(int cnt=0; cnt<signArray.length; cnt++){
				
				int signOrder = inputVal.indexOf(signArray[cnt]);
				
//				System.out.println(signOrder); // ��ȣ�� �ִ� ��ġ
				
				if(signOrder < 0){
					continue;
				} else {
//					System.out.println(signOrder);
					sign = inputVal.charAt(signOrder);
//					System.out.println(sign);
					inputVal = inputVal.substring(signOrder+1, inputVal.length()); // ��ȣ�� ã���� �� �պκ��� �ڸ���
//					System.out.println(inputVal.substring(signOrder+1, inputVal.length()));
					break;
				}
				
			}	
			
			
			// ----------------------------------------------------------- ���
			
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
				System.out.println("�Է°� ������ �߸��Ǿ����ϴ�.");
				check = false;
			}
			
		}
		

		
		
		
	}
	
}
