package WrapperClass;

public class WrapperClass1 {

	public static void main(String[] args) {
	
		int a = 27;
		//Converting int into Integer
		Integer i1 = new Integer(a);//Converting int into Integer Explicitly
		Integer i2 = new Integer(12);//Converting int into Integer Explicitly
		Integer j = a;//autoboxing ,now compiler will write Integer.valueOf(a) internally  
		System.out.println("a :"+a+"\ni1:"+i1+"\ni2:"+i2+"\nj:"+j);
		System.out.println("*****Unboxing of boxed object********");
		
		//Converting Integer to int
		Integer a1 = new Integer(3);
		int i3 = a1.intValue();//
		System.out.println("a1: "+a1+"\ni3:"+i3);
		System.out.println("a1==i3 : "+(a1==i1));
		System.out.println("a1.equals(i3) : "+a1.equals(i3));
	}

}
