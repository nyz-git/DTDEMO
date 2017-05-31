package polymorphism;

class Calc {

	void add() {
		System.out.println("The addition is " + (7 + 9));
	}

	void add(int a) {
		System.out.println("The addition is " + (2 + a));
	}

}

public class OverloadEx extends Calc {
	
	void add(int a, int b) {
		System.out.println("The addition is " + (a + b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadEx o = new OverloadEx();
		
		o.add();
		o.add(6);
		o.add(4, 5);
	}

}
