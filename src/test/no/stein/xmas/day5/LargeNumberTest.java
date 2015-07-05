package no.stein.xmas.day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargeNumberTest {

	@Test
	public void test_is_unique() throws Exception {
		LargeNumber number = new LargeNumber();
		number.append(1).append(2).append(3).append(4).append(5).append(6).append(7).append(8).append(9);
		assertTrue(number.isUnique());
	}

	@Test
	public void test_is_not_unique() throws Exception {
		LargeNumber number = new LargeNumber();
		number.append(1).append(2).append(3).append(4).append(4).append(6).append(7).append(8).append(9);
		assertFalse(number.isUnique());
	}

	@Test
	public void test_largest_factor_of_16_is_2() throws Exception {
		LargeNumber number = new LargeNumber();
		assertEquals(2, number.largestFactor(16));
	}

	@Test
	public void test_largest_factor_of_23_is_23() throws Exception {
		LargeNumber number = new LargeNumber();
		assertEquals(23, number.largestFactor(23));
	}

	@Test
	public void test_largest_factor_of_30_is_5() throws Exception {
		LargeNumber number = new LargeNumber();
		assertEquals(5, number.largestFactor(30));
	}

	@Test
	public void test_largest_factor_of_large_number_is_491() throws Exception {
		LargeNumber number = new LargeNumber();
		assertEquals(491, number.largestFactor(879456123));
	}

	@Test
	public void test_largest_factor_of_large_number_is_4111() throws Exception {
		LargeNumber number = new LargeNumber();
		assertEquals(4111, number.largestFactor(483761925));
	}

	@Test
	public void test_largest_factor_of_large_number_is_3() throws Exception {
		LargeNumber number = new LargeNumber();
		assertEquals(47321513, number.largestFactor(425893617));
	}

	@Test
	public void test_47321513_is_prime() throws Exception {
		LargeNumber number = new LargeNumber();
		assertTrue(number.isPrime(47321513));
	}

	@Test
	public void test_largest_factor_of_478219536_is_3320969() throws Exception {
		LargeNumber number = new LargeNumber();
		assertEquals(3320969, number.largestFactor(478219536));
	}
}
