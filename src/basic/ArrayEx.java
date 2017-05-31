package basic;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]= {"12","abc","23.4"}; // D INSt Ini
		
		
		
		
		//PRINTING THE ARRAY
		
		/*for(int i = 0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		//Using Enchanced For Loop for Printing
		for(String n:a)
		{
			System.out.println(n);
		}
	}

}
