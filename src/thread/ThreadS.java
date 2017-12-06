package com.nyz.thread;

class Count {
	synchronized void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);

		}

	}
}

class TA extends Thread {
	Count c;

	TA(Count c) {
		this.c = c;
	}

	public void run() {
		c.printTable(2);
	}
}

class BA extends Thread {
	Count c;

	BA(Count c) {
		this.c = c;
	}

	public void run() {
		c.printTable(7);
	}
}

public class ThreadS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count c = new Count();
		TA ta = new TA(c);
		BA ba = new BA(c);

		ta.start();
		ba.start();

	}

}
