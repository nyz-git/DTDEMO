package inheritance;

import java.util.Scanner;

class Calculator {
	void add(int a, int b) {
		System.out.println("The Addition is : " + (a + b));
	}

	void sub(int a, int b) {
		System.out.println("The Subtraction is : " + (a - b));
	}
}

public class Practise extends Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Practise p = new Practise();
		String ans = "no";
		do {
			System.out.println("Enter Two Number");
			int i = sc.nextInt();
			int j = sc.nextInt();

			System.out.println("Enter Choice");
			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for subtraction");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				p.add(i, j);
				System.out.println("Do you wish to continue ");
				ans = sc.next();
				break;

			case 2:
				p.sub(i, j);
				System.out.println("Do you wish to continue ");
				ans = sc.next();
				break;

			default:
				System.out.println("Wrong Choice");
				System.out.println("Do you wish to continue ");
				ans = sc.next();
			}
		} while (ans.equals("yes"));

	}

}
