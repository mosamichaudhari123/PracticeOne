package Assignmentlooping;

public class ASCIIvalue {

	public static void main(String[] args) {
		// Find ASCII value of a character
		System.out.println("*********ASCII value of a character***************");
		for(char c1 = 'a';c1 <= 'z'; c1++) {
			int asciivalue = c1;
			//System.out.println(asciivalue+",");
			//or
			System.out.println(c1+":"+asciivalue);
		}

	}

}
