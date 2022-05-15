package Encapsulation;
class Student2 {
	//private data member
	private int rollno = 23;
	//setter method
	public int setRollNo() {
		return rollno;
	}
}
public class WriteOnly {

	public static void main(String[] args) {
		
		//Creating the instance of the encapsulated class
		Student2 s2 = new Student2();
		//getting value of the name member
		System.out.println("Value of the setter method:"+s2.setRollNo());
	}

}
