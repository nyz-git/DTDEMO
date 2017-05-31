package exception;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			int i[] = new int[5];
			i[12] = 7;
			int a = 6 / 0;
		}

		catch (ArithmeticException e) {
			System.out.println(e);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
