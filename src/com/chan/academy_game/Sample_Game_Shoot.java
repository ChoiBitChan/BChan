package com.chan.academy_game;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.ArrayList;
import javax.swing.*;

public class Sample_Game_Shoot extends JFrame implements Runnable, KeyListener {
// JFrame : Swing API�� �ٽ� Ŭ����
// Runnable : ��Ƽ ������� �������̽�
// KeyListener : Ű���� �Է� ó�� �������̽�
	
	private BufferedImage bi = null;
	private ArrayList msList = null;
	private ArrayList enList = null;
	private boolean left = false, right = false, up = false, down = false, fire = false;
	// Ű������ �Է°�
	// false�� ���������� ���� ����
	private boolean start = true, end = false;
	private int w = 500, h = 800, x = 250, y = 600, xw = 10, xh = 10, score = 0, pHp = 20;
	// w, h : ����, ���� â ũ��
	// x, y : �÷��̾� ������
	// xw, xh : �÷��̾� ũ��

	public Sample_Game_Shoot() { // ������
		bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		msList = new ArrayList(); // ArrayList ����
		enList = new ArrayList(); // ArrayList ����
		this.addKeyListener(this); // Ű���� �Է��� �޴´�
		this.setSize(w, h); // â ũ�� ����, w : ����, h : ����
		this.setTitle("Shooting Game by BC"); // â�� ����
		this.setResizable(false); // â�� ũ�� ���� ���� ����(false)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X��ư ���� ����
		this.setVisible(true); // â�� ȭ�鿡 �����ش�(true)
	}

