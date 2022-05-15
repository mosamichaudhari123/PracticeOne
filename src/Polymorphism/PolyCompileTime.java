package Polymorphism;

public class PolyCompileTime {
	static void sum(int a,int b) {
		int c = a + b;
		System.out.println("Additions of two numbers :"+c);
	}

	static void sum(int a,int b,int c) {
		int d = a + b + c;
		System.out.println("Addition of two numbers :"+c);
	}
	public static void main(String[] args) {
		PolyCompileTime.sum(56,68,52);

	}

}
