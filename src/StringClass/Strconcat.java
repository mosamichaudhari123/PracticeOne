package StringClass;

public class Strconcat {

	public static void main(String[] args) {
		
		String str = "Bhalod"+12345;
		System.out.println(str);
		String str1 = str.concat(null);//Null Pointer Error
		System.out.println(str1);

	}

}
