package solutions;

public class Day01 {

	public static int solution_1(String data) {
		int currentFloor = 0;
		for (char c : data.toCharArray()) {
			if (c == '(') {
				currentFloor += 1;
			}
			else if (c == ')') {
				currentFloor -= 1;
			}
		}
		return currentFloor;
	}

	public static int solution_2(String data) {
		int currentFloor = 0;
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);

			if (c == '(') {
				currentFloor += 1;
			}
			else if (c == ')') {
				currentFloor -= 1;
			}

			if (currentFloor < 0) {
				return i + 1;
			}
		}
		return 0;
	}

}
