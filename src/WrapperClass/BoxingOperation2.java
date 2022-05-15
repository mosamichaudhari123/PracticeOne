package WrapperClass;

public class BoxingOperation2 {

	public static void main(String[] args) {
		//Boxing Operation 
		char c1 = 'M';
		
		Character charobj1 = new Character(c1);
		System.out.println(c1==charobj1);
		
		Character charobj2 = new Character('Z');
		
		Character charobj3 = 'O';
		
		System.out.println(c1);
		System.out.println("charobj1 :"+charobj1);
		System.out.println("charobj2 :"+charobj2);
		System.out.println("charobj3 :"+charobj3);
		
		boolean b = true;
		Boolean bObj = new Boolean(b);
		System.out.println(bObj==b);
	}

}
