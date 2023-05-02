
// 6.Write a program that takes three integers as input and prints the largest one.

package day1;

import java.util.Scanner;

public class PrintsTheLargestOne {

public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  
	  
	  System.out.println("Enter the First Integer:-");
	  int num1=sc.nextInt();
	  
	  System.out.println("Enter the Second Integer:-");
	  int num2=sc.nextInt();
	   
	  System.out.println("Enter the Third Integer:-");
	  int num3=sc.nextInt();
	  
	  
	  int largest=num1;
	  
	  if(num2>largest)
	  {
		  
		   largest=num2;
		   System.out.println("The Largest number is" +largest);
	  }
	  else if(num3>largest) 
	  {
		  largest=num3;
		  System.out.println("The Largest number is" +largest);
	  }
	  else 
	  {
		  System.out.println("The Largest number is" +largest);
	  }
}

}