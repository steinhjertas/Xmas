package no.stein.xmas.day16;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SubstringSeekerTest {
	@Test
	public void test_substring() throws Exception {
		SubstringSeeker seeker = new SubstringSeeker("472047", 10000);
		int result = seeker.getLowestMatchBigInteger();
		System.out.println("Answer: " + result);
		assertThat(result, is(not(-1)));
	}

}
