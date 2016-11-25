package com.chan.academy_study;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			
			
			/*
			ServerSocket servSock = new ServerSocket(); // 서버용 소켓 생성
			InetSocketAddress servAddr = new InetSocketAddress("192.168.20.13", 1818); // 서비스할 IP주소와 포트번호를 결정
			servSock.bind(servAddr); // 소켓에 결정한 주소(IP, Port)를 등록
			
			Socket cliSock1 = servSock.accept(); // 서버소켓으로 찾아온 고객을 고객전용 소켓으로 연결
			
			
			OutputStream sender = cliSock1.getOutputStream();
			String sendMsg = "3"; // 클라이언트로 보낼 환영 메세지
			sender.write(sendMsg.getBytes()); // 클라이언트로 메세지 전송
			System.out.println("보낸 메세지 : " + sendMsg); // 보낸 데이터 화면에 출력
			
			
			InputStream receiver = cliSock1.getInputStream();
			byte[] recvBuf = new byte[100]; // 클라이언트로부터 수신된 데이터를 담을 공간(변수)
			int bytesCnt = receiver.read(recvBuf); // byte배열을 String배열로 변환
			String recvMsg = new String(recvBuf, 0, bytesCnt, "UTF-8");
//			System.out.println("	받은 메세지 : " + recvMsg); // 수신한 데이터 화면에 출력
				
			if(recvMsg.equals("1")){
				System.out.println("	받은 메세지 : 가위");
			} else if(recvMsg.equals("2")){
				System.out.println("	받은 메세지 : 바위");
			} else if(recvMsg.equals("3")){
				System.out.println("	받은 메세지 : 보");
			}
			*/
			
			
			
			
			
			
			
			//인철이형이 만든 소스
			
			ServerSocket s_socket = new ServerSocket(); // 서버 소켓 생성
			InetSocketAddress s_address = new InetSocketAddress("127.0.0.1", 1818);
																					
			s_socket.bind(s_address);

			Socket c_socket = s_socket.accept(); // 클라이언트로 부터 요청 대기

			OutputStream sender = c_socket.getOutputStream();
			InputStream receiver = c_socket.getInputStream();

			byte[] recvBuf = new byte[100];
			int bytesCnt = 0;
			String recvMsg = null;

			Server_Sender_Thread sendTh = new Server_Sender_Thread(sender);
			sendTh.start();

			while (true) {
				recvBuf = new byte[100];
				bytesCnt = receiver.read(recvBuf);
				recvMsg = new String(recvBuf, 0, bytesCnt);
				System.out.println("				받은 메세지 : " + recvMsg);
				
			}
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		

	}

}
