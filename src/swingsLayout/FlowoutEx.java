package swingsLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowoutEx extends JFrame {
	JButton b1, b2, b3, b4;

	public FlowoutEx() {
		// TODO Auto-generated constructor stub
		b1 = new JButton("ONE");

		b2 = new JButton("TWO");

		b3 = new JButton("THREE");

		b4 = new JButton("FOUR");

		add(b1);
		add(b2);
		add(b3);
		add(b4);

		setSize(300, 300);
		setLayout(new FlowLayout());//setting FlowLayout
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowoutEx();
	}

}
