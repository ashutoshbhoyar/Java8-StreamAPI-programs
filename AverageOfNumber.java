package java8_Stream;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99);
		double asDouble = list.stream().mapToInt(a -> a).average().getAsDouble();
		System.out.println(asDouble);
	}
}
