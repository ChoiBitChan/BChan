package com.chan.academy_study;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Server_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			/*
			Socket conSock = new Socket(); // 서버에 접속할 때 사용할 소켓 생성
			InetSocketAddress conAddr = new InetSocketAddress("192.168.20.13", 1818); //
			conSock.connect(conAddr); // 결정된 주소로 연결

			
			InputStream reciever = conSock.getInputStream();
			byte[] recvBuf = new byte[100]; // 수신데이터를 담을 저장공간
			int bytesCnt = reciever.read(recvBuf); // 소켓에서 수신데이터 가져오기
			String recvMsg = new String(recvBuf, 0, bytesCnt, "UTF-8");
//			System.out.println("	받은 메세지 : " + recvMsg); // 출력하기
			
			if(recvMsg.equals("1")){
				System.out.println("	받은 메세지 : 가위");
			} else if(recvMsg.equals("2")){
				System.out.println("	받은 메세지 : 바위");
			} else if(recvMsg.equals("3")){
				System.out.println("	받은 메세지 : 보");
			}
			
			
			OutputStream sender = conSock.getOutputStream();
			String sendBuf = "2"; // 보낼 메세지
			sender.write(sendBuf.getBytes()); // 서버로 메시지 보내기
			System.out.println("보낸 메세지 : " + sendBuf);
			*/
			
			
			
			
			//인철이형이 만든 소스
			
			Socket c_socket = new Socket(); // 클라이언트 소켓 생성
			InetSocketAddress s_address = new InetSocketAddress("127.0.0.1", 1818);
			
			c_socket.connect(s_address);

			InputStream receiver = c_socket.getInputStream();
			OutputStream sender = c_socket.getOutputStream();

			byte[] recvBuf = new byte[100];
			int bytesCnt = 0;
			String recvMsg = null;

			Server_Sender_Thread sendTh = new Server_Sender_Thread(sender);
			sendTh.start();

			while (true) {
				recvBuf = new byte[100];
				bytesCnt = receiver.read(recvBuf);
				recvMsg = new String(recvBuf, 0, bytesCnt);
				System.out.println("				받은 메세지: " + recvMsg);
				
			}  
			
			
		
		
		
		} catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
