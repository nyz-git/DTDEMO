package exception;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Before Arithmetic");
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("After Arithmetic");

		
		
		int i[] = new int[5];
		System.out.println("Before Array");
		try {
			i[12] = 6;
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("After Array");

	}

}
