package JavaLogicalProgram;

public class NumberOfDigits {

	public static void main(String[] args) {
		// 18 Java Program to Count Number of Digits in an Integer.
		//1234 = 4
		//123 =3
		
		long num = 123455555;
		int count = 0;
		
		while(num!=0)
		{
			num=num/10;
			++count;
		}
		System.out.println("Number of digits :"+count);
	}

}
