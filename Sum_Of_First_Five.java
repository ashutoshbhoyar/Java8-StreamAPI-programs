package java8_Stream;

import java.util.Arrays;
import java.util.List;

public class Sum_Of_First_Five {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 00, 121);
		Integer sum = list.stream().limit(5).reduce((a, b) -> a + b).get();
		System.out.println(sum);
	}
}