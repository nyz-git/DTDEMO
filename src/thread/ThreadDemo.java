package com.nyz.thread;

class T1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hi");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class T2 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1 t1 = new T1();
		T2 t2 = new T2();
		t1.start();
		t2.start();

	}

}
