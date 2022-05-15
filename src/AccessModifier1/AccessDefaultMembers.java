package AccessModifier1;

import AccessModifier.DefaultMembers;



public class AccessDefaultMembers {
	public void AccNum() {
		System.out.println("hii");
	}
	public static void main(String[] args) {
	
		AccessDefaultMembers obj = new AccessDefaultMembers();
		obj.AccNum();
		
		System.out.println("Accessing the default members from another class within same package");
	}

}
/* It can accessible within package.
 * It cannot accessible outside the package.
 */