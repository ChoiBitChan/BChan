package com.chan.academy.game.test;

import java.awt.Frame;
import java.awt.Graphics;

public class Test_Paint1 extends Frame {
	public Test_Paint1(String title) { // ������
		super(title);
	}

	public void paint(Graphics g) { // Graphics Ŭ���� --- �׸��׸��� ���� ������ �����ؾ��Ѵ�
		g.drawLine(10, 30, 50, 50); // ���� �׸��� �޼ҵ� --- ������ x, ������ y, ���� x, ���� y
		g.drawLine(80, 80, 200, 80);
		g.drawRect(60, 30, 50, 50); // �簢���� �׸���
		g.drawString("Hello!", 120, 50); // ���ڿ��� �׸���
	}

	public static void main(String[] args) {
		Test_Paint1 f = new Test_Paint1("paint");
		f.setSize(500, 500); // âũ��
		f.setVisible(true); // �������� ������ �� paint�� ȣ��ȴ�.
	}
}
