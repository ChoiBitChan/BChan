package com.chan.academy.game.sample;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.ArrayList;
import javax.swing.*;

public class Sample_Game_Shoot extends JFrame implements Runnable, KeyListener {
// JFrame : Swing API의 핵심 클래스
// Runnable : 멀티 쓰레드용 인터페이스
// KeyListener : 키보드 입력 처리 인터페이스
	
	private BufferedImage bi = null;
	private ArrayList msList1 = null;
	private ArrayList enList = null;
	private boolean left = false, right = false, up = false, down = false, fire = false;
	// 키보드의 입력값
	// false은 누르고있지 않은 상태
	private boolean start = true, end = false;
	private int w = 500, h = 800, x = 250, y = 600, xw = 10, xh = 10, score = 0, pHp = 20;
	// w, h : 가로, 세로 창 크기
	// x, y : 플레이어 시작점
	// xw, xh : 플레이어 크기

	public Sample_Game_Shoot() { // 생성자
		bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		msList1 = new ArrayList(); // ArrayList 생성
		enList = new ArrayList(); // ArrayList 생성
		this.addKeyListener(this); // 키보드 입력을 받는다
		this.setSize(w, h); // 창 크기 결정, w : 가로, h : 세로
		this.setTitle("Shooting Game by BC"); // 창의 제목
		this.setResizable(false); // 창의 크기 조정 가능 여부(false)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X버튼 으로 종료
		this.setVisible(true); // 창을 화면에 보여준다(true)
	}

	public void run() { // 메소드 실행
		try {
			int msCnt = 0; // msCnt 초기값
			int enCnt = 0; // enCnt 초기값
			while (true) {
				Thread.sleep(10);
				if (start) {
					
					if (enCnt > 750) { // 객체 생성 속도 낮을 수록 빠르다
						enCreate();
						enCnt = 0;
					}
					if (msCnt >= 50) { // 미사일 연사 속도
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

	public void fireMs() { // 미사일 발사
		if (fire) {
			if (msList1.size() < 1000) { // 화면에 보여주는 미사일 수
				Ms1 m1 = new Ms1(this.x, this.y);
				msList1.add(m1);
			}
		}
	}

	public void enCreate() { // 객체 생성
		for (int i = 0; i < 10; i++) { // 객체 수 ( 한번에 나오는게 10개 이다)
			double rx = Math.random() * (w - xw);
			double ry = Math.random() * 50;
			shootEnemy en = new shootEnemy((int) rx, (int) ry);
			enList.add(en);
		}
	}

	public void crashChk() {
		Graphics g = this.getGraphics();
		Polygon p = null;
		for (int i = 0; i < msList1.size(); i++) {
			Ms1 m1 = (Ms1) msList1.get(i);
			for (int j = 0; j < enList.size(); j++) {
				shootEnemy e = (shootEnemy) enList.get(j);
				int[] xpoints = { m1.x, (m1.x + m1.w), (m1.x + m1.w), m1.x };
				int[] ypoints = { m1.y, m1.y, (m1.y + m1.h), (m1.y + m1.h) };
				p = new Polygon(xpoints, ypoints, 4);
				if (p.intersects((double) e.x, (double) e.y, (double) e.w, (double) e.h)) {
					msList1.remove(i);
					
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
		
		gs.setColor(Color.black); // 배경색
		gs.fillRect(0, 0, w, h);
		
		gs.setColor(Color.white); // 글씨 색
		gs.drawString("Enemy 객체수 : " + enList.size(), 20, 50);
		gs.drawString("Ms 객체수 : " + msList1.size(), 20, 70);
		
		gs.drawString("점수 : " + score, 375, 50);
		gs.drawString("Hp : " + pHp, 375, 70);
		gs.drawString("게임시작 : Enter", 375, 90);
		

		if (end) {
			gs.drawString("G A M E     O V E R", 200, 400);
		}
		
		gs.setColor(Color.yellow); // 플레이어 색
		gs.fillRect(x, y, xw, xh);

		for (int i = 0; i < msList1.size(); i++) {
			Ms1 m = (Ms1) msList1.get(i);
			gs.setColor(Color.red); // 미사일 색
			gs.fillOval(m.x, m.y, m.w, m.h); // 미사일 색 채우기, 시작점
//			gs.drawOval(m.x+3, m.y, m.w, m.h); // 원형 미사일
			m.moveMs1();
			if (m.y < 0)
				msList1.remove(i);
		}
		
		
		gs.setColor(Color.gray); // 객체 색
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
		if (0 < x) { // 플레이어의 x좌표가 0보다 크면
			if (left)
				x -= 2;
		}
		if (w > x + xw) { // 플레이어의 좌표가 화면 오른쪽을 넘어가지 않으면
			if (right)
				x += 2;
		}
		if (10 < y) { // 플레이어의 y좌표가 10보다 크면
			if (up)
				y -= 2;
		}
		if (h > y + xh) { // 플레이어의 좌표가 화면 아래쪽을 넘어가지 않으면
			if (down)
				y += 2;
		}
	}

	public void keyPressed(KeyEvent ke) { // Callback 메소드, 키가 눌렸을 때 호출됨
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

	public static void main(String[] args) { // 메인 메소드
		Thread t = new Thread(new Sample_Game_Shoot());
		t.start();
	}
}

class Ms1 { // 미사일 클래스
	int x;
	int y;
	int w = 8;
	int h = 8;

	public Ms1(int x, int y) { // 미사일 생성자
		this.x = x;
		this.y = y;
	}

	public void moveMs1() {
		y = y - 9; // 미사일 속도
	}
	
}


class shootEnemy { // 객체 클래스 
	int x;
	int y;
	int w = 10;
	int h = 10;
	int enHp = 3;

	public shootEnemy(int x, int y) { // 객체 생성자
		this.x = x;
		this.y = y;
	}

	public void moveEn() {
		y = y+3; // 객체 속도
		x = x - (int)(Math.random() * 2);
		x = x + (int)(Math.random() * 2);
	}
}
