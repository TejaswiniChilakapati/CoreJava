/*10. Write a program that takes an integer as input and prints whether it is a prime number or
not. (Use a while loop)*/
package p1;

import java.util.Scanner;

public class WhileLoop {
   public static void main(String args[]) {

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        scanner.close();

	        if (num > 1) {
	            int i = 2;
	            while (i <= num/2) {
	                if (num % i == 0) {
	                    System.out.println(num + " is not a prime number");
	                    break;
	                }
	                i++;
	            }
	            if (i > num/2) {
	                System.out.println(num + " is a prime number");
	            }
	        } else {
	            System.out.println(num + " is not a prime number");
	        }  
   }
}
