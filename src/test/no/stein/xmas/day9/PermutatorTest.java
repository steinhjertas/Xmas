package no.stein.xmas.day9;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import java.util.Set;

import org.junit.Test;

public class PermutatorTest {
	@Test
	public void test_all_permutations() throws Exception {
		Permutator permutator = new Permutator(3, 99, 1000);
		Set<Integer> numbers = permutator.getPermutations();
		assertThat(numbers.size(), is(648));
	}
}
