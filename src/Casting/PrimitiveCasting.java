package Casting;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 14;
		long y = (long)x;
		System.out.println("value of x:"+x); //
		System.out.println("value of y:"+y); 
		
		int myInt = 10;
		double myDouble = myInt;//widing implicit, when java compiler writes behalf of you--> double myDouble =(double)myInt;
		System.out.println("Value of myInt:"+myInt);
		System.out.println("Value of myDouble:"+myDouble);
		
		double salary = 15.10565666923436;
		int sal =(int)salary;
		long l = (int)sal;
		float f = (long)l;
		System.out.println("Actual Salary: "+salary);
		System.out.println("Int Salary: "+sal);
		System.out.println("Long Salary:"+l);
		System.out.println("Float Salary:"+f);
		
		//Explicit widening
		System.out.println("\n Explicit widening");
		int Salary = 30000;
		//double myDouble1 = Salary;//implicit
		double myDouble1 = (double)Salary;//explicit
		float salDouble = (float)Salary;
		System.out.println("Int Salary:"+Salary);
		System.out.println("Double myDouble1:"+myDouble1);
		System.out.println("Float salDouble:"+salDouble);
		
		//implicit widening
		System.out.println("\n Implicit widening");
		double myDouble2 = Salary;
		float salDouble2 = Salary;
		System.out.println("Double myDouble2:"+myDouble2);
		System.out.println("Float salDouble2:"+myDouble2);
		
		//Narrowing Type Casting(only Explicit)
		System.out.println("\nNarrowing Type Casting(only Explicit)");
		double d1 = 166.66666;
		long L1 = (long)d1;
		int I1 = (int)L1;
		System.out.println("double d1:"+d1);
		System.out.println("long L1:"+L1);
		System.out.println("int I1:"+I1);
		
		//Examples
		byte B =15;
		short S = B;
		int I = B;
		long L = B;
		float F = B;
		double D = B;
		System.out.println("\nB:"+B);
		System.out.println("\nS:"+S);
		System.out.println("\nI:"+I);
		System.out.println("\nL:"+L);
		System.out.println("\nF:"+F);
		System.out.println("\nD:"+D);
		
		
	}

}
