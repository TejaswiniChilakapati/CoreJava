package day1;

import java.util.Scanner;

public class PrimeNumbers {
 
	public static void main(String [] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the nuber:");
		int num=sc.nextInt();
		if(num%2==1) {
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("it is not a prime");
		}
		
	}
}
