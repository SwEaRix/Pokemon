package com;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameFrame extends JFrame {
	private static final long serialVersionUID = -6945375221422652433L;
	
	private JPanel panel;
	
	public GameFrame(String title, int width, int height) {
		super(title);
		
		this.panel = new JPanel();
		this.panel.setPreferredSize(new Dimension(width, height));
		
		this.setContentPane(this.panel);
		
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public Graphics getPanelGraphics() {
		return this.panel.getGraphics();
	}
}
