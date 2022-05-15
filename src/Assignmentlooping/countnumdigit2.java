package Assignmentlooping;

public class countnumdigit2 {

	public static void main(String[] args) {
		//Count Number of Digits in an Integer using while loop
		   int count = 0, num = 0003452;

		    while (num != 0) {
		      // num = num/10
		      num /= 10;
		      ++count;
		    }

		    System.out.println("Number of digits: " + count);
		  }

}


