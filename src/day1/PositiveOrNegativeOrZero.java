/* 5.Write a program that takes an integer as input and prints whether it is positive, negative, or
zero.*/

package day1;

import java.util.Scanner;

public class PositiveOrNegativeOrZero {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any Integer:-");
		int num=sc.nextInt();
		
		if(0<num) 
		{
			System.out.println(num+"is positive.");
		}
		else if(0>num)
		{
			
			System.out.println(num+"is negative.");
		}
		else {
			System.out.println( num+"is Zero.");
		}
		
		
	}

}
