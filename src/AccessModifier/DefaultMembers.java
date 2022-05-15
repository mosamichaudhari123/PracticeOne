package AccessModifier;

public class DefaultMembers {
	int Num = 56789;

	void AccNum() {
		System.out.println("Display Account Number :" + Num);
	}

	public static void main(String[] args) {

		DefaultMembers obj = new DefaultMembers();
		obj.AccNum();
		System.out.println("Default int Num:" + obj.Num);
	}
}

class AccessDefaultMembers {

	public static void main(String[] args) {

		DefaultMembers obj = new DefaultMembers();
		obj.AccNum();
		System.out.println("Default int Num:" + obj.Num);
	}
}

/* Default modifier accessible within Package and 
 * It cannot be accessible from another Package 
 * If you do not specify any access level,it will be the default. 
 */