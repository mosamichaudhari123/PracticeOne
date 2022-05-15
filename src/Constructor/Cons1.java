package Constructor;

public class Cons1 {
	int empId = 1233;
	Cons1(int m){
		empId = m;
		//System.out.println("Constructor"+empId);
	}
	void mosami() {
		System.out.println("Contsructor called"+empId);
	}

	public static void main(String[] args) {
				
		Cons1 ds = new Cons1(134);
		ds.mosami();
		
		System.out.println("Non static member called:"+ds.empId);
	}

}
/*
*Constructor:-
*Constructor is used to initialize instance member of class,similar to the method
*1.constructor is same name as class Name.
*2.constructor is have no any return type and no any value.
*3.constructor automatically call when an instance of class created.
*4.being a programmer we can't call/executed constructor based on our requirement
*5.constructor have two types:
*1.default constructor:- The default constructor written by java compiler.
*2.User-Defined constructor:- 1.zero Parameterized Constructor.
*							  2.Parameterized Constructor. 
*/