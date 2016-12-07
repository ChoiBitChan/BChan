package com.chan.home.study.test;

import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Window extends JFrame {

	public int width;
	public int height;
	public int xCnt;
	public int yCnt;
	public int area;
	
	public boolean[][] grid;
	public JPanel[][] background;
	public JPanel center;
	
	public Container fc;
	
	public ArrayList<Color> colorList;
	public final Color bgColor = Color.white;

	public Window(String str) {

		this.xCnt = 14;
		this.yCnt = 25;
		this.area = 20;
		this.width = this.xCnt * this.area;
		this.height = this.yCnt * this.area;
		this.background = new JPanel[this.xCnt][this.yCnt];
		this.grid = new boolean[this.xCnt][this.yCnt];
		
		this.fc = this.getContentPane();
		
		this.center = new JPanel();
		this.center.setSize(this.width, this.height);
		this.center.setLayout(null);
		this.center.setBackground(new Color(224,255,216));
		
		this.setBounds(500, 200, this.width, this.height);
		
		for(int i = 0; i < background.length; i++){
			for(int p = 0; p < background[i].length; p++){
				this.background[i][p] = new JPanel();
				this.background[i][p].setBounds(i * this.area, p * this.area, this.area, this.area);
				this.background[i][p].setBackground(this.bgColor);
				this.center.add(background[i][p]);
			}
		}
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {

		new Window("Window");

	}
}
