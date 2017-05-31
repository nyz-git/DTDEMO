package inheritance;

class QWE {
	void show() {
		System.out.println("This is parent class method");
	}
}

public class SuperMethod extends QWE {

	void show() {
		System.out.println("This is child class method");
	}

	void disp() {
		super.show();
		show();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperMethod sm = new SuperMethod();
		sm.disp();
	}

}
