package fr.dauphine.ja.azzazmyriam.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyDisplay extends JPanel {
	
	public void paintComponent(Graphics g) {
		System.out.println("c'est carré");
		g.drawLine(300, 300, 100, 100);
	}

	public static void main(String[] args) {
		
	
		JFrame f = new JFrame("Java Avancé - Graphic Display");
		f.setSize(new Dimension(500,500));
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
		MyDisplay d = new MyDisplay();
		f.add(d);
		f.setContentPane(d);
		
		JPanel pan = new JPanel();
		pan.setBackground(Color.BLUE);
		
		
	}

}
