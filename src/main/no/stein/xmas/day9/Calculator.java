package no.stein.xmas.day9;

import java.util.Set;

import no.stein.xmas.day5.LargeNumber;

import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;

public class Calculator {
	public int smallestAddent() {
		Permutator permutator = new Permutator(3, 99, 1000);
		Set<Integer> firstAddents = permutator.getPermutations();
		Set<Integer> secondAddents = Sets.newHashSet(firstAddents);
		Set<Integer> addents = Sets.newHashSet();
		for (Integer firstAddent : firstAddents) {
			for (Integer secondAddent : secondAddents) {
				if (firstAddent.equals(secondAddent)) continue;
				if (contains0to9(firstAddent, secondAddent, firstAddent + secondAddent)) {
					addents.add(firstAddent);
					addents.add(secondAddent);
				}
			}
		}
		ImmutableSortedSet<Integer> result = ImmutableSortedSet.orderedBy(Ordering.<Integer> natural()).addAll(addents).build();

		//System.out.println("Legal addents [" + result.size() + "]: " + result);
		return result.iterator().next();
	}

	private boolean contains0to9(Integer firstAddent, Integer secondAddent, Integer sum) {
		if (sum < 1000 || sum > 9999)
			return false;
		LargeNumber number = new LargeNumber();
		addDigits(number, firstAddent.toString().split(""));
		addDigits(number, secondAddent.toString().split(""));
		addDigits(number, sum.toString().split(""));
		return number.isUnique();
	}

	private void addDigits(LargeNumber number, String... strings) {
		for (String digit : strings) {
			if (digit == null || digit.length() < 1)
				continue;
			number.append(new Integer(digit));
		}
	}
}
