package com.chan.academy_study;

import java.io.OutputStream;
import java.util.Scanner;

public class Server_Sender_Thread extends Thread {
   
   OutputStream sender;
   
   public Server_Sender_Thread(OutputStream sender) {
      this.sender = sender;
   }
   
   Scanner scanner = new Scanner(System.in, "euc-kr");
   String sendMsg = null;

   @Override
   public void run() {
      try {
         while(true){
            sendMsg = scanner.next();      //Ŭ���̾�Ʈ�� ���� ȯ�� �޼���
//            System.out.println("���� �޼��� : " + sendMsg);
            sender.write(sendMsg.getBytes());   //�޽��� ����
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
      
   }
}