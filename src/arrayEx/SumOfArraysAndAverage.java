package arrayEx;

import java.util.Scanner;

public class SumOfArraysAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int size;
		int sum = 0;
		
		System.out.println("Enter the size of Array");
		size = sc.nextInt();
		int a[]= new int[size];
		
		System.out.println("Enter Values into the Array");//Entering Values into Array
		for (int i = 0; i < a.length; i++) {
			a[i]= sc.nextInt();
		}
		
		//For Doing the Sum of Array
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			
		}
		
		//Printing the Sum of Array
		System.out.println("The Sum of Array is : "+sum);
		
		System.out.println("Average : " +(sum/size));
	} 

}
