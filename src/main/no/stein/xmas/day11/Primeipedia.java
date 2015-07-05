package no.stein.xmas.day11;

import java.util.List;

import com.google.common.collect.Lists;

public class Primeipedia {
	public static List<Long> getPrimesUpTo(long n) {
		// boolean[] isPrimeNumber = new boolean[n + 1]; // boolean defaults to
		// false
		List<Boolean> isPrimeNumber = Lists.newArrayList(); // boolean defaults
															// to false

		List<Long> primes = Lists.newArrayList();
		isPrimeNumber.add(false); //0
		isPrimeNumber.add(false); //1
		for (long i = 2; i < n+1; i++) {
			isPrimeNumber.add(true);
		}
		for (long i = 2; i < n; i++) {
			if (isPrimeNumber.get((int)i) == true) {
				primes.add(i);
				// now mark the multiple of i as non-prime number
				for (long j = i; j * i <= n; j++) {
					isPrimeNumber.set((int)(i * j), false);
				}
			}
		}
		return primes;
	}

	public static boolean isPrime(long number) {
		if (number % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= number; i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
