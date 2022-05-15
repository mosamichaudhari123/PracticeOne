package Assignmentlooping;

public class checkleapyear {

	public static void main(String[] args) {
		// Java Program to Check a Leap Year
		int year = 2024;
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }
	}

}
