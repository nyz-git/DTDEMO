package methods;

public class CalculatorEx {

	static void add(int i, int j) {
		System.out.println("Adding");
		System.out.println("The addition is " + (i + j));
	}

	int sub(int i, int j) {
		int s = i - j;
		System.out.println("Subtracted");
		display();
		return s;
	}

	float div(float i, float j) {
		float div = i / j;
		return div;
	}

	void display() {
		System.out.println("In display");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorEx c = new CalculatorEx();// creating object of the class
		int a = 5;
		int b = 6;
		float h = 5f;
		float g = 6f;

		add(a, b);// calling the add method by using the static keyword

		int res = c.sub(a, b);// calling the subtract method
		System.out.println(res);

		System.out.println(c.div(g, h));// calling the divide method inside the
										// sysout

	}

}
