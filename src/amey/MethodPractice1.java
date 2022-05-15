package amey;

public class MethodPractice1 {
	static int EmpPin = 425304; // static global variable
	float EmpScore = 45.34f;// Non static global variable

	public static void main(String[] args) {

		System.out.println("Access Get Employee pincode:" + EmpPin);
		MethodPractice1 m2 = new MethodPractice1();
		System.out.println("Access Get Employee Score:" + m2.EmpScore);

		getAdditionResult(23.34, 456.45);
		MethodPractice1.getAdditionResult(647.276, 477.346);// updated value of getAdditionResult

		display();// display()method

		printDetails(24, 54.568f);// printDetails method value

		// Accessing Simple Interest Method value 
		System.out.println("Access Simple Interest Method:" + MethodPractice1.SimpleInterest(1000, 5.5d, 2));

		// Accessing Simple Interest Method value One
		System.out.println("Access Simple Interest Method One:" + MethodPractice1.SimpleInterest1(2000, 6.5f, 1));

		// Accessing Simple Interest Method value Two
		MethodPractice1.SimpleInterest2(3000, 3.5d, 4);

		// Updated,Accessing Simple Interest Method value
		double res = MethodPractice1.SimpleInterest(4000, 7.5d, 2);
		System.out.println("Updated,Aceessing Simple Interest Method:" + res);
		
		//Addition of two numbers using Non-Static method
		MethodPractice1 m3 = new MethodPractice1();
		m3.AdditionTwoNum(50,50);
		
	}

	static void getAdditionResult(double num1, double num2) {
		double res = num1 + num2;
		System.out.println("Get Addition Result:" + res);
	}

	static void display() {
		System.out.println("Hello....Accessing Display Method");
	}

	public static void printDetails(int id, float marks) {
		System.out.println("Student ID Number:" + id);
		System.out.println("Student Marks:" + marks);

	}

	public static double SimpleInterest(int p, double r, int t) {
		return (p * r * t) / 100;
	}

	public static float SimpleInterest1(int p1, float r1, int t1) {
		float res = (p1 * r1 * t1) / 100;
		return res;
	}

	public static void SimpleInterest2(int p2, double r2, int t2) {
		double res = (p2 * r2 * t2) / 100;
		System.out.println("Accessing Simple Intereset Method two:" + res);

	}
	public void AdditionTwoNum(int x1,int y1) {
		int total = x1 + y1;
		System.out.println("Accessing Addition of two numbers using non-static method::"+total);
	}
}