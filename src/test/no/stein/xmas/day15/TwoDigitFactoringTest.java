package no.stein.xmas.day15;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class TwoDigitFactoringTest {
	private TwoDigitFactoring factorizor = new TwoDigitFactoring();;

	@Test
	public void test_1260() throws Exception {
		assertThat(factorizor.isSuperNumber(1260), is(true));
	}

	@Test
	public void test_1395() throws Exception {
		assertThat(factorizor.isSuperNumber(1395), is(true));
	}

	@Test
	public void test_1200() throws Exception {
		assertThat(factorizor.isSuperNumber(1200), is(false));
	}
	@Test
	public void test_8217() throws Exception {
		assertThat(factorizor.isSuperNumber(8217), is(false));
	}
	
	@Test
	public void count_total_supernumbers() throws Exception {
		System.out.println("Answer: " + factorizor.countSuperNumbers());
		
	}

}
