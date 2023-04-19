/*13. Write a program that takes a string as input and prints the reverse of that string. (Use a for
loop)*/

package p1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("The reversed string is: " + reversed);
	}

}
