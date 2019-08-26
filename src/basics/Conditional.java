package basics;

import java.util.Scanner;

/**
 Conditional Operators - <,>,==,!=,>=,<=
 Logical Operators - &&, 
 	if (condition)
 	{
 	code here will execute if  the condition is true
 	}
 	else
 	{
 	code here will execute if false
 	}
 	
 */
import  java.util.Scanner;
public class Conditional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		float val1 = scan.nextFloat();


		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the second number:");
		float val2 = scan1.nextFloat();
		
		if(val1 > val2)
		{
			System.out.println("The first number is bigger");
		}
		else if(val2>val1)
		{
			System.out.println("The second number is bigger");
		}
		else
		{
			System.out.println("The numbers are  equal");
		}
		scan.close();
		scan1.close();
	}

}
