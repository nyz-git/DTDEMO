package swingsLayout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutEx extends JFrame {
	JButton b1, b2, b3;

	public GridBagLayoutEx() {
		// TODO Auto-generated constructor stub
		b1 = new JButton("ONE");
		b2 = new JButton("TWO");
		b3 = new JButton("THREE");

		setSize(300, 300);
		setLayout(new GridBagLayout());
		setVisible(true);

		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		add(b1, c);

		c.gridx = 1;
		c.gridy = 1;
		add(b2, c);

		c.gridx = 2;
		c.gridy = 2;
		add(b3, c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridBagLayoutEx();
	}

}
