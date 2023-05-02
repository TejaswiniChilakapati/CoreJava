//5. Write a Java program to sort an ArrayList of strings using lambda expressions.


package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {
	  
		
		ArrayList <String> list = new ArrayList<>(Arrays.asList("Java","Python","C++","C#"));
		
		
		
		Collections.sort(list, (s1,s2)->s1.compareTo(s2));
		
		System.out.println("sorted list:"+list);
	}

}
