package Encapsulation;
class Student1{
	//private data member
	private int pinCode = 425304;
	//getter method 
	public int getPinCode() {
		return pinCode;
	}
}
public class ReadOnly {

	public static void main(String[] args) {
		
		//creating instance of the encapsulated class
		Student1 s = new Student1();
		//getting value of the name member
		System.out.println("Value of the getter method:"+s.getPinCode());

	}

}
