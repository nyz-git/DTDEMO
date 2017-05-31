package swings;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonEx extends JFrame {
JRadioButton r1 ,r2;
	public JRadioButtonEx() {
		// TODO Auto-generated constructor stub
	r1 = new JRadioButton("MALE");
	r1.setBounds(0, 0, 60, 40);
	r2 = new JRadioButton("FEMALE",true);
	r2.setBounds(0, 50, 100, 40);
	
	ButtonGroup bg = new ButtonGroup();
	bg.add(r1);
	bg.add(r2);
	
	add(r1);
	add(r2);
	
	setSize(300, 300);
	setLayout(null);
	setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JRadioButtonEx();
	}

}
