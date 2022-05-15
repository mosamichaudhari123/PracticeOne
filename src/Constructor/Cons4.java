package Constructor;

public class Cons4 {
	static int Srno = 23;
	double payment = 23.1d;
	
	Cons4(int k){
		Srno = k;
		System.out.println("int parameterized constructor");
	}
	Cons4(){
		System.out.println("Zero parameterized constructor:");
	}
	Cons4(int j ,double s,char d){
		System.out.println("int,double,char parameterized constructor:");
	}
	Cons4(float f, double a, char e,char c){
		System.out.println("float,double,char,char parameterized constructor:");
	}
	
	public static void main(String[] args) {
		Cons4 ca = new Cons4(45);
		System.out.println("int para cons called:"+Cons4.Srno);
		System.out.println("int para Cons called:"+ca.Srno);
		System.out.println("double para cons called:"+ca.payment);
		
		Cons4 ca2 = new Cons4();
		System.out.println("zero para cons called:");
		
		Cons4 ca3 = new Cons4() {
			System.out.println("int j ,double s,char d"+ca3.Srno);
			System.out.println("int j ,double s,char d"+ca3.payment);
		}
		Cons4 ca4 = new Cons4() {
			System.out.println("float,double,char,char para cons called:"+ca4.Srno);
			System.out.println("float f, double a, char e,char c para Cons Callled:"+ca4.payment);
		}
	}

}
