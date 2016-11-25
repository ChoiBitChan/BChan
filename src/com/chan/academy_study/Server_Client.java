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
			Socket conSock = new Socket(); // ������ ������ �� ����� ���� ����
			InetSocketAddress conAddr = new InetSocketAddress("192.168.20.13", 1818); //
			conSock.connect(conAddr); // ������ �ּҷ� ����

			
			InputStream reciever = conSock.getInputStream();
			byte[] recvBuf = new byte[100]; // ���ŵ����͸� ���� �������
			int bytesCnt = reciever.read(recvBuf); // ���Ͽ��� ���ŵ����� ��������
			String recvMsg = new String(recvBuf, 0, bytesCnt, "UTF-8");
//			System.out.println("	���� �޼��� : " + recvMsg); // ����ϱ�
			
			if(recvMsg.equals("1")){
				System.out.println("	���� �޼��� : ����");
			} else if(recvMsg.equals("2")){
				System.out.println("	���� �޼��� : ����");
			} else if(recvMsg.equals("3")){
				System.out.println("	���� �޼��� : ��");
			}
			
			
			OutputStream sender = conSock.getOutputStream();
			String sendBuf = "2"; // ���� �޼���
			sender.write(sendBuf.getBytes()); // ������ �޽��� ������
			System.out.println("���� �޼��� : " + sendBuf);
			*/
			
			
			
			
			//��ö������ ���� �ҽ�
			
			Socket c_socket = new Socket(); // Ŭ���̾�Ʈ ���� ����
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
				System.out.println("				���� �޼���: " + recvMsg);
				
			}  
			
			
		
		
		
		} catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
