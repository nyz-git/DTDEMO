package swingEventHandling;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class MouseMotionListenerEx extends JFrame {

	public MouseMotionListenerEx() {
		// TODO Auto-generated constructor stub
		setSize(300, 300);
		setLayout(null);
		setVisible(true);

		addMouseMotionListener(new MouseMotionListener() { //adding Mouse Motion Listener to the Frame

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MOUSE MOVED");
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MOUSE DRAG");
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseMotionListenerEx();
	}

}
