package JavaLogicalProgram;

public class FactorialNumber {

	public static void main(String[] args) {
		// 14 Java Program to Find Factorial of a Number
		//5! = 5*4*3*2*1 = 120
		//4! = 4*3*2*1 = 24
		//0! = 1

		int num =0;
		GetFactorial(num);
	}

	public static void GetFactorial(int num)
	{
		int fact = 1;

		for(int i = 1;i<=num;i++)
		{
			fact =fact*i;
		}
		System.out.println("factorial of "+num+" is ="+fact );
	}
}

