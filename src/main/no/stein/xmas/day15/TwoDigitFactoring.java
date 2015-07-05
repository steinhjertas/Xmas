package no.stein.xmas.day15;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import no.stein.xmas.day3.Position;
import no.stein.xmas.day8.DivisorList;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;

public class TwoDigitFactoring {

	public int countSuperNumbers() {
		int result = 0;
		for (int number = 1000; number < 10000; number++) {
			if (isSuperNumber(number))
				result++;
		}
		return result;
	}

	public boolean isSuperNumber(int number) {
		List<Integer> factors = factorize(number);
		Collection<Integer> twoDigitFactors = Collections2.filter(factors,
				new Predicate<Integer>() {
					@Override
					public boolean apply(Integer input) {
						return 9 < input && input < 100;
					}
				});
		for (Integer factor1 : twoDigitFactors) {
			int factor2 = number / factor1;
			if (9 < factor2 && factor2 < 100) {
				if (checkDigitCorrectness(number, factor1,
						factor2) && !(factor1 % 10 == 0 && factor2 % 10 == 0)) {
					System.out.println(number + ": " + factor1 + "*" + factor2
							+ "=" + factor1 * factor2);
					return true;
				}
			}
		}
		return false;
	}

	private boolean checkDigitCorrectness(int number,
			Integer factor1, int factor2) {
		String numberDigits = new Integer(number).toString();
		String factorDigits = new Integer(factor1).toString();
		factorDigits += new Integer(factor2).toString();

		ImmutableList<String> sortedNumber = ImmutableList.copyOf(Ordering
				.natural().sortedCopy(
						Lists.newArrayList(numberDigits.split(""))));
		ImmutableList<String> sortedFactors = ImmutableList.copyOf(Ordering
				.natural().sortedCopy(
						Lists.newArrayList(factorDigits.split(""))));

		if (!sortedNumber.toString().equals(sortedFactors.toString())) {
			return false;
		}
		return true;
	}

	private List<Integer> factorize(int number) {
		DivisorList divisor = new DivisorList(number);
		return Lists.newArrayList(divisor.getDivisors());
	}
}
