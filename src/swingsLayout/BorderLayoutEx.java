package swingsLayout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {

	JButton b1, b2, b3, b4, b5;

	public BorderLayoutEx() {
		// TODO Auto-generated constructor stub
		b1 = new JButton("ONE");
		b2 = new JButton("TWO");
		b3 = new JButton("THREE");
		b4 = new JButton("FOUR");
		b5 = new JButton("FIVE");

		setSize(300, 300);
		setLayout(new BorderLayout());
		setVisible(true);

		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.WEST);
		add(b4, BorderLayout.EAST);
		add(b5, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutEx();
	}

}
