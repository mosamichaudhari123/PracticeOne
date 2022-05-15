package ExceptionHandling;

 public class ExceptionHandling10 {
	 
	public static void validate(int age) {
	if(age < 18) {
		throw new ArithmeticException("Person is not eligible to vote");
	}else {
		System.out.println("Person is eligible to vote!!");
	}
}
	public static void main(String[] args) {
	
		System.out.println("Program starts here...");
		//calling the function
		validate(15);
		//Exception in thread "main" java.lang.ArithmeticException: Person is not eligible to vote
		//at ExceptionHandling.ExceptionHandling10.validate(ExceptionHandling10.java:6)
		//at ExceptionHandling.ExceptionHandling10.main(ExceptionHandling10.java:15)
		System.out.println("rest of the code");
	}
}

 //Program using throw keyword 