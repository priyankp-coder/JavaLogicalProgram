package JavaLogicalProgram;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// 7 Java Program to Check Whether a Number is Even or Odd
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please Enter any number");
		
		int num = reader.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
		
		
		
		

	}

}
