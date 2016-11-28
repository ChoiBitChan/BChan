package com.chan.academy_game;

import java.awt.*;
import java.net.*;                      // URL을 import!한다.
public class Test_Url1{
  public static void main(String[] args){
	Test_Url1 ob=new Test_Url1();
    Class cl= ob.getClass();                 // ob에 대한 클래스 객체를 얻는다.
    URL url=cl.getResource("Url1.java");    // "Url1.java"의 Url 객체를 만든다.
    System.out.println(cl.toString());
    System.out.println(url.toString());
  }
}
