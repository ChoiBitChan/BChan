package com.chan.academy_game;

import java.awt.Frame;
import java.awt.Graphics;

public class Test_Draw1 extends Frame {
	public Test_Draw1(String title) { // 생성자
		super(title);
	}

	public void paint(Graphics g) {
		g.drawLine(10, 30, 50, 50); // 직선을 그린다.
		g.drawRect(60, 30, 50, 50); // 사각형을 그린다.
		g.drawRoundRect(120, 30, 50, 50, 20, 20); // 둥근 사각형을 그린다.
		g.drawOval(10, 100, 70, 50); // 타원을 그린다.
		g.drawArc(100, 100, 50, 50, 90, 180); // 원호를 그린다.
		int[] x = new int[] { 200, 240, 200, 220, 240 };
		int[] y = new int[] { 80, 80, 120, 60, 120 };
		g.drawPolygon(x, y, 5); // 다각형을 그린다.
	}

	public static void main(String[] args) {
		Frame f = new Test_Draw1("도형 그리기");
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
