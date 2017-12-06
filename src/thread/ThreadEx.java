package com.nyz.thread;

class L1 extends Thread {
	public void run() {

		try {
			for (int i = 0; i < 4; i++) {
				System.out.println("Hello");
				Thread.sleep(2000);
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class L2 extends Thread {
	public void run() {

		try {
			for (int i = 0; i < 4; i++) {
				System.out.println("Welcome");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		L1 l1 = new L1();
		L2 l2 = new L2();
		l1.start();
		l2.start();

	}

}
