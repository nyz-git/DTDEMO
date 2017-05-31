package inheritance;

class XYZ {
	XYZ() {
		System.out.println("Inside the XYZ Constructor");
	}
}

public class SuperEx extends XYZ {

	SuperEx() {
		super();// Optional -- reason it been called by the constructor itself if
				// we don't write it and this should be the first line of the
				// constructor
		System.out.println("Inside the SuperEx Constructor");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SuperEx();

	}

}
