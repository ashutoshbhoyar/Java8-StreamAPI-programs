package java8_Stream;

import java.util.HashMap;
import java.util.Map;

public class ArrayListFrequency {
	public static void main(String[] args) {
		int[] arr = { 33, 44, 55, 66, 44, 22, 11, 11, 22, 33, 66,44,44,44 };
		int length = arr.length;

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < length; i++) {
			int count = map.getOrDefault(arr[i], 0);
			map.put(arr[i], count + 1);
		}
		
		System.out.println(map);

	}

}
