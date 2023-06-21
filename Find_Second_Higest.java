package java8_Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Find_Second_Higest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		Integer integer = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println(integer);
	}

}
