//WAP to reverse the array

package day2;

import java.util.Scanner;

public class ReverseAnArray {
	
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=sc.nextInt();
		int []a=new int[n];
		System .out.println("Enter the elements of an array:");
		for(int i=0;i<a.length;i++) 
		{
		   a[i]=sc.nextInt();
		}
		System.out.println("reverse array:");
		for(int i=a.length-1;i>=0;i--) {
			
			System.out.println(a[i]);
			
		}	
	}

}
