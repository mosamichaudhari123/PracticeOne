package ExceptionHandling;

//Throwing unchecked Exception 

public class ExceptionHandling9 {
	
	//function to check if person is eligible to vote or not
	
		public static void ValidateAge(int age) {
			if(age<18) {
				
				//throws Arithmetic Exception if not eligible to vote
				throw new ArithmeticException("Person is not eligible to vote");
			
			}
			else {
				System.out.println("Person is eligible to vote!!");
			}
			}
	//main method
	public static void main(String[] args) {
	//calling the function
		try {
			ValidateAge(13);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Handled...");
			System.out.println(e);
		}
		System.out.println("rest of the code....");
	}

}
