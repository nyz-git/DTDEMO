package basic;
import java.util.Scanner;

public class CalculatorSwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int r; //for storing the result 
		
		System.out.println("Enter first Number :");
		int a =sc.nextInt();
		
		System.out.println("Enter Second Number :");
		int b =sc.nextInt();
		
		System.out.println("Enter Choice");
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		
		int input = sc.nextInt();
		
		switch(input){
		case 1 :
			r=a+b;
			System.out.println("The Addition of "+a+" and "+b+" is : "+r);
			break;
			
		case 2 :
			r=a-b;
			System.out.println("The Subtraction of "+a+" and "+b+" is : "+r);
			break;
			
		case 3 :
			 r=a*b;
			System.out.println("The Multiplication of "+a+" and "+b+" is : "+r);
			break;
		
		case 4 :
			r=a/b;
			System.out.println("The Division of "+a+" and "+b+" is : "+r);
			break;
			
			default :
				System.out.println("No Case matching");
			
		}
	}

}
