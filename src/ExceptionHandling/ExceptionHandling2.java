package ExceptionHandling;
import java.util.Scanner;
public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		System.out.println("Program Start Here....");
		
		//Abnormal Statements
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Enter 1st num1 :");
			i = sc.nextInt();
			System.out.println("Enter 2nd num2 :");
			j = sc.nextInt();
			k = i/j;//ArithmeticException
			System.out.println("Result :"+k);
	
		}catch(ArithmeticException obj) {
			System.out.println("Exception Handled: "+obj);//java.lang.ArithmeticException: / by zero
			obj.printStackTrace();//complete exception details
		}
		System.out.println("Program Ends Here....");
	}
}
