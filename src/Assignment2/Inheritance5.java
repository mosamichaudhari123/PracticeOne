package Assignment2;

class Company {
	static int a = 25;
	double w = 30.0;

	public void Hellow() {
		int v = 45;
		float a = 25.6f;
		System.out.println("call of method hellowint " + v);
		System.out.println("call of hellowfloat" + a);
	}

	public static double Call(double s, int q) {
		double res = s * q;
		return res;
	}

	public int Call(int p, int i) {
		int result = p + i;
		return result;
	}
}

class Employee extends Company {
	static int a = 20;
	double w = 35.0;
}

public class Inheritance5 {
	int age;
	double b;

	Inheritance5(int age, double b) {
		System.out.println("Call to local variable :" + age);
		System.out.println("call to local variable :" + b);
		this.age = age;
		this.b = b;
		System.out.println("call to global variable " + age);
		System.out.println("call to global variable " + b);
	}

	Inheritance5(float c, int d) {
		System.out.println("call of cons overloading" + c);
		System.out.println("call of cons overloading " + d);
	}

	void methodOne() {
		System.out.println("Inside Method ONE");
	}

	void methodTwo() {
		System.out.println("Inside Method TWO");
		this.methodOne();// same as calling methodOne()
		// methodOne();
	}

	public static void main(String[] args) {

		// call the static variable
		System.out.println("call to static int " + Company.a);
		// create the object for non static variable and methods
		Employee a1 = new Employee();
		System.out.println("call non static variable " + a1.w);
		a1.Hellow();// call of void hellow method
		System.out.println("call to method Call static  " + Company.Call(25.2d, 30));
		System.out.println("call to method of non static " + a1.Call(10, 2));
		Inheritance5 s1 = new Inheritance5(10, 12.2);
		Inheritance5 s2 = new Inheritance5(12.5f, 2);
		s1.methodOne();
		s1.methodTwo();
		System.out.println("call to update the value :" + a1.a);
		System.out.println("call to updated the value :" + a1.w);

	}
}
