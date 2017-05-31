package constructor;

public class DefaultEx {

	DefaultEx(){
	System.out.println("In Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultEx d = new DefaultEx();
		new DefaultEx();
		System.out.println("Constructor Done");
	}

}
