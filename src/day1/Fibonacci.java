/* 11.Write a program that takes an integer as input and prints the Fibonacci sequence up to that
integer. (Use a while loop)*/


package day1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Please enter a positive integer:-");
        int num = input.nextInt();
        int a = 0, b = 1;
        while (b < num) {
            System.out.print(b + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        input.close();
	}

}
