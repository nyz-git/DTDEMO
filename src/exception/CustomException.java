package exception;

public class CustomException {

	static void add(){
		try
		{
		throw new MyCustomException();

		}
		catch(MyCustomException e){
			System.out.println(e);
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
	}

}
