//7. Write a Java program to handle a divide-by-zero exception.

package day4;

public class DividedByZeroException {

	public static void main (String[]args) {
		
		int dividend = 20;
        int divisor = 0;
        try {
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
}
   
