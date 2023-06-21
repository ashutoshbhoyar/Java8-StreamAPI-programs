package java8_Stream;

import java.util.Arrays;
import java.util.List;

public class SumOfAllElement {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88);
		Integer sum = list.stream().reduce((a, b) -> a + b).get();
		System.out.println(sum);
	}

}
