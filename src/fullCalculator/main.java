package fullCalculator;

import java.awt.*;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class main {
	
	public static void main(String x []) {
		
		
		JFrame f = new JFrame("QA Consulting");
		
		//allows the user to use the cross button on the frame
		f.addWindowListener(new WindowAdapter() {
			public void windowDeactivated() {
				System.exit(0);
			}
		});
		
		JPanel P1 = new JPanel();
		JPanel P2 = new JPanel();
		P2.setLayout(new GridLayout(4, 4));
		
		//creating the text fields
		TextField tf = new TextField(40);
		
		//creating the buttons
		JButton B1 = new JButton("C");
		JButton B2 = new JButton("1");
		JButton B3 = new JButton("2");
		JButton B4 = new JButton("3");
		JButton B5 = new JButton("4");
		JButton B6 = new JButton("5");
		JButton B7 = new JButton("6");
		JButton B8 = new JButton("7");
		JButton B9 = new JButton("8");
		JButton B10 = new JButton("9");
		JButton B11 = new JButton("0");
		JButton B12 = new JButton("+");
		JButton B13 = new JButton("-");
		JButton B14 = new JButton("/");
		JButton B15 = new JButton("*");
		JButton B16 = new JButton("=");
		
		
		addEvents E1 = new addEvents(tf, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16);		
		
		B1.addActionListener(E1);
		B2.addActionListener(E1);
		B3.addActionListener(E1);
		B4.addActionListener(E1);
		B5.addActionListener(E1);
		B6.addActionListener(E1);
		B7.addActionListener(E1);
		B8.addActionListener(E1);
		B9.addActionListener(E1);
		B10.addActionListener(E1);
		B11.addActionListener(E1);
		B12.addActionListener(E1);
		B13.addActionListener(E1);
		B14.addActionListener(E1);
		B15.addActionListener(E1);
		B16.addActionListener(E1);
		
		
		
		//Adding the buttons
		
		P1.add(tf);	
		P2.add(B1);
		P2.add(B2);
		P2.add(B3);
		P2.add(B4);
		P2.add(B5);	
		P2.add(B6);
		P2.add(B7);
		P2.add(B8);
		P2.add(B9);
		P2.add(B10);	
		P2.add(B11);
		P2.add(B12);
		P2.add(B13);
		P2.add(B14);
		P2.add(B15);	
		P2.add(B16);

		
		
		
		//making the window visible
		f.add(P1, BorderLayout.NORTH);
		f.add(P2);

		
		f.setVisible(true);
		f.setSize(400, 400);
		
	}
}

