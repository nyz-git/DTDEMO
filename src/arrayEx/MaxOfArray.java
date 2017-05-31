package arrayEx;

import java.util.Scanner;

public class MaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Enter Values into the Array");// Entering Values into Array
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int max = a[0];//Initializing max with the first index value of array
		
		for (int i = 0; i < a.length; i++) { // Finding the Max
			
			if (max < a[i]) {
				max = a[i];
			}
		}
		
		System.out.println("The Maximum is : " +max);
	}

}
