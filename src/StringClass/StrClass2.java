package StringClass;

import java.util.Scanner;

public class StrClass2 {

	public static void main(String[] args) {
		String str1 = "Bhalod";
		char c = str1.charAt(0);
		System.out.println("Char at index :" + c);

		// to print one by one character of string
		for (int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
		System.out.println("*************************");
		// to print one by one character of string from the last index
		for (int i = str1.length() - 1; i >= 0; i--) {
			System.out.println(str1.charAt(i));
		}

		System.out.println("********************************");
		String temp = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			temp = temp + str1.charAt(i);
		}
		System.out.println("Enter temp:" + temp);
		System.out.println("Enter str1:" + str1);
		System.out.println(reverseString("Bhalod"));

		String s1 = "Bangalore";
		System.out.println(reverseString(s1));

		Scanner sc = new Scanner(System.in);
		String s2;
		System.out.println("Enter string to be reverse:");
		s2 = sc.next();
		System.out.println("Reverse String is:" + reverseString(s2));

		//System.out.println(pallindromeString("HJKl"));
		String s3;
		System.out.println("Enter string to check for pallindrome:");
		s3 = sc.next();
		palindromeString(s3);

	}

	static String reverseString(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		return temp;
	}

	static void palindromeString(String str) {
		String s1 = str;
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		if (temp.equals(s1)) {
			System.out.println("Given string is a palindrome..." + str);
		} else {
			System.out.println("Given string is not a palindrome..." + str);
		}
	}

}
