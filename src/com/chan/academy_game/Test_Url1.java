package com.chan.academy_game;

import java.awt.*;
import java.net.*;                      // URL�� import!�Ѵ�.
public class Test_Url1{
  public static void main(String[] args){
	Test_Url1 ob=new Test_Url1();
    Class cl= ob.getClass();                 // ob�� ���� Ŭ���� ��ü�� ��´�.
    URL url=cl.getResource("Url1.java");    // "Url1.java"�� Url ��ü�� �����.
    System.out.println(cl.toString());
    System.out.println(url.toString());
  }
}
