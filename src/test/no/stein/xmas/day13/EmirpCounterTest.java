package no.stein.xmas.day13;

import java.util.List;

import org.junit.Test;

public class EmirpCounterTest {
	@Test
	public void test_under_1000() throws Exception {
		EmirpCounter emirpsMother = new EmirpCounter();
		List<Integer> emirps = emirpsMother.listOfEmirps(1000);
		System.out.println(emirps.size() + ": " + emirps);
		
	}

}
