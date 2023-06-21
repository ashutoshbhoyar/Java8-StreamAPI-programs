package java8_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMaxNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(22, 434, 66, 211, 77, 21, 55);

		Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);

		Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);

		// or

		Integer min1 = list.stream().min(Comparator.comparing(a -> Integer.valueOf(a))).get();
		System.out.println(min1);

		Integer max1 = list.stream().max(Comparator.comparing(a -> Integer.valueOf(a))).get();
		System.out.println(max1);

	}

}
