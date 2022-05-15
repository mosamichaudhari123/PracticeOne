package amey;

public class exam {
	static int age = 27;// static Global variable
	int empId = 12; // Non-static global variable OR instance variable OR class members
	double A;

	public static void printDetails(int age, int salary) {
		System.out.println("I am " + age + "years old");
		System.out.println("Today is" + salary);
	}

	public static void main(String[] args) {

		// printDetails() using for static and instance variable
		printDetails(21, 12452);
		exam.printDetails(22, 24014);

		// we are display() method
		display();
		int age = 30;// Local Variable
		float pivalue = 3.14f;
		System.out.println("Local variable value(directly accessible)\t:-" + age);
		System.out.println("Static Global variable value(standard)\t:-" + exam.age);
		exam s1 = new exam();
		System.out.println("Non-Static Global variable\t" + s1.empId);
		System.out.println("Non-Static Global variable\t" + s1.A);// JVM gets default value of A
		System.out.println("Local variable value(directly accessible)\t" + pivalue);
		exam s2;
		s2 = new exam();
		System.out.println("Non-Static Global variable(direct)\t" + s2.empId);
	}

	// we are declared method outside the main body
	static void display() {
		System.out.println("Helloo Guys...How are you...");
	}
}
