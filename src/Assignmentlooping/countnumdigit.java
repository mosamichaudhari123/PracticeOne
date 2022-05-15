package Assignmentlooping;

public class countnumdigit {

	public static void main(String[] args) {
		//Count Number of Digits in an Integer using for loop
		int count = 0, num = 123456;

	    for (; num != 0; num /= 10, ++count) {
	    }

	    System.out.println("Number of digits: " + count);
	  }
}

