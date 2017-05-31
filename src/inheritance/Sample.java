package inheritance;

public class Sample extends Demo {
	int b = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		System.out.println(s.a);
		System.out.println(s.b);
	}

}

class Demo {
	int a = 5;
}
