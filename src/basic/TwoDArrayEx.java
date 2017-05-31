package basic;
import java.util.Scanner;

public class TwoDArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[][];

		System.out.println("Enter rows and Columns");
		int row = sc.nextInt();
		int c = sc.nextInt();
		a = new int[row][c];// Getting size of array from user

		// Adding Elements inside an Array
		System.out.println("Enter Values into the Array");
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				int n = sc.nextInt();

				a[i][j] = n;
			}

		}

		// PRINTING THE ARRAY
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
