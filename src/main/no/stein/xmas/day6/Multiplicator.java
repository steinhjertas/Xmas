package no.stein.xmas.day6;

import java.util.Set;

import com.google.common.collect.Sets;

public class Multiplicator {
	private int dimensions;

	public Multiplicator(int dimensions) {
		this.dimensions = dimensions;
	}

	public int uniqueProducts() {
		Set<Long> uniques = Sets.newHashSet();
		for (int factor1 = 1; factor1 < dimensions + 1; factor1++) {
			for (int factor2 = 1; factor2 < dimensions + 1; factor2++) {
				uniques.add(new Long(factor1 * factor2));
			}
		}
		return uniques.size();
	}

}
