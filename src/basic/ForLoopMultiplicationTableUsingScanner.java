package basic;
import java.util.Scanner;

public class ForLoopMultiplicationTableUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number to print its Multiplications Table ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=10; i++)
		{
			int r=n*i;
			System.out.println(n+" x "+i+" = "+r);
		}
		
		
	}

}
