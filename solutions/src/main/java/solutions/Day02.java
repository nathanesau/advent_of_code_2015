package solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day02 {

	public static int solution_1(List<String> arr) {
		int total = 0;
		for (String present : arr) {
			int[] dimensions = Arrays.stream(present.split("x")).mapToInt(s -> {
				try {
					return Integer.parseInt(s);
				}
				catch (Exception e) {
					return Integer.parseInt(s.substring(0, s.length() - 1));
				}
			}).toArray();
			int surface_area = 2 * dimensions[0] * dimensions[1] + 2 * dimensions[1] * dimensions[2]
					+ 2 * dimensions[0] * dimensions[2];
			int slack = Collections.min(Arrays.asList(dimensions[0] * dimensions[1], dimensions[1] * dimensions[2],
					dimensions[0] * dimensions[2]));
			total += surface_area + slack;
		}
		return total;
	}

	public static int solution_2(List<String> arr) {
		int total = 0;
		for (String present : arr) {
			int[] dimensions = Arrays.stream(present.split("x")).mapToInt(s -> {
				try {
					return Integer.parseInt(s);
				}
				catch (Exception e) {
					return Integer.parseInt(s.substring(0, s.length() - 1));
				}
			}).toArray();
			int volume = dimensions[0] * dimensions[1] * dimensions[2];
			int smallest_perimeter = 2 * Collections.min(Arrays.asList(dimensions[0] + dimensions[1],
					dimensions[1] + dimensions[2], dimensions[0] + dimensions[2]));
			total += volume + smallest_perimeter;
		}
		return total;
	}

}
