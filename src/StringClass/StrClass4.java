package StringClass;

public class StrClass4 {

	public static void main(String[] args) {
		String s1 = "AutomationTesting ";

		// Returns the number of characters in the string
		System.out.println("String Length : " + s1.length());

		// Returns the character at ith index
		System.out.println("Character at 3rd position: " + s1.charAt(2));

		// Return the subString from the index character to the end of string
		System.out.println("SubString from index 3: " + s1.substring(3));

		// Returns from the substring
		System.out.println("SubString from index 2 to 7: " + s1.substring(2, 7));
		System.out.println("SubString from index 10 to 17: " + s1.substring(10, 17));

		// Concatenates String2 to the end of String1
		String s2 = "Automation";
		String s3 = "TestingPrinciples";
		System.out.println("First value of s2: " + s2);
		System.out.println("First value of s3: " + s3);
		System.out.println("Concatenated String: " + s2.concat(s3));
		System.out.println("After Concatenate Value: " + s2);
		System.out.println("After Concatenate Value: " + s3);

		String p1 = "Bhalod";
		String p2 = "Jalgaon";
		String x1 = s2.concat(s3);
		String x2 = p1.concat(p2);
		String x3 = p1 + p2;
		String x4 = x1.concat(x2);

		// Returns the index within the string
		// of the first occurrence of the specified string.
		String s5 = "Learn Core Basics Java";
		System.out.println("S5 Size: " + s5.length());
		System.out.println("Index of 'Core' starts from: " + s5.indexOf("Core"));

		// Returns the index within the string of the
		// first occurrence of the specified string,
		// starting at the specified index.
		System.out.println("Index of a = " + s5.indexOf('a', 3));
		System.out.println("Index of e = " + s5.indexOf('e', 2));
		System.out.println("Last Index of 'Learn = " + s5.lastIndexOf("Learn", 15));
		;// occurrence of 'Learn' before index 15
		System.out.println("Last Index of e = " + s5.lastIndexOf('e', 16));// occurrence of 'e' before index 11

		String s6 = "Selenium";
		String s7 = "selenium";
		String s8 = "Selenium";
		System.out.println("Checking Equality of s6 & s7: " + s6.equals(s7));//
		System.out.println("Checking Equality of s6 & s8: " + s6.equals(s8));//
		System.out.println("Checking Equality of s6 & s7 with Ignore case: " + s6.equalsIgnoreCase(s7));//
		
		  // Converting cases
        String word1 = "CoreJava";
        System.out.println("Changing to lower Case " +word1.toLowerCase());//corejava
        
        // Converting cases
        String word2 = "CoreJava";
        System.out.println("Changing to upper Case " +word2.toUpperCase());//COREJAVA
        
        // Trimming the word
        String word3 = " Learn Core Basics Java ";
        System.out.println("Actual String:" +word3);
        System.out.println("Actual String length: "+word3.length());
        System.out.println("Actual String trim: "+word3.trim());
        System.out.println("Actual string length is: "+word3.trim().length());
        

        // Replacing characters
        String str1 = "CoreJavaBasic";
        System.out.println("Original String: " + str1);//CoreJavaBasic
        String str2 = str1.replace('a' ,'M') ;
        System.out.println("Replaced a with M -> " + str2);//CoreJxvxBxsic
       
        String str3=str1.replace("Java", "Set");
        System.out.println("Replaced 'Java' with 'Set' -> " + str3);//CoreNetBasic
        
        String str4=str1.replaceFirst("a", "M");
        System.out.println("Replaced first 'a' with 'M' -> " + str4);//CoreJWvaBasic
        String str5=" ";
        System.out.println("str5 is empty or not: "+str5.isEmpty());
        
        String str6=new String();
        System.out.println("str6 is empty or not: "+str6.isEmpty());
	}
}
