package java8_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWith2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 22, 33, 2424, 55, 289, 77, 88);
		List<Integer> collect = list.stream().map(a -> a + "").filter(a -> a.startsWith("2"))
				.map(a -> Integer.valueOf(a)).collect(Collectors.toList());

		System.out.println(collect);

	}
}
