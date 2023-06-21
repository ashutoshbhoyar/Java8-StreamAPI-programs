package java8_Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting_Accending {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(22,44,22,99,111,444,5552,62,221,1112);
		
		//for ascending 
		 List<Integer> ascending = list.stream().sorted().collect(Collectors.toList());
		 System.out.println(ascending);
		 
		 //for descending 
		 List<Integer> descending = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		 System.out.println(descending);
	}

}
