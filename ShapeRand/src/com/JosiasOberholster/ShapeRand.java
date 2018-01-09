package com.JosiasOberholster;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ShapeRand implements ActionListener
{
	JFrame frame;
	JButton button1, button2, button3, button4;
	JPanel panel;
	
	public static void main(String[] args)
	{
		new ShapeRand().go();
	}
	
	public void go()
	{
		frame = new JFrame("The Random Shape & Colour Generator");
		panel = new JPanel();
		button1 = new JButton("Square");
		button2 = new JButton("Round");
		button3 = new JButton("Round Edge Square");
		button4 = new JButton("Random Form");
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		button1.addActionListener(new Square());
		button2.addActionListener(new Round());
		button3.addActionListener(new RoundEdgeSquare());
		button4.addActionListener(new Square());
		button4.addActionListener(new Round());
		button4.addActionListener(new RoundEdgeSquare());
		
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setBackground(Color.darkGray);
		
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	class Square implements ActionListener
	{
		public void actionPerformed(ActionEvent ev)
		{
			RandSquare rs = new RandSquare();
			
			frame.getContentPane().add(BorderLayout.CENTER, rs);
			frame.setSize(500, 300);
			frame.setVisible(true);
		}
	}
	
	class Round implements ActionListener
	{
		public void actionPerformed(ActionEvent ev)
		{
			RandRound rr = new RandRound();
			
			frame.getContentPane().add(BorderLayout.CENTER, rr);
			frame.setSize(500, 300);
			frame.setVisible(true);
		}
	}
	
	class RoundEdgeSquare implements ActionListener
	{
		public void actionPerformed(ActionEvent ev)
		{
			RandRoundEdgeSquare rres = new RandRoundEdgeSquare();
			
			frame.getContentPane().add(BorderLayout.CENTER, rres);
			frame.setSize(500, 300);
			frame.setVisible(true);
		}
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		//Unimplemented ActionListener		
	}
	
	class RandSquare extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			
			int red = (int)(Math.random() * 255);
			int green = (int)(Math.random() * 255);
			int blue = (int)(Math.random() * 255);
			
			g.setColor(new Color(red, green, blue));
			g.fillRect(120, 80, 100, 100);
			
		}
	}
	
	class RandRound extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			
			int red = (int)(Math.random() * 255);
			int green = (int)(Math.random() * 255);
			int blue = (int)(Math.random() * 255);
			
			g.setColor(new Color(red, green, blue));
			g.fillOval(120, 80, 100, 100);
			
		}
	}
	
	class RandRoundEdgeSquare extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			
			int red = (int)(Math.random() * 255);
			int green = (int)(Math.random() * 255);
			int blue = (int)(Math.random() * 255);
			
			g.setColor(new Color(red, green, blue));
			g.fillOval(120, 80, 100, 100);
			g.fillRoundRect(120, 80, 100, 100, 20, 20);
			
		}
	}
}
