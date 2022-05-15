package ExceptionHandling;

class UserDefinedException extends Exception{
	public UserDefinedException(String str) {
		//calling parent exception
		super(str);
	}
}

//class that uses above exception
public class ExceptionHandling11 {
	
	public static void ValidateAge(int age) {
		if(age<18) {
			System.out.println("throw Arithmetic exception if not eligible to vote");
			try {
				throw new UserDefinedException("Person is not eligible to vote");
			}catch(UserDefinedException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Person is eligible to vote!!!");
		}
	}

	public static void main(String[] args) {
	ValidateAge(15);
	System.out.println("Rest of the code...");

	}

}
/*
--->Throwing UserDefinedException
--->class represents user defined exception
*/