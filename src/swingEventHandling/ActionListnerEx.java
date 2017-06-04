package swingEventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionListnerEx extends JFrame{
	public ActionListnerEx() {
		// TODO Auto-generated constructor stub
	JButton b1 =  new JButton("ONE");
	JButton b2 =  new JButton("TWO");
	setSize(300, 300);
	setLayout(new FlowLayout());
	setVisible(true);
	
	add(b1);
	add(b2);
	
		b1.addActionListener(new ActionListener() { //adding ActionListener to Button
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("BUTTON ONE IS CLICKED");
		}
	});
	
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("BUTTON TWO IS CLICKED");
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ActionListnerEx();
	}

}
