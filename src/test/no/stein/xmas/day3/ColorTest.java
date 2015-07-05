package no.stein.xmas.day3;

import static org.junit.Assert.*;
import no.stein.xmas.day3.Color;

import org.junit.Test;

public class ColorTest {
	@Test
	public void test_white_compact_string() throws Exception {
		Color white = Color.white;
		assertEquals("w", white.compact());
	}
	@Test
	public void test_black_compact_string() throws Exception {
		Color black = Color.black;
		assertEquals("b", black.compact());
	}
}
