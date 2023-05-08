package day6;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	
	public static void main(String args[]) {
		List<Integer> nums=Arrays.asList(4,8,9,5,7,2);
		int result=nums.stream()
                        .filter(n->n%2==0)	
                        .map(n->n*2)
                        .reduce(0, (c,e)->c+e);
		System.out.println(result);
	}



}
