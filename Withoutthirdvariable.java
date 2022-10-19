package temp;

public class Withoutthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;//declaration
		//Assigning values
		a=50;
		b=100;	
		System.out.println("BEFORE SWAPPING a="+a+" and b="+b);
		//Calculation
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("AFTER SWAPPING a="+a+" and b="+b);
	}

}
