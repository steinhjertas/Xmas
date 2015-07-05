package no.stein.xmas.day17;

import org.junit.Test;

public class CombinatorTest {
	@Test
	public void test_path_combinations() throws Exception {
		Combinator com = new Combinator();
		System.out.println(com.getPaths(1));
	}
}
