package JavaLogicalProgram;

public class AlphabetCheck {

	public static void main(String[] args) {
		// 12 Java Program to Check Whether a Character is Alphabet or Not
		
		char c = '@';
		
		if((c>='a' && c>='z')||(c>='A' && c>='Z'))
		{
			System.out.println(c+" is an Alphabet");
		}
		else
		{
			System.out.println(c+" is not Alphabet");
		}

	}

}
