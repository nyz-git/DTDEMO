package basic;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number to find its Factorial");
		int num = sc.nextInt();
		int fact = 1;

		if (num > 0) {

			for (int i = num; i >= 1; i--) {
				fact = fact * i;
			}

			System.out.println("The Factorial of " + num + " is " + fact);
		}
		
		else{
		System.out.println("No factorial for such number");
		}
	}
}
