package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterIntegers {

	public static void main(String[] args) {
		ArrayList<Integer> List=new ArrayList<>(Arrays.asList(2,3,1,7,9));
 
		List<Integer> filtered = List.stream().filter(number -> number > 3).collect(Collectors.toList());
        System.out.println(filtered);
				
	}

}
