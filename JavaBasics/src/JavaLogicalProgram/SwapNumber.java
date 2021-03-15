package JavaLogicalProgram;

public class SwapNumber {

	public static void main(String[] args) {
		// 6 Java Program to Swap Two Numbers
		int a = 50;
		int b = 200;
		System.out.println("Before Swap a value is "+a);
		System.out.println("Before Swap b value is "+b);
		
		//Using Temp Variable
		
		/*
		 * int temp = a; a = b; b = temp;
		 * System.out.println("After Swap a value is "+a);
		 * System.out.println("After Swap b value is "+b);
		 */
		
		//without Using temp or third variable
		
		a = a-b;
		b = a+b;
		a = b-a;
		System.out.println("After Swap a value is "+a);
		System.out.println("After Swap b value is "+b);
		
			
		
		
	}

}
