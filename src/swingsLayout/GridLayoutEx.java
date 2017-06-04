package swingsLayout;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame{

	JButton b1, b2, b3, b4, b5;

	public GridLayoutEx() {
		// TODO Auto-generated constructor stub
		b1 = new JButton("ONE");
		b2 = new JButton("TWO");
		b3 = new JButton("THREE");
		b4 = new JButton("FOUR");
		b5 = new JButton("FIVE");

		setSize(300, 300);
		setLayout(new GridLayout(2, 3));
		setVisible(true);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutEx();
	}

}
