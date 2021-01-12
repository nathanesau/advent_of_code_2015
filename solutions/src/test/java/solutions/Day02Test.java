package solutions;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Day02Test {

	private String readInput() {
		try {
			URL resourceUrl = getClass().getClassLoader().getResource("day02.txt");
			Path path = Paths.get(resourceUrl.toURI());
			String data = Files.readString(path);
			return data;
		}
		catch (URISyntaxException | IOException e) {
			System.err.println("Unable to load resource for Day01 Test");
		}
		return null;
	}

	@Test
	public void test_solution_1() {

		String data = readInput();
		List<String> arr = Arrays.asList(data.split("\n"));
		int s1 = Day02.solution_1(arr);
		assert s1 == 1586300;
	}

	@Test
	public void test_solution_2() {

		String data = readInput();
		List<String> arr = Arrays.asList(data.split("\n"));
		int s2 = Day02.solution_2(arr);
		assert s2 == 3737498;
	}

}
