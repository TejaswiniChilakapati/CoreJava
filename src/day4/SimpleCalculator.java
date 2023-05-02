//4.Write a Java program to implement a simple calculator using switch case and enums.


package day4;

import java.util.Scanner;

public class SimpleCalculator {
  
	enum Operation{
		
		ADDITION,
		SUBTRACTION,
		MULTIPLICATION,
		DIVISION
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the first number:");
		Double num1=sc.nextDouble();
		
		System.out.println("Enter the second number:");
		Double num2=sc.nextDouble();
		
		System.out.println("Choose the Operation:");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		 System.out.print("Enter your choice: ");
	     int choice = sc.nextInt();
	     
	     Operation operation;
	     switch(choice){
	     case 1:
	    	 operation=Operation.ADDITION;
	    	 break;
	     case 2:
	    	 operation=Operation.SUBTRACTION;
	         break;
	     case 3:
	    	 operation=Operation.MULTIPLICATION;
	    	 break;
	     case 4:
	    	 operation=Operation.DIVISION;
	    	 break;
	    default:
	    	System.out.println("Invalid Choice!");
	    	return;
	     }
	     
	   Double result;
	    	switch(operation) {
	    	case ADDITION:
	    		result=num1+num2;
	    		break;
	    	case SUBTRACTION:
	    		result=num1-num2;
	    		break;
	    	case MULTIPLICATION:
	    		result=num1*num2;
	    		break;
	    	case DIVISION:
	    		result=num1%num2;
	    		break;
	    	default :
	    		System.out.println("Invalid Operation!");
	    		return;
	    	}
	    	System.out.println("result is :"+result);
	    
		
	}

}
