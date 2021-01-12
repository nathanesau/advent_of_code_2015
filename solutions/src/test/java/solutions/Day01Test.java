package solutions;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class Day01Test {

	private String readInput() {
		try {
			URL resourceUrl = getClass().getClassLoader().getResource("day01.txt");
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
		int s1 = Day01.solution_1(data);
		assert s1 == 232;
	}

	@Test
	public void test_solution_2() {

		String data = readInput();
		int s2 = Day01.solution_2(data);
		assert s2 == 1783;
	}

}
