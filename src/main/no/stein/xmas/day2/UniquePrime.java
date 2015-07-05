package no.stein.xmas.day2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * I dagens luke skal vi trikse litt med primtall.
 * 
 * For et gitt nummer, n, finn tallet m, hvor det første sifferet i m = n og
 * antall siffer i m = n og hver tosifret tallsekvens i m skal være unike
 * primtall. Tallet skal også være lavest mulig.
 * 
 * Eksempel: Dersom n = 5 blir m = 53113. Første siffer i m er 5. Antall siffer
 * i m er 5. De tosifrete tallsekvensene i m, 53, 31, 11 og 13, er alle unike
 * primtall. Det er det laveste mulige tallet som oppfyller alle disse
 * egenskapene.
 * 
 * Hva er m dersom n = 9?
 * 
 * @author knowit
 *
 */
public class UniquePrime {

	private List<Integer> lowPrimes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);

	public long findNumber(int digits) {
		long start = minLong(digits);
		long stop = maxLong(digits);
		List<String> matches = Lists.newArrayList();
		;
		for (long i = start; i <= stop; i++) {
			String longAsString = new Long(i).toString();
			if (notUnique(longAsString))
				continue;
			if (isPrimes(longAsString)) {
				matches.add(longAsString);
			}
		}
		System.out.println(matches.size() + ": " + matches);
		TreeSet<Integer> primes = Sets.newTreeSet();
		for (String prime : matches) {
			primes.add(new Integer(prime));
		}
		return primes.first();
	}

	public boolean notUnique(String longAsString) {
		Set<String> pairs = Sets.newHashSet();
		for (int i = 0; i < longAsString.length()-1; i++) {
			String pair = longAsString.substring(i, i + 2);
			if (!pairs.add(pair))
				return true;
		}
		return false;
	}

	public boolean isPrimes(String substring) {
		String pair = substring.substring(0, 2);
		if (lowPrimes.contains(new Integer(pair))) {
			if (substring.length() < 3)
				return true;
			return isPrimes(substring.substring(1));
		}
		return false;
	}

	public String findLowestMatch(int n) {
		long minLong = minLong(n);

		// for (int i=0;i<n;i++) {}
		// String min = new String("0",n-1);
		return "1";
	}

	public long minLong(int n) {
		if (n * Math.pow(10, n - 1) > Long.MAX_VALUE) {
			throw new IllegalArgumentException("Can not handle numbers with " + n + " digits");
		}
		double min = n * Math.pow(10, n - 1);
		if (n > 9)
			min = min / 10;
		return new Double(min).longValue();
	}

	public long maxLong(int n) {
		if (n * Math.pow(10, n - 1) > Long.MAX_VALUE) {
			throw new IllegalArgumentException("Can not handle numbers with " + n + " digits");
		}
		double max = (n + 1) * Math.pow(10, n - 1) - 1;
		if (n > 9)
			max = max / 10;
		return new Double(max).longValue();
	}
}
