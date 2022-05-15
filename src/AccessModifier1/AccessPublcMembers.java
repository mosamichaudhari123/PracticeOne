package AccessModifier1;

import AccessModifier.PublicMembers;

public class AccessPublcMembers {
	public int Num = 56789;

	public void AccNum() {
		System.out.println("Display Account Number :" + Num);
	}

	public static void main(String[] args) {

		PublicMembers obj = new PublicMembers();
		obj.AccNum();
		System.out.println("Public int Num:" + obj.Num);
	}
}

class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicMembers obj = new PublicMembers();
		obj.AccNum();
		System.out.println("Public int Num:" + obj.Num);
		System.out.println("Public accessible from everywhere:");
	}

}
