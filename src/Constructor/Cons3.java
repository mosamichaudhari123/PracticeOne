 
package Constructor;

public class Cons3 {
//	static int SrNo = 23;
//	double payment = 23.1d;
	
	Cons3() {
		System.out.println("Zero parameterized:");
	}
	Cons3(int a,float f){
		System.out.println("int,float Parameterized Constructor");
	}
	Cons3(double d,int i){
		System.out.println("double,int Parameterized Constructor");
	}
	Cons3(char c,float q, int k){
		System.out.println("char,float,int Parameterized Constructor");
	}

	public static void main(String[] args) {
		Cons3 cs1 = new Cons3(23.5d,34);
		Cons3 cs2 = new Cons3('d',23.7f,76);
		Cons3 cs3 = new Cons3(32,67.7f);
		Cons3 cs4 = new Cons3();
		
		
		
		
		
	}

}
