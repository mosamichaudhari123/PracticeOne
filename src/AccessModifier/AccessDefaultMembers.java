package AccessModifier;

public class AccessDefaultMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMembers obj = new DefaultMembers();
		obj.AccNum();
		System.out.println("Default int Num:" + obj.Num);
		System.out.println("Accessing the default members from another class within same package");
	}

}
/* Default Members are accessible from another class within same package.*/