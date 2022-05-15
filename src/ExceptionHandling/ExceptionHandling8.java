package ExceptionHandling;

public class ExceptionHandling8 {

	public static void main(String[] args) {
	try {
		System.out.println("Inside the try block");
		//below the code throws divide by zero exception 
		int data = 27/0;
		System.out.println(data);
	}
	//handles the Arithmetic Exception /Divide by zero exception
	catch(ArithmeticException e) {
		System.out.println("Arithmetic Exception Handled");
		System.out.println(e);
		//java.lang.ArithmeticException: / by zero
	}
	//executes regardless of exception occured or not
	finally {
		System.out.println("Finally block is always executed");
	}
	System.out.println("rest of the code.....");
	}

}
