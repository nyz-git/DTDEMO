package exception;

public class Finally3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 20 / 0;
			System.out.println(a);
		} 
		catch (ArithmeticException e) {
			System.out.println(e);
		} 
		finally {
			System.out.println("Inside Finally");
			}

		System.out.println("Out of Finally");
	}

}
