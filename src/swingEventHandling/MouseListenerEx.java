package swingEventHandling;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseListenerEx extends JFrame {
	public MouseListenerEx() {
		// TODO Auto-generated constructor stub

		setSize(300, 300);
		setLayout(null);
		setVisible(true);

		addMouseListener(new MouseListener() { //adding MouseListener to the Frame

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MOUSE PRESSED");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MOUSE EXITED");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MOUSE ENTERED");
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerEx();
	}

}
