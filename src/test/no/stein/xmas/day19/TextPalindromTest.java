package no.stein.xmas.day19;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TextPalindromTest {
	TextPalindrom palindromer = new TextPalindrom();

	@Test
	public void test_agnes_i_senga() throws Exception {
		String text = "agnesisenga";
		assertThat(palindromer.longestPalindrom(text), is(text));
	}

	@Test
	public void test_agnes_i_senga_inside_other_text() throws Exception {
		String text = "lodsfgdsfgsdfagnesisengasdftregbtrhdfg";
		String expected = "agnesisenga";
		assertThat(palindromer.longestPalindrom(text), is(expected));
	}

	@Test
	public void test_more_palindroms_in_one_text() throws Exception {
		String text = "lolregerlekkel";
		String expected = "lregerl";
		assertThat(palindromer.longestPalindrom(text), is(expected));
	}
	
	@Test
	public void test_the_real_thing() throws Exception {
		System.out.println(palindromer.longestPalindrom(TheText.text.toLowerCase()));
	}
	
	

}
