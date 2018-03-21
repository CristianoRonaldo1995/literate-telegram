
package fullCalculator;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class addEvents implements ActionListener{

	TextField tf;
	JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16;
	String s1, s2, s3, s4, s5;
	int n, c;
	
	public addEvents(TextField n, JButton B1, JButton B2, JButton B3, JButton B4, JButton B5, JButton B6, JButton B7, JButton B8, JButton B9, 
					JButton B10, JButton B11, JButton B12, JButton B13, JButton B14, JButton B15, JButton B16) {
		
		tf = n;
		button1 = B1;
		button2 = B2;
		button3 = B3;
		button4 = B4;
		button5 = B5;
		button6 = B6;
		button7 = B7;
		button8 = B8;
		button9 = B9;
		button10 = B10;
		button11 = B11;
		button12 = B12;
		button13 = B13;
		button14 = B14;
		button15 = B15;
		button16 = B16;
	}
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		JButton button = (JButton) e.getSource();
		
		try {
		if(button ==button1)
		{
		
			s1 = tf.getText();
			tf.setText("");
			c=1;
		
		}
		if(button ==button2)
		{
			s3 = tf.getText();
			s4 = "1";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(button ==button3)
		{
			s3 = tf.getText();
			s4 = "2";
			s5 = s3+s4;
			tf.setText(s5);
		}if(button == button4)
		{
			s3 = tf.getText();
			s4 = "3";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(button ==button5)
		{
			s3 = tf.getText();
			s4 = "4";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(button ==button6)
		{
			s3 = tf.getText();
			s4 = "5";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(button ==button7)
		{
			s3 = tf.getText();
			s4 = "6";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(button ==button8)
		{
			s3 = tf.getText();
			s4 = "7";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(button ==button9)
		{
			s3 = tf.getText();
			s4 = "8";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(button==button10)
		{
			s3 = tf.getText();
			s4 = "9";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(button ==button11)
		{
			s3 = tf.getText();
			s4 = "0";
			s5 = s3+s4;
			tf.setText(s5);

		}
		if(button ==button12)
		{
			s1 = tf.getText();
			tf.setText("");
			c=1;

		}
		if(button ==button13)
		{
			s1 = tf.getText();
			tf.setText("");
			c=2;

		}
		if(button ==button14)
		{
			s1 = tf.getText();
			tf.setText("");
			c=3;

		}
		if(button ==button15)
		{
			s1 = tf.getText();
			tf.setText("");
			c=4;

		}
		if(button == button16)
		{
			s2 = tf.getText();
			if(c==1)
			{
				n = Integer.parseInt(s1)+Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
			}
			else if(c==2)
			{
				n = Integer.parseInt(s1)-Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
			}
			else if(c==3)
			{
				n = Integer.parseInt(s1)/Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
			}
			if (c==4)
			{
				n = Integer.parseInt(s1)*Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
			}
		
		}
	}
		
		
		
		catch (IndexOutOfBoundsException E1){System.out.println("Please insert numbers only");}
		catch (NumberFormatException E2){System.out.println("Entered String, Digits only please");}
		catch (ArithmeticException E3){System.out.println("No division by zero, please enter appropriate numbers");}
		catch (Exception E4){System.out.println("Somethign went wrong");}
		


	}
}
	


