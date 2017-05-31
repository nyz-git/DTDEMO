package swings;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JLabelEx extends JFrame {
	JLabel l1, l2;
	JTextField t1,t2;

	public JLabelEx() {
		// TODO Auto-generated constructor stub
		l1 = new JLabel("NAME");
		l1.setBounds(0, 0,100 ,20 );
		
		l2 = new JLabel("PASSWORD");
		l2.setBounds(0, 30,100 ,20 );
		
		t1 = new JTextField();
		t1.setBounds(50, 0, 100, 20);
		
		
		add(l1);
		add(l2);
		add(t1);
		
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JLabelEx();
	}

}
