package swings;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxEx extends JFrame {
	public JComboBoxEx() {
		// TODO Auto-generated constructor stub
		String courses[] = { "JAVA", "C++", "BIG DATA" };
		JComboBox cb = new JComboBox(courses);
		cb.setBounds(10, 10, 100, 40);
		
		add(cb);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	new JComboBoxEx();
	}

}
