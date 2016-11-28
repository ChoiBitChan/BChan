package com.chan.academy_game;

import java.awt.Frame;
import java.awt.Graphics;

public class Test_Paint2 {
	public static void main(String[] args) {
		Frame f = new Frame("paint");
		f.setSize(200, 100);
		f.setVisible(true); // 프레임을 보이게 한다.
		Graphics g = f.getGraphics(); // 프레임의 Graphics 객체를 얻어온다.
		g.drawLine(10, 30, 50, 50);
		g.drawRect(60, 30, 50, 50);
		g.drawString("Hello!", 120, 50);
	}
}
