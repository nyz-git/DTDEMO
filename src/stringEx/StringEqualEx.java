package stringEx;

public class StringEqualEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abc";
		String s2 = new String("abc");
		String s22 = new String("abc");
		String s3 = "abc";
		String s4 = "Abc";
			
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s2==s22);
	}

}
