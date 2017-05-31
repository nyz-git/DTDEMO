package arrayEx;

import java.util.Scanner;

public class InsertIntoSpecificPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Enter Values into the Array");// Entering Values
															// into Array
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Array Before Updation");//Printing Array Before Updation
		for (int i = 0; i < a.length; i++) {
		 System.out.print(" " +a[i]);
		}
		
		System.out.println();
		System.out.println("Enter the Position Number you want to change");
		int position = sc.nextInt();
		int newIndex = position - 1;//Making Index Number as per ARRAY index Number
		
		System.out.println("Enter the value :");
		int newValue = sc.nextInt();
		
		a[newIndex] = newValue; //Updating the Index Number with new Value
		
		System.out.println();
		System.out.println("Array After Updation");//Printing the Updated Array
		for (int i = 0; i < a.length; i++) {
		 System.out.print(" " +a[i]);
		}
		
	}

}
