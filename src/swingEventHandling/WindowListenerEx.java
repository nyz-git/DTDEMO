package swingEventHandling;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class WindowListenerEx extends JFrame {

	public WindowListenerEx() {
		// TODO Auto-generated constructor stub
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("WINDOW OPENED");
			}
			
			
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("WINDOW DEACTIVATED");	
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
			System.out.println("WINDOW CLOSING");	
			System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
			System.out.println("WINDOW ACTIVATED");	
			}



			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WindowListenerEx();
	}

}
