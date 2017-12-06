package com.nyz.thread;

class TT1 implements Runnable {
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class TT2 implements Runnable{
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Thr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TT1 ot1=new TT1();
		TT2 ot2=new TT2();
		
		Thread t1=new Thread(ot1);
		Thread t2=new Thread(ot2);
		
		t1.start();
		t2.start();
	}

}
