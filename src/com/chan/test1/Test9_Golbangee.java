package com.chan.test1;

public class Test9_Golbangee {
	public static void main(String[] args) throws InterruptedException {
		int[][] cnt = new int[2][2] ;
		int k = 0;
		int i = 0;
		int j = 0;
		
		for(i = 0; i < 2; i++){
			for(j = 0; j < 2; j++){
//				System.out.print(k+"번째 ");
//				Thread.sleep(250); // 시간
				cnt[i][j] = k+1;
				
				System.out.print(cnt[i][j]); // 배열출력
				k++;
				
				System.out.print("("+i+"-"+j+")"+"\t"); // 좌표
			
//				첫번째 i 고정 j 증가
//				두번째 j 고정 i 증가
//				세번째 i 고정 j 감소 (j는 1까지 감소)
//				네번째 j 고정 i 감소 (i는 2까지 감소)
//				다섯째 i 고정 j 증가 (j는 3까지 증가)
				
			}//for_j
			
			System.out.println("\n"); //j가 끝났을때 한칸 띄어라
			
		}//for_i
		
		
		
	}//main
}//class
