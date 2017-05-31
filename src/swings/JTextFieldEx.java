package swings;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldEx extends JFrame{
	JTextField t1,t2;
	public JTextFieldEx() {
	// TODO Auto-generated constructor stub
		t1 = new JTextField();
		t1.setBounds(10, 10, 100, 20);
		
		t2 = new JTextField();
		t2.setBounds(10, 40, 100, 20);
		
		add(t1);
		add(t2);
		setTitle("TEXT FIELD");
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextFieldEx();
	}

}
