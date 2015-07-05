package no.stein.xmas.day9;

import java.util.Set;

import no.stein.xmas.day5.LargeNumber;

import com.google.common.collect.Sets;

public class Permutator {
	private int digits;
	private int minValue;
	private int maxValue;

	public Permutator(int digits, int minValue, int maxValue) {
		this.digits = digits;
		this.minValue = minValue;
		this.maxValue = maxValue;
	}

	public Set<Integer> getPermutations() {
		Set<Integer> result = Sets.newHashSet();
		for (int first = 0; first < 10; first++) {
			for (int second = 0; second < 10; second++) {
				if (second == first) continue;
				for (int third = 0; third < 10; third++) {
					if (third == first || third == second) continue;
					LargeNumber number = new LargeNumber();
					number.append(first).append(second).append(third);
					Integer integer = number.toInteger();
					if (number.isUnique() && integer > minValue && integer < maxValue) {
						if (!result.add(integer)) {
							System.out.println("Adding the same again - strange... " + number.toString());
						}
					}
				}
			}
		}
		//System.out.println(result);
		return result;
	}
}
