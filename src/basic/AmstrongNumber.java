package basic;
import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number to check whether it is Amstrong");
		
		int num =sc.nextInt();
		int n=num;
		int ans = 0;
		int remainder,c=0;
		
		while(num>0)
		{
			remainder = num % 10;
			c= remainder*remainder*remainder; //Calculating the cubes of each Number
			ans = ans + c; // Adding each cubed number
			num = num / 10;
			
		}
		
		if(ans==n)
		{
			System.out.println("Yes Amstrong Number");
		}
		
		else
		{
		System.out.println("Not an Amstrong Number");	
		}
	}

}
