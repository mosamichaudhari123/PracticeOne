package ExceptionHandling;

public class ExceptionHandling6 {

	public static void main(String[] args) {
	try {
		// below code do not throw any exception
		int data = 25/0;
		System.out.println(data);
	}
	//catch wont be executed
	catch(ArrayIndexOutBoundsException e) {
		System.out.println("Exception Handled....");
	}
	//executed regardless of exception occured or not
	finally {
		System.out.println("Finally block is always executed");
	}
	System.out.println("Rest of the code....");
	}
}
