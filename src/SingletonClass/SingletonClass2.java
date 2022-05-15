package SingletonClass;
class Demo1{
	Demo1() {
		System.out.println("Private constructor called:");
	}
	private static Demo1 dm = new Demo1();
	String Name = "Mosami";
	public String MiddleName;
	static Demo1 getInstanceOfSingleton() {
		return dm;
	}
	public void print() {
		System.out.println("print method called here:");
	}
}
public class SingletonClass2 {

	public static void main(String[] args) {
	
		Demo1 dm2 = Demo1.getInstanceOfSingleton();
		System.out.println("String dm2 length:"+dm2.toString());
		dm2.print();
		System.out.println(dm2.Name);
		dm2.MiddleName = "Ganjanan";
		System.out.println("String dm2 is:"+dm2.MiddleName);
		System.out.println("String dm2 is:"+dm2.hashCode());
		String dm3 = "Chaudhari";
		System.out.println("String dm3 is:"+dm3);
		System.out.println("String dm3 in UpperCase():"+dm3.toUpperCase());
		System.out.println("String dm3 in LowerCase():"+dm3.toLowerCase());
		
		
	}

}
