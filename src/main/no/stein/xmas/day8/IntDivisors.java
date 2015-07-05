package no.stein.xmas.day8;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

public class IntDivisors {
	private int max;

	public IntDivisors(int max) {
		this.max = max;
	}

	public List<Integer> listIntDivisors() {
		ArrayList<Integer> result = Lists.newArrayList();
		for (int i = 1; i < max + 1; i++) {
			DivisorList divisors = new DivisorList(i);
			if (divisors.sum() == i) {
				result.add(i);
			}
		}
		return result;
	}
}
