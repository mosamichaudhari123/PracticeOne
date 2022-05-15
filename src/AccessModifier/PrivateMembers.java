package AccessModifier;

public class PrivateMembers {
	private int Num = 56789;

	private void AccNum() {
		System.out.println("Display Account Number :" + Num);
	}

	public static void main(String[] args) {

		PrivateMembers obj = new PrivateMembers();
		obj.AccNum();
		System.out.println("private int Num:" + obj.Num);
	}
}

//class AccessPrivateMembers {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		PrivateMembers obj = new PrivateMembers();
//		obj.AccNum();
//		System.out.println("private int Num:" + obj.Num);
//	}
//}

/* private members only accessible within the class.
It cannot accessible from other class or packages.
here,I will identify private are accessible from other class or not.
so, In AccessModifier Package Ive created another class AceessPrivateMembers 
and checkout the class...but private are not accessible.*/