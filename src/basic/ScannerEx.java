package basic;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

	
		System.out.println("Enter the name : ");
		String name = sc.next();
		
		System.out.println("Enter Age : ");
		int age = sc.nextInt();

		System.out.println("Enter Gender : ");
		String gender = sc.next();
		
		System.out.println("The name is : " + name);
		System.out.println("The age is  : " + age);
		System.out.println("The Gender is  : " + gender);

	}

}
