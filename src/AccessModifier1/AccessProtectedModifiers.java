package AccessModifier1;

import AccessModifier.ProtectedMembers; 

public class AccessProtectedModifiers extends ProtectedMembers{

	public static void main(String[] args) {
	
		AccessProtectedModifiers obj = new AccessProtectedModifiers();
		obj.AccNum();
		System.out.println("Accessing Protected Modifiers int Num:" + obj.Num);
	}

}
