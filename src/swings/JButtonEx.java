package swings;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("BUTTON EX");
		
		JButton b = new JButton("ONE"); // Creating First Button
		b.setBounds(150, 20, 100, 50); // Setting x,y,width,height of the button
		
		JButton b1 = new JButton("TWO"); // Creating Second Button with object name b1
		b1.setBounds(150, 80, 100, 50);
		
		f.add(b);
		f.add(b1);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);

	}

}
