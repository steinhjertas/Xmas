package no.stein.xmas.day3;

import static org.junit.Assert.*;

import java.util.List;

import no.stein.xmas.day3.Position;

import org.junit.Test;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

public class ListTest {

	@Test
	public void test_nulls_in_list() throws Exception {
		List<Long> longs = Lists.newArrayList();
		for (int i = 0; i < 10; i++) {
			longs.add(i % 2 == 0 ? null : (long) i);
		}
		longs.removeAll(Lists.newArrayList((Position)null));
		System.out.println(longs);
	}

}
