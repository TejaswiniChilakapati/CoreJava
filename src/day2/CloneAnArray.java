//17) Write a program to clone an array


package day2;

import java.util.Arrays;

public class CloneAnArray {

	public static void main(String []args) {
		
		int[] Array= {1,3,6,5,7,9};
		int[] ClonedArray= Array.clone();
		
		System.out.println("Array:"+Arrays.toString(Array));
		System.out.println("Cloned Array:"+Arrays.toString(ClonedArray));
	}
	
}
