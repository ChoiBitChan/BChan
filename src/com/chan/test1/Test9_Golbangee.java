package com.chan.test1;

public class Test9_Golbangee {
	public static void main(String[] args) throws InterruptedException {
		int[][] cnt = new int[3][3] ;
		int k = 0;
		int i = 0;
		int j = 0;
		
		boolean stop = true;
		while(stop){
		
		for(j=0; j<3; j++){
			
			cnt[i][j] = k+1;
			k++;
			
			
		}//for_j
		
		for(i=2; i>=0; i--){
			System.out.print(j+"\n");
			
			
			for(int ii=2; ii>=1; ii--){
				cnt[j-ii][i] = k;
				k++;
				cnt[j-ii][i] = k;
			}//for_ii
			
			
		}//for_i
		
		stop = false;
		}//while
		
		
		
		
		for(i = 0; i < 3; i++){
			for(j = 0; j < 3; j++){
//				System.out.print(k+"��° ");
//				Thread.sleep(250); // �ð�
//				cnt[i][j] = k+1;
				
				System.out.print(cnt[i][j]+" "); // �迭���
//				k++;
				
//				System.out.print("("+i+"-"+j+")"+"\t"); // ��ǥ
			
//				ù��° i ���� j ����
//				�ι�° j ���� i ����
//				����° i ���� j ���� (j�� 1���� ����)
//				�׹�° j ���� i ���� (i�� 2���� ����)
//				�ټ�° i ���� j ���� (j�� 3���� ����)
				
			}//for_j
			
			System.out.println("\n"); //j�� �������� ��ĭ ����
			
		}//for_i
		
		
	}//main
}//class
