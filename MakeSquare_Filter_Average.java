package java8_Stream;

import java.util.Arrays;
import java.util.List;

public class MakeSquare_Filter_Average {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88);
		double asDouble = list.stream().mapToInt(a -> a * a).filter(a -> a > 200 && a < 900).average().getAsDouble();
		System.out.println(asDouble);
	}

}
