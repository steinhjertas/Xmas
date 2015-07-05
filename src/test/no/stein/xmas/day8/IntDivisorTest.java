package no.stein.xmas.day8;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntDivisorTest {

	@Test
	public void test_only_6_is_correct() throws Exception {
		IntDivisors computer = new IntDivisors(6);
		assertEquals(1, computer.listIntDivisors().size());

	}
	@Test
	public void test_divisors_under_8() throws Exception {
		IntDivisors computer = new IntDivisors(8);
		System.out.println(computer.listIntDivisors());
	}
	@Test
	public void test_divisors_under_10000() throws Exception {
		IntDivisors computer = new IntDivisors(10000);
		System.out.println(computer.listIntDivisors());
	}

}
