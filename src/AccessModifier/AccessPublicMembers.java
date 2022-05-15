package AccessModifier;

public class AccessPublicMembers {

	public static void main(String[] args) {
		
				PublicMembers obj = new PublicMembers();
				obj.AccNum();
				System.out.println("Public int Num:" + obj.Num);
				System.out.println("Public accessible from everywhere:");
	}

}
