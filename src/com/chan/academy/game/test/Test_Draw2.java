package com.chan.academy.game.test;

import java.awt.Frame;
import java.awt.Graphics;

public class Test_Draw2 extends Frame {
	public Test_Draw2(String title) {
		super(title);
	}

	public void paint(Graphics g) {
		g.fillRect(60, 30, 50, 50);
		g.fillRoundRect(120, 30, 50, 50, 20, 20);
		g.fillOval(10, 100, 70, 50);
	}

	public static void main(String[] args) {
		Frame f = new Test_Draw2("도형 그리기");
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
