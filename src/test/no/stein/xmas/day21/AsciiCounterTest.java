package no.stein.xmas.day21;

import org.junit.Test;

public class AsciiCounterTest {
	
	AsciiCounter counter = new AsciiCounter();
	
	@Test
	public void test_top_42() throws Exception {
		System.out.println("Answer: " + counter.ascii_sum("/prosjekt/21_words.txt", 42));
	}

}
