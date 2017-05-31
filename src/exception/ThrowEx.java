package exception;

public class ThrowEx {

	static void add() throws ArithmeticException {
		try {
			throw new ArithmeticException();
		} catch (NullPointerException e) {
			System.out.println("In Add Method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			add();
		} catch (ArithmeticException e) {
			System.out.println("In Main");
		}
	}

}
