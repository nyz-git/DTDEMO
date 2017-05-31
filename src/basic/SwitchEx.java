package basic;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		System.out.println("Going into Switch");
		
		switch(n){
		
		case 2:
			System.out.println(" Not matched");
			break;
			
		case 4:
			System.out.println("matched");
			break;
			
			default :
				System.out.println("In default");
		}
		
		System.out.println("Out of Switch");
	}

}
