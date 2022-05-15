package Assignmentlooping;

public class primenum2 {

	public static void main(String[] args) {
		// Program to Check Prime Number using a for loop

	    int num = 33, i = 2;
	    boolean flag = false;
	    while (i <= num / 2) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }

	      ++i;
	    }
	    if (!flag)
	        System.out.println(num + " is a prime number.");
	      else
	        System.out.println(num + " is not a prime number.");
	}
 
}


