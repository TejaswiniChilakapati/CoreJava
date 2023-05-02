/*9. Write a program that takes an integer as input and prints the factorial of that integer. (Use a
for loop)*/

package day1;

import java.util.Scanner;

public class factorial {
	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int num = input.nextInt();

	        int factorial = 1;

	        for (int i = 2; i <= num; i++) {
	            factorial *= i;
	        }

	        System.out.println("The factorial of " + num + " is: " + factorial);
	    }
}
