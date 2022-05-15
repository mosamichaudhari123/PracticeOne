package AccessModifier;

public class ProtectedMembers {
	
	protected int Num = 56789;
	protected void AccNum() {
		System.out.println("Display Account Number :" + Num);
	}
	public static void main(String[] args) {
		
		ProtectedMembers obj = new ProtectedMembers();
		obj.AccNum();
		System.out.println("private int Num:" + obj.Num);
	}
}
class AccessProtectedMembers{
	
	public static void main(String[] args) {
		
		ProtectedMembers obj2 = new ProtectedMembers();
		obj2.AccNum();
		System.out.println("Protected int Num:" + obj.Num);

	}

}
