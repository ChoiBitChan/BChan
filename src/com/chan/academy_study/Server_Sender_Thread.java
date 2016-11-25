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
            sendMsg = scanner.next();      //클라이언트로 보낼 환영 메세지
//            System.out.println("보낸 메세지 : " + sendMsg);
            sender.write(sendMsg.getBytes());   //메시지 전송
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
      
   }
}