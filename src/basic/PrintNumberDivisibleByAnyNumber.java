package basic;
import java.util.Scanner;

public class PrintNumberDivisibleByAnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int n=sc.nextInt();
		
		System.out.println("Enter the Starting and Ending Range");
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		for(int i = start; i<=end; i++)
		{
			if( i % n == 0 )
			{
				System.out.println(i);
			}
			
		}
	}

}
