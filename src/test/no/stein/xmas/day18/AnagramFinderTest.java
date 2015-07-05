package no.stein.xmas.day18;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramFinderTest {
	@Test
	public void test_anagrams_in_words() throws Exception {
		AnagramFinder finder = new AnagramFinder();
		finder.searchFileAndPrintBestWord();
	}

}
