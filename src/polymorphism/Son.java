package polymorphism;

class Father {
	void marraige() {
		System.out.println("You will marry to SakuBai");
	}
}

public class Son extends Father {
	void marraige() {
		System.out.println("I will marry to Katrina");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.marraige();
	}

}
