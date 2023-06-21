package java8_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Skip_First_5 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> list2 = list.stream().skip(5).collect(Collectors.toList());
		System.out.println(list2);
	}
}