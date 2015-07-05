package no.stein.xmas.day13;

import java.util.Arrays;
import java.util.List;

import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

import no.stein.xmas.day1.PalindromCounter;
import no.stein.xmas.day11.Primeipedia;
import no.stein.xmas.day3.Position;

public class EmirpCounter {

	public List<Integer> listOfEmirps(int ceiling) {
		List<Long> primes = Primeipedia.getPrimesUpTo(ceiling);
		List<Long> reversedPrimes = reverseEachNumber(primes);
		List<Integer> erimps = Lists.newArrayList();
		for (Long prime : primes) {
			if (reversedPrimes.contains(prime) && !isPalindrom(prime)) {
				erimps.add((int)prime.longValue());
			}
		}
		return erimps;
	}

	private List<Long> reverseEachNumber(List<Long> numbers) {
		List<Long> reverseds = Lists.newArrayListWithCapacity(numbers.size());
		for (Long number : numbers) {
			reverseds.add(reverse(number));
		}
		return reverseds;
	}

	private Long reverse(Long number) {
		String numberString = number.toString();
		List<String> digits = Arrays.asList(numberString.split(""));
		String reversedDigits = "";
		for (String digit : digits) {
			reversedDigits = digit + reversedDigits;
		}
		return Long.parseLong(reversedDigits);
	}

	private boolean isPalindrom(Long prime) {
		return PalindromCounter.isPalindrom(prime.toString());
	}

}
