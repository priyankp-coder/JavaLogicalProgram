package JavaLogicalProgPart2;

public class CalculateThePowerOfAumber {

	public static void main(String[] args) {
		// 20 Java Program to Calculate the Power of a Number
		
		int base = 8;
		int exponent = 4;
		
		long result = 1;
		
		while(exponent !=0)
		{
			result *=base;
			--exponent;
		}
		System.out.println(result);

	}

}
