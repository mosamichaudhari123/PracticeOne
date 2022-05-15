package Assignmentlooping;

public class vowelconsonant2 {

	public static void main(String[] args) {
		// Check whether an alphabet is vowel or consonant using switch statement

        char ch = 'z';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }

	}

}
