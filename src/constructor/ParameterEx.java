package constructor;

public class ParameterEx {

	//Single Parameter
	ParameterEx(int a){
		System.out.println(a);
	}
	
	//Three Parameters
	ParameterEx(int i, int j , int k){
		System.out.println(i+j+k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterEx p = new ParameterEx(6);//Constructor with one parameter will be called
		
		new ParameterEx(4,5,6);//Constructor with three parameter will be called
	}

}
