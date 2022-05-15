package ExceptionHandling;
class UserDefinedException extends Exception{
	public UserDefinedException(String str) {
		//calling parent exception
		super(str);
	}
}

//class that uses above exception
public class ExceptionHandling12 {
	public static void ValidateAge(int age) throws UserDefinedException {
	if(age<18) {
		System.out.println("throw Arithmetic exception if not eligible to vote");
		throw new UserDefinedException("Person is not eligible to vote");
	}else {
		System.out.println("Person is eligible to vote!!!");
	}
}

	public static void main(String[] args) throws UserDefinedException {
		ValidateAge(15);
		System.out.println("Rest of the code...");

	}

}
//program using throws userdefinedException declared in method and main method also