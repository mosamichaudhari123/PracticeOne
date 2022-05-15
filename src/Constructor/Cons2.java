package Constructor;

public class Cons2 {
	Cons2(){
		System.out.println("Zero Constructor:");
	}
	Cons2(double a,int b){
		System.out.println("Parameterized double,int Constructor :");
	}
	Cons2(int e,int r ){
		System.out.println("Parameterized int,int Constructor:");
	}
	Cons2(double s ,float i){
		System.out.println("Parameterized double float Constructor:");
	}
	Cons2(int j,float f ,double d ,char c){
		System.out.println("Parameterized int float,double,char Constructor:");
	}

	public static void main(String[] args) {
		Cons2 cs1 = new Cons2(10,12.5f,14.5d,'m');
		Cons2 cs2 = new Cons2(23.1,342);
		Cons2 cs3 = new Cons2(133,335);
		Cons2 cs4 = new Cons2(21.4d,22.4f);
		Cons2 cs5 = new Cons2();
	}

}
/*
Constructor Overloading :- When a Constructor declared more than once in class with 
*                          set different parameter is known as constructor Overloading
*1.Different parameter passed
*2.Number of parameter different
*3.Position of Parameter different
*
*/