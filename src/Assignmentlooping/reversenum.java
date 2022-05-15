package Assignmentlooping;

public class reversenum {

	public static void main(String[] args) {
		//Reverse a number using a for loop in Java
		int num = 1234567, reversed = 0;

	    for(;num != 0; num /= 10) {
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	    }

	    System.out.println("Reversed Number: " + reversed);
	  }
}

