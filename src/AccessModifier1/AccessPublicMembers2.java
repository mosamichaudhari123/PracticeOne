package AccessModifier1;

import AccessModifier.PublicMembers;

public class AccessPublicMembers2 {

	public static void main(String[] args) {
	
		PublicMembers obj = new PublicMembers();
		obj.AccNum();
		System.out.println("Public int Num:" + obj.Num);
		System.out.println("Public accessible from everywhere:");
	}

}
