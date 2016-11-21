package com.chan.academy_study;

import java.util.Scanner;

public class Test_Golbangee_incheol {
	public static void main(String[] args) {
		System.out.println("배열의 크기를 입력하세요.");
	      Scanner sc = new Scanner(System.in);
	      int arraysize = sc.nextInt();
	      
	      int[][] array = new int[arraysize][arraysize];
	      int cnt = 0, maxindex = arraysize;
	      int k = 1;
	      int buho = -1;
	      int i=-1, j=-1;
	      
	      
	      for(int p=0; p<arraysize; p++){
	         
	         buho = buho * (-1);
	         
	         if(buho>0){
	            i++;
	            j++;
	            while(cnt<maxindex){
	               array[i][j] = k;
	               cnt++;
	               j++;
	               k++;
	            }
	            maxindex--;
	            cnt=0;
	            j--;
	            i++;
	            while(cnt<maxindex){
	               array[i][j] = k;
	               cnt++;
	               i++;
	               k++;
	            }
	            cnt=0;
	         } else{
	            i--;
	            j--;
	            while(cnt<maxindex){
	               array[i][j] = k;
	               cnt++;
	               j--;
	               k++;
	            }
	            maxindex--;
	            cnt=0;
	            j++;
	            i--;
	            while(cnt<maxindex){
	               array[i][j] = k;
	               cnt++;
	               i--;
	               k++;
	            }
	            cnt=0;
	         }         
	      }

	   
	      for(int q=0; q<arraysize; q++){
	         for(int w=0; w<arraysize; w++){
	            System.out.print("\t" + array[q][w]);
	         }
	         System.out.print("\n");
	      }
	}
}
