package AccessModifier;

public class PublicMembers {
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
class AccessPublicMembers{ 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicMembers obj = new PublicMembers();
		obj.AccNum();
		System.out.println("Public int Num:" + obj.Num);
	}

}
/* Public Members are accessible from everywhere.
 * It can be accessed from inside the class outside the class.
 * It can accessible from inside the package and outside the package.
 */
