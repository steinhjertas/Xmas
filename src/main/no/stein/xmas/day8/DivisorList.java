package no.stein.xmas.day8;

import java.util.Set;

import com.google.common.collect.Sets;

public class DivisorList {
	private Set<Integer> divisors;

	public DivisorList(int number) {
		divisors = Sets.newHashSet();
		computeDivisors(number);
	}

	public int sum() {
		int sum = 0;
		for (Integer value : divisors) {
			sum += value;
		}
		return sum;
	}

	private void computeDivisors(int number) {
		int sqrt = new Double(Math.ceil(Math.sqrt(number))).intValue();
		for (int i = 1; i < sqrt; i++) {
			if (number % i == 0) {
				divisors.add(i);
			}
		}
	}

	public Set<Integer> getDivisors() {
		return divisors;
	}
}
