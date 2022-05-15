package ExceptionHandling;

public class ExceptionHandling7 {

	public static void main(String[] args) {
	try {
		System.out.println("Inside the try block");
		//below code throws divide by zero exeception
		int data = 50/5;
		//System.exit(0);
		System.out.println(data);
	}
	//cannot handle Arithmetic type exception
	//can only accept null pointer type exception
	//System.out.println("Inside the catch block");
	catch(NullPointerException e) {
		System.out.println(e);
	}
	//executes regardless of exception occured or not
	finally {
		System.out.println("I am inside finally block");
		int k = 10/0;
		//java.lang.ArithmeticException: / by zero
		//at ExceptionHandling.ExceptionHandling7.main(ExceptionHandling7.java:22)
		System.out.println("finally block is always executed");
	}
	System.out.println("rest of the code");
	}

}