	public void run() {
		try {
			int msCnt = 0;
			int enCnt = 0;
			while (true) {
				Thread.sleep(10);
				if (start) {
					
					if (enCnt > 250) { // ��ü ���� �ӵ� ���� ���� ������
						enCreate();
						enCnt = 0;
					}
					if (msCnt >= 10) { // �̻��� ���� �ӵ�
						fireMs();
						msCnt = 0;
					}
					msCnt += 10;
					enCnt += 10;
					keyControl();
					crashChk();
				}
				draw();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fireMs() {
		if (fire) {
			if (msList.size() < 10000) { // ȭ�鿡 �����ִ� �̻��� ��
				Ms m = new Ms(this.x, this.y);
				msList.add(m);
			}
		}
	}

	public void enCreate() {
		for (int i = 0; i < 10; i++) { // ��ü �� ( �ѹ��� �����°� 10�� �̴�)
			double rx = Math.random() * (w - xw);
			double ry = Math.random() * 50;
			shootEnemy en = new shootEnemy((int) rx, (int) ry);
			enList.add(en);
		}
	}

	public void crashChk() {
		Graphics g = this.getGraphics();
		Polygon p = null;
		for (int i = 0; i < msList.size(); i++) {
			Ms m = (Ms) msList.get(i);
			for (int j = 0; j < enList.size(); j++) {
				shootEnemy e = (shootEnemy) enList.get(j);
				int[] xpoints = { m.x, (m.x + m.w), (m.x + m.w), m.x };
				int[] ypoints = { m.y, m.y, (m.y + m.h), (m.y + m.h) };
				p = new Polygon(xpoints, ypoints, 4);
				if (p.intersects((double) e.x, (double) e.y, (double) e.w, (double) e.h)) {
					msList.remove(i);
					
					e.enHp--;
					
					if(e.enHp == 0){
						enList.remove(j);
					}
					
					score++;
				}
			}
		}
		for (int i = 0; i < enList.size(); i++) {
			shootEnemy e = (shootEnemy) enList.get(i);
			int[] xpoints = { x, (x + xw), (x + xw), x };
			int[] ypoints = { y, y, (y + xh), (y + xh) };
			p = new Polygon(xpoints, ypoints, 4);
			if (p.intersects((double) e.x, (double) e.y, (double) e.w, (double) e.h)) {
				enList.remove(i);
				pHp--;
				if(pHp == 0){
					start = false;
					end = true;
					score = 0;
					pHp = 20;
				}
			}
		}
	}

	public void draw() {
		Graphics gs = bi.getGraphics();
		
		gs.setColor(Color.black); // ����
		gs.fillRect(0, 0, w, h);
		
		gs.setColor(Color.white); // �۾� ��
		gs.drawString("Enemy ��ü�� : " + enList.size(), 20, 50);
		gs.drawString("Ms ��ü�� : " + msList.size(), 20, 70);
		
		gs.drawString("���� : " + score, 375, 50);
		gs.drawString("Hp : " + pHp, 375, 70);
		gs.drawString("���ӽ��� : Enter", 375, 90);
		

		if (end) {
			gs.drawString("G A M E     O V E R", 200, 400);
		}
		
		gs.setColor(Color.yellow); // �÷��̾� ��
		gs.fillRect(x, y, xw, xh);

		for (int i = 0; i < msList.size(); i++) {
			Ms m1 = (Ms) msList.get(i);
			gs.setColor(Color.red); // �̻��� ��
			gs.fillOval(m1.x, m1.y, m1.w, m1.h); // �̻��� �� ä���, ������
//			gs.drawOval(m.x+3, m.y, m.w, m.h); // ���� �̻���
			m1.moveMs1();
			
			Ms m2 = (Ms) msList.get(i);
			gs.setColor(Color.blue); // �̻��� ��
			gs.fillOval(m2.x, m2.y, m2.w, m2.h); // �̻��� �� ä���, ������
//			gs.drawOval(m.x+3, m.y, m.w, m.h); // ���� �̻���
			m2.moveMs2();
			
			Ms m3 = (Ms) msList.get(i);
			gs.setColor(Color.yellow); // �̻��� ��
			gs.fillOval(m3.x, m3.y, m3.w, m3.h); // �̻��� �� ä���, ������
//			gs.drawOval(m.x+3, m.y, m.w, m.h); // ���� �̻���
			m3.moveMs3();
			
			if ((m1.y < 0) && (m2.y < 0) && (m3.y < 0))
				msList.remove(i);
		}
		
		gs.setColor(Color.gray); // ��ü ��
		for (int i = 0; i < enList.size(); i++) {
			shootEnemy e = (shootEnemy) enList.get(i);
			gs.fillRect(e.x, e.y, e.w, e.h);
			if (e.y > h)
				enList.remove(i);
			e.moveEn();
		}

		Graphics ge = this.getGraphics();
		ge.drawImage(bi, 0, 0, w, h, this);
	}

	public void keyControl() {
		if (0 < x) { // �÷��̾��� x��ǥ�� 0���� ũ��
			if (left)
				x -= 2;
		}
		if (w > x + xw) { // �÷��̾��� ��ǥ�� ȭ�� �������� �Ѿ�� ������
			if (right)
				x += 2;
		}
		if (10 < y) { // �÷��̾��� y��ǥ�� 10���� ũ��
			if (up)
				y -= 2;
		}
		if (h > y + xh) { // �÷��̾��� ��ǥ�� ȭ�� �Ʒ����� �Ѿ�� ������
			if (down)
				y += 2;
		}
	}

	public void keyPressed(KeyEvent ke) { // Callback �޼ҵ�, Ű�� ������ �� ȣ���
		switch (ke.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = true;
			break;
		case KeyEvent.VK_RIGHT:
			right = true;
			break;
		case KeyEvent.VK_UP:
			up = true;
			break;
		case KeyEvent.VK_DOWN:
			down = true;
			break;
		case KeyEvent.VK_SPACE:
			fire = true;
			break;
		case KeyEvent.VK_ENTER:
			start = true;
			end = false;
			break;
		}
	}

	public void keyReleased(KeyEvent ke) {
		switch (ke.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = false;
			break;
		case KeyEvent.VK_RIGHT:
			right = false;
			break;
		case KeyEvent.VK_UP:
			up = false;
			break;
		case KeyEvent.VK_DOWN:
			down = false;
			break;
		case KeyEvent.VK_SPACE:
			fire = false;
			break;
		}
	}

	public void keyTyped(KeyEvent ke) {
	}

	public static void main(String[] args) { // ���� �޼ҵ�
		Thread t = new Thread(new Sample_Game_Shoot());
		t.start();
	}
}

class Ms { // �̻��� Ŭ����
	int x;
	int y;
	int w = 8;
	int h = 8;

	public Ms(int x, int y) { // �̻��� ������
		this.x = x;
		this.y = y;
	}

	public void moveMs1() {
		y = y - 5; // �̻��� �ӵ�
	}
	public void moveMs2() {
		y = y - 3; // �̻��� �ӵ�
		x = x - (int)(Math.random() * 40);
	}
	public void moveMs3() {
		y = y - 1; // �̻��� �ӵ�
		x = x + (int)(Math.random() * 40);
	}
}

class shootEnemy { // ��ü Ŭ���� 
	int x;
	int y;
	int w = 10;
	int h = 10;
	int enHp = 10;

	public shootEnemy(int x, int y) { // ��ü ������
		this.x = x;
		this.y = y;
	}

	public void moveEn() {
		y = y+3; // ��ü �ӵ�
		x = x - (int)(Math.random() * 2);
		x = x + (int)(Math.random() * 2);
	}
}
