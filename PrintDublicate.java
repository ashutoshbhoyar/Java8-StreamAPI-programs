package java8_Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDublicate {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(11, 22, 33, 11, 55, 11, 77, 88, 33, 22);

		//first way
		
		Set<Integer> collect = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
		System.out.println(collect);

		
		// second way 
		
		Set<Integer> set = new HashSet<>();
		Set<Integer> collect2 = list.stream().filter(e -> !set.add(e)).collect(Collectors.toSet());
		System.out.println(collect2);

		
	}

}
