package com.chan.academy.game.test;

import java.awt.Frame;
import java.awt.Graphics;

public class Test_Paint1 extends Frame {
	public Test_Paint1(String title) { // 생성자
		super(title);
	}

	public void paint(Graphics g) { // Graphics 클래스 --- 그림그리기 전에 무조건 생성해야한다
		g.drawLine(10, 30, 50, 50); // 선을 그리는 메소드 --- 시작점 x, 시작점 y, 끝점 x, 끝점 y
		g.drawLine(80, 80, 200, 80);
		g.drawRect(60, 30, 50, 50); // 사각형을 그린다
		g.drawString("Hello!", 120, 50); // 문자열을 그린다
	}

	public static void main(String[] args) {
		Test_Paint1 f = new Test_Paint1("paint");
		f.setSize(500, 500); // 창크기
		f.setVisible(true); // 프레임이 보여질 때 paint가 호출된다.
	}
}
