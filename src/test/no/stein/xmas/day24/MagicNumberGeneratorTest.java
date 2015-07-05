package no.stein.xmas.day24;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class MagicNumberGeneratorTest {
	MagicNumberGenerator generator = new MagicNumberGenerator();
	
	@Test
	public void test_123_swapped_is_312() throws Exception {
		assertThat(generator.moveLastCharToStart("123"), is(312));
	}
	@Test
	public void test_12_swapped_is_21() throws Exception {
		assertThat(generator.moveLastCharToStart("12"), is(21));
	}
	@Test
	public void test_123456_swapped_is_612345() throws Exception {
		assertThat(generator.moveLastCharToStart("123456"), is(612345));
	}
	@Test
	public void test_6_swapped_is_6() throws Exception {
		assertThat(generator.moveLastCharToStart("6"), is(6));
	}
	@Test
	public void test_16_swapped_is_61() throws Exception {
		assertThat(generator.moveLastCharToStart("16"), is(61));
	}
	@Test
	public void test_magic_number() throws Exception {
		System.out.println("Answer: " + generator.generate());
	}

}
