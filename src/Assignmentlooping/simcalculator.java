package Assignmentlooping;

public class simcalculator {

	public static void main(String[] args) {
		// Simple Calculator using Java switch Statement
		  	int num1 = 25,num2 = 50, result;
		  	char a,s,m,d;
		    char ch = '+';
		  	System.out.println("******************************");
		  	
		      System.out.println("Addition-a: Subtraction-s: Multiplication-m: Division-d: ");
		      
		      switch(ch) {
		         case '+' :
		        	 result = num1 + num2;
		         System.out.println("Sum of the given two numbers:"+result);
		         break;
		         case '-' :
		        	 result = num1 - num2;
		         System.out.println("Subtraction of the given two numbers:"+result);
		         break;
		         case '*' :
		        	 result = num1 * num2;
		         System.out.println("Multiplication of the given two numbers: "+result);
		         case '/' :
		        	 result = num1 / num2;
		         System.out.println("Division of the given two numbers: "+result);
		         break;
		         default :
		         System.out.println("Invalid grade");
		      }
	}
}
