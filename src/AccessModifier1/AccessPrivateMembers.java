package AccessModifier1;

import AccessModifier.PrivateMembers;

public class AccessPrivateMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateMembers obj = new PrivateMembers();
		obj.AccNum();
		System.out.println("private int Num:" + obj.Num);
	}

}
/*
It cannot be accessible from another class or package also.
*/