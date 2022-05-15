package ExceptionHandling;

public class ExceptionHandling4 {

	public static void main(String[] args) {
	try {
		int a[] = new int[5];
		a[5] = 20/0;
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Arithmetic Exception occurs");
	}catch(Exception e) {
		System.out.println("Parent exception occurs");
	}

	try {
		int a[] = new int[5];
		a[5] = 30/2;
	}catch(ArithmeticException e) {
		System.out.println("Arithmetic exception occurs");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException occurs");
	}catch(Exception e) {
		System.out.println("Parent exception occurs");
	}
	System.out.println("rest of the code");
	}

}
