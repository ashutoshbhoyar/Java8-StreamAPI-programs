package java8_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOdd {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88);
		List<Integer> even = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
		System.out.println(even);

		List<Integer> odd = list.stream().filter(a -> a % 2 != 0).collect(Collectors.toList());
		System.out.println(odd);

	}

}
