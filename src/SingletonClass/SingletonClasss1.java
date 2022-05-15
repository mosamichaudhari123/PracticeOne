package SingletonClass;
class Singleton{
	 private Singleton() {
		 
	 }
	 private static Singleton singleton_instance = new Singleton();
		
	 public String str;
	 static Singleton getInstanceOfSingleton() {
		 
		 return singleton_instance;
	 }
} 

public class SingletonClasss1 {

	public static void main(String[] args) {
		
	Singleton x = Singleton.getInstanceOfSingleton();
	System.out.println("String from x is:"+x.str);
	
	Singleton y = Singleton.getInstanceOfSingleton();
	System.out.println("String from y is:"+y.str);
	
	Singleton z = Singleton.getInstanceOfSingleton();
	System.out.println("String from z is:"+z.str);
	
	System.out.println("After converting to UpperCase:");
	x.str = (x.str).toUpperCase();
	System.out.println("String x is:"+x.str);
	System.out.println("String y is:"+y.str);
	System.out.println("String z is:"+z.str);
//	System.out.println("String x length is:"+x.toString());
//	System.out.println("String y hashcode is:"+y.hashCode());
//	System.out.println("String z equals() is:"+z.equals(z));
	System.out.println("\n");
	
	System.out.println("After converting LowerCase:");
	z.str = (z.str).toLowerCase();
	System.out.println("String x is:"+x.str);
	System.out.println("String y is:"+y.str);
	System.out.println("String z is:"+z.str);
	
	
	}

}
