package amey;

public class MethodOverloadingPractice {

	public void square() {

		System.out.println("No parameter method called:");
	}

	public void square(int num) {

		int square = num * num;
		System.out.println("Method called with integer paramter:" + square);

	}

	public void square(float num) {

		float square = num * num;
		System.out.println("Method called with float parameter:" + square);
	}

	static int add(int a, int b) {
		System.out.println("static add method one");
		return a + b;
	}

	static int add(int a, int b, int c) {
		System.out.println("static add method two");
		return a + b + c;
	}

	static void add() {
		System.out.println("No parameter passed:");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingPractice m1 = new MethodOverloadingPractice();
		m1.square();
		m1.square(23);
		m1.square(46.54f);
		
		System.out.println(MethodOverloadingPractice.add(10, 20));
		System.out.println(MethodOverloadingPractice.add(10, 20, 30));
		MethodOverloadingPractice.add();
	
	}

}
