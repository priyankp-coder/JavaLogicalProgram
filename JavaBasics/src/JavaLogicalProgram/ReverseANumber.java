package JavaLogicalProgram;

public class ReverseANumber {

	public static void main(String[] args) {
		// 19 Java Program to Reverse a Number
		
		int num = 98561; //4321
		int rev = 0;
		
		while(num!=0)
		{
			int n = num%10;
			rev= rev*10+n;
			num = num/10;
		}
		System.out.println("reversed Number is ="+rev);

	}

}
