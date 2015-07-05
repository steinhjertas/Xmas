package no.stein.xmas.day6;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicatorTest {
	@Test
	public void test8000() throws Exception {
		Multiplicator multiplicator = new Multiplicator(8000);
		long start = System.currentTimeMillis();
		int uniqueProducts = multiplicator.uniqueProducts();
		long time = System.currentTimeMillis()-start;
		System.out.println("8000->" + uniqueProducts + " in " + time);

	}
	@Test
	public void test9() throws Exception {
		Multiplicator multiplicator = new Multiplicator(9);
		System.out.println("9->" + multiplicator.uniqueProducts());
	}
}
