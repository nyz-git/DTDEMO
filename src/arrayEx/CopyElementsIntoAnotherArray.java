package arrayEx;

import java.util.Scanner;

public class CopyElementsIntoAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows and Columns");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int a[][] = new int[row][col];
		int b[][] = new int[row][col];

		System.out.println("Enter Values into the Array");
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				int n = sc.nextInt();

				a[i][j] = n;
			}

		}
		
		System.out.println("Going to Copy the Content of First Array into the Second");
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				b[i][j] = a[i][j];//Copying the first array into the Second
			}
			
		}
	System.out.println("Copy Done...Now Printing");
	
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b.length; j++) {
			System.out.print(" "+b[i][j]);
		}
		System.out.println();
	}
	
		

	}

}
