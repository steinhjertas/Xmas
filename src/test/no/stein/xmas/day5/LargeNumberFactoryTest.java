package no.stein.xmas.day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargeNumberFactoryTest {
	@Test
	public void test_large_number_count_is_correct() throws Exception {
		LargeNumberFactory factory = new LargeNumberFactory();
		assertEquals(362880, factory.getNumbers().size());
	}

	@Test
	public void test_string_split() throws Exception {
		String number = "123456789";
		String[] chars = number.split("");
		for (int i = 0; i < chars.length; i++) {
			System.out.println(i + ": " + chars[i]);
		}
	}

}
