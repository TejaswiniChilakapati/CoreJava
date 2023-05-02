/*3. Write a program that takes two integers as input and prints whether the first integer is
greater than, less than, or equal to the second integer.*/


package day1;

import java.util.Scanner;

public class ComparingIntegers {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	   System.out.print("Enter the first integer: ");
	   int num1 = scanner.nextInt();

	   System.out.print("Enter the second integer: ");
	   int num2 = scanner.nextInt();

	   if (num1 > num2)
	   {
	    System.out.println(num1 + " is greater than " + num2);
	        
	   } else if (num1 < num2)
	   {
	     System.out.println(num1 + " is less than " + num2);
	   }else
       {
	      System.out.println(num1 + " is equal to " + num2);
	   }
	}

}
