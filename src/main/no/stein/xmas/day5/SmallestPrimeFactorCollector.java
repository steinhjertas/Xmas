package no.stein.xmas.day5;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class SmallestPrimeFactorCollector {

	public int smallestPrimeOfAll() {
		LargeNumberFactory largeNumberProducer = new LargeNumberFactory();
		Map<Long, Long> largestPrimes = Maps.newHashMap();
		Set<Long> largeNumbers = largeNumberProducer.getNumbers();
		int i = 0;
		for (Long largeNumber : largeNumbers) {
			//System.out.print(i + " ");
			largestPrimes.put(largeNumber, new LargeNumber().largestFactor(largeNumber));
			if (i++ % 1000 == 0) {
				System.out.print("-");
			}
			if (i % 100000 == 0) {
				System.out.println("*");
			}
		}
		Set<Long> sortedPrimes = Sets.newTreeSet(largestPrimes.values());
		i = 0;
		System.out.println("\nTop 10 smallest large prime factors:");
		for (Iterator<Long> iterator = sortedPrimes.iterator(); iterator.hasNext() && i < 10; i++) {
			Long largePrime = (Long) iterator.next();
			System.out.println(largePrime);
		}
		Long smallestPrime = sortedPrimes.iterator().next();
		System.out.println("Found " + smallestPrime + " to be the smallest prime");
		for (Long number : largestPrimes.keySet()) {
			if (largestPrimes.get(number).equals(smallestPrime)) {
				System.out.println(number + " has " + largestPrimes.get(number) + " as max prime");
			}
		}
		return smallestPrime.intValue();

	}

}
