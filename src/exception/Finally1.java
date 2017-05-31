package exception;

public class Finally1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Finally Block when no exception is there
		try {
			int a = 20 / 5;
			System.out.println(a);
		} 
		catch (Exception e) {
			System.out.println(e);
		} 
		finally {
			System.out.println("Inside Finally");
			}

		System.out.println("Out of Finally");

	}

}
