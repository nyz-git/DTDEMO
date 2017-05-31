package basic;
import java.util.Scanner;
public class OddEvenScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number to find ODD or Even ");
		int no = sc.nextInt();
		
		if(no%2==0){
			System.out.println("The Number  "+no+ "is Even");
		}
		else{
			System.out.println("The Number "+no+ " is Odd");
		}
		
	}

}
