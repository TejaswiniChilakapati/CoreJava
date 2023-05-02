/* 12. Write a program that takes an integer as input and prints the sum of all the numbers from 1
to that integer. (Use a do-while loop)*/
package day1;

import java.util.Scanner;

public class doWhileLoop {

	public static void main(String[] args) {
		
		
		 Scanner scanner = new Scanner(System.in);

	     System.out.print("Enter an integer: ");
	      int n = scanner.nextInt();

	        int sum = 0;
	        int i = 1;

	     do{
	            sum += i;
	            i++;
	     } 
	     while (i <= n);

	        System.out.println("The sum of all the numbers from 1 to " + n + " is " + sum);
	    }	
 }


