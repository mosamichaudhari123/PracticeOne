package StringClass;

public class PracticeString {

	public static void main(String[] args) {
		String str = new String();
		System.out.println("String representation of object:");
		String str1 ="Mosami";
		String str2 ="chaudhari";
		System.out.println("concate string:"+str1.concat(str2));
		System.out.println("trim string:"+str1.trim());
		System.out.println("hashcode method:"+str1.hashCode());
		System.out.println("UpperCase string:"+str1.toUpperCase());
		System.out.println("Lowercase String:"+str2.toLowerCase());
		System.out.println("Replace String:"+str1.replace('a','S' ));
		System.out.println("toString method:"+str1.toString());
		System.out.println("equals methods:"+str1.equals(str2));
		System.out.println("compare method:"+str1.compareTo(str2));
		System.out.println("split method:"+str2.split(str1));
		System.out.println("equals Ignore Case method:"+str1.equalsIgnoreCase(str2));
		System.out.println("isEmpty method:"+str1.isEmpty());
		System.out.println("length method:"+str1.length());
		System.out.println("charAt method:"+str1.charAt(4));
		
		
		
	}

}
