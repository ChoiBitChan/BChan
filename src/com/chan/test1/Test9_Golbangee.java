package com.chan.test1;

public class Test9_Golbangee {
	public static void main(String[] args) throws InterruptedException {
		int[][] cnt = new int[2][2] ;
		int k = 0;
		int i = 0;
		int j = 0;
		
		for(i = 0; i < 2; i++){
			for(j = 0; j < 2; j++){
//				System.out.print(k+"��° ");
//				Thread.sleep(250); // �ð�
				cnt[i][j] = k+1;
				
				System.out.print(cnt[i][j]); // �迭���
				k++;
				
				System.out.print("("+i+"-"+j+")"+"\t"); // ��ǥ
			
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
