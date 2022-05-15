package Assignmentlooping;

public class largest3num2 {

	public static void main(String[] args) {
		// Find the largest number among three using nested if..else statement

        double n1 = -4.5, n2 = 9.9, n3 = 5.5;

        if(n1 >= n2) {
            if(n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        } else {
            if(n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }

	}

}
