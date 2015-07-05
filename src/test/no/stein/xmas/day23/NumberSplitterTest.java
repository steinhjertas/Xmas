package no.stein.xmas.day23;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

public class NumberSplitterTest {

	NumberSplitter numberSplitter = new NumberSplitter();

	@Test
	public void test_9_has_int_squareroot() throws Exception {
		assertThat(numberSplitter.squareRootIsInt(9), is(true));
	}
	@Test
	public void test_10_has_int_squareroot() throws Exception {
		assertThat(numberSplitter.squareRootIsInt(10), is(false));
	}

	@Test
	public void test_25_has_int_squareroot() throws Exception {
		assertThat(numberSplitter.squareRootIsInt(25), is(true));
	}
	
	@Test
	public void test_9_is_not_splittable() throws Exception {
		assertThat(numberSplitter.isSplitable(9), is(false));
	}
	
	@Test
	public void test_10_is_not_splittable() throws Exception {
		assertThat(numberSplitter.isSplitable(10), is(false));
	}

	@Test
	public void test_100_is_splittable() throws Exception {
		assertThat(numberSplitter.isSplitable(100), is(true));
	}
	
	@Test
	public void test_1234567_is_not_splittable() throws Exception {
		assertThat(numberSplitter.isSplitable(1234567), is(false));
	}

	@Test
	public void test_9801_is_splittable() throws Exception {
		assertThat(numberSplitter.isSplitable(9801), is(true));
	}
	@Test
	public void test_90000_is_splittable() throws Exception {
		assertThat(numberSplitter.isSplitable(90000), is(false));
	}
	@Test
	public void test_88209_is_splittable() throws Exception {
		assertThat(numberSplitter.isSplitable(88209), is(true));
	}
@Test
public void stuff() throws Exception {
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Long.MAX_VALUE);
	System.out.println(1000000L * 1000000);
	
}
	@Test
	public void test_the_whole_schabang() throws Exception {
		List<Integer> goodies = Lists.newArrayList();
		for (int i = 10; i < 1000000; i++) {
			if (numberSplitter.isSplitable(i)) {
//			if (numberSplitter.squareRootIsInt(i)) {
				goodies.add(i);
			}
		}
		
		System.out.println("Answer: " + goodies.size());
		for (Integer goodie : goodies ) {
			System.out.println(goodie + " -> " + Math.sqrt(goodie));
		}
	}

}
