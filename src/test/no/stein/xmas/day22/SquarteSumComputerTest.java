package no.stein.xmas.day22;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

public class SquarteSumComputerTest {
	SquareSumComputer computer = new SquareSumComputer();

	@Test
	public void test_7_resolves_to_1() throws Exception {
		assertThat(computer.resolvesTo1(7), is(true));
	}

	@Test
	public void test_17_does_not_resolve_to_1() throws Exception {
		assertThat(computer.resolvesTo1(17), is(false));
	}
	@Test
	public void test_50() throws Exception {
		assertThat(computer.resolvesTo1(50), is(false));
	}

	@Test
	public void test_all_under_50() throws Exception {
		List<Integer> ones = Lists.newArrayList();
		for (int i = 0; i < 51; i++) {
			if (computer.resolvesTo1(i)) {
				ones.add(i);
			}
		}
		System.out.println("Answer: " + ones.size() + ". " + ones);
	}
}
