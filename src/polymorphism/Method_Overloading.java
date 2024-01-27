package polymorphism;

//Java Program for Method overloading
//By using Different Types of Arguments

//Class 1
//Helper class
class Helper {

	// Method with 2 integer parameters
	static int Multiply(int a, int b)
	{
		// Returns product of integer numbers
		return a * b;
	}

	// Method 2
	// With same name but with 2 double parameters
	static double Multiply(double a, double b)
	{
		// Returns product of double numbers
		return a * b;
	}
}

//Class 2
//Main class

public class Method_Overloading {
	// Main driver method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Calling method by passing
			// input as in arguments
			System.out.println(Helper.Multiply(2, 4));  //8
			System.out.println(Helper.Multiply(5.5, 6.3));  //34.65
	}
}