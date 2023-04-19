
/*7. Write a program that takes an integer as input and prints all the numbers from 1 to that
integer. (Use a for loop)
8. Write a program that takes an integer as input and prints all the even numbers from 2 to
that integer. (Use a for loop)*/

package p1;

import java.util.Scanner;

public class ForLoop {

	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

       // for (int i = 1; i <= num; i++)
        for (int i = 2; i <= num; i += 2) {
        {
            System.out.println(i);
        }
    }
	
	}}
