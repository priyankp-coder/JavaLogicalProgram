package JavaLogicalProgram;

public class VowelorConsonant {

	public static void main(String[] args) {
		// 8 Java Program to Check Whether an Alphabet is Vowel or Consonant.
		
		char ch = 'A';
		
		/*
		 * if(ch == 'a'|| ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
		 * System.out.println(ch + " is vowel"); } else System.out.println(ch
		 * +" is consonant"); }
		 */

		switch(ch)
		{
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
		System.out.println(ch +" is vowel");
		break;
			default:
				System.out.println(ch + " is consonant");
				break;
		
		}
	}

}
