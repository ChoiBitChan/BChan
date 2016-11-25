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
			ServerSocket servSock = new ServerSocket(); // ������ ���� ����
			InetSocketAddress servAddr = new InetSocketAddress("192.168.20.13", 1818); // ������ IP�ּҿ� ��Ʈ��ȣ�� ����
			servSock.bind(servAddr); // ���Ͽ� ������ �ּ�(IP, Port)�� ���
			
			Socket cliSock1 = servSock.accept(); // ������������ ã�ƿ� ���� ������ �������� ����
			
			
			OutputStream sender = cliSock1.getOutputStream();
			String sendMsg = "3"; // Ŭ���̾�Ʈ�� ���� ȯ�� �޼���
			sender.write(sendMsg.getBytes()); // Ŭ���̾�Ʈ�� �޼��� ����
			System.out.println("���� �޼��� : " + sendMsg); // ���� ������ ȭ�鿡 ���
			
			
			InputStream receiver = cliSock1.getInputStream();
			byte[] recvBuf = new byte[100]; // Ŭ���̾�Ʈ�κ��� ���ŵ� �����͸� ���� ����(����)
			int bytesCnt = receiver.read(recvBuf); // byte�迭�� String�迭�� ��ȯ
			String recvMsg = new String(recvBuf, 0, bytesCnt, "UTF-8");
//			System.out.println("	���� �޼��� : " + recvMsg); // ������ ������ ȭ�鿡 ���
				
			if(recvMsg.equals("1")){
				System.out.println("	���� �޼��� : ����");
			} else if(recvMsg.equals("2")){
				System.out.println("	���� �޼��� : ����");
			} else if(recvMsg.equals("3")){
				System.out.println("	���� �޼��� : ��");
			}
			*/
			
			
			
			
			
			
			
			//��ö������ ���� �ҽ�
			
			ServerSocket s_socket = new ServerSocket(); // ���� ���� ����
			InetSocketAddress s_address = new InetSocketAddress("127.0.0.1", 1818);
																					
			s_socket.bind(s_address);

			Socket c_socket = s_socket.accept(); // Ŭ���̾�Ʈ�� ���� ��û ���

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
				System.out.println("				���� �޼��� : " + recvMsg);
				
			}
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		

	}

}
