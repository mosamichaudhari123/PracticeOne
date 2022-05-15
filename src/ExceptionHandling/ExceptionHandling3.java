package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling3 {

	public static void main(String[] args) {
	System.out.println("Program Ends Here...");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array size :");
	int size = sc.nextInt();
	int[] empIds = new int[size];
	try {
		System.out.println(empIds[3]);// ArrayIndexOutOfBoundsException
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Exception handled.." + e);
		//e.printStackTrace();
		//System.out.println(e.getMessage());
	}
	System.out.println("Programs ends here...");
	}

}
