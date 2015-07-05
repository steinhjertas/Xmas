package no.stein.xmas.day5;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class LargeNumber {
	private StringBuilder number = new StringBuilder(9);
	private List<Integer> lowPrimes = Arrays.asList(997, 991, 983, 977, 971, 967, 953, 947, 941, 937, 929, 919, 911, 907, 887, 883, 881, 877, 863,
			859, 857, 853, 839, 829, 827, 823, 821, 811, 809, 797, 787, 773, 769, 761, 757, 751, 743, 739, 733, 727, 719, 709, 701, 691, 683, 677,
			673, 661, 659, 653, 647, 643, 641, 631, 619, 617, 613, 607, 601, 599, 593, 587, 577, 571, 569, 563, 557, 547, 541, 523, 521, 509, 503,
			499, 491, 487, 479, 467, 463, 461, 457, 449, 443, 439, 433, 431, 421, 419, 409, 401, 397, 389, 383, 379, 373, 367, 359, 353, 349, 347,
			337, 331, 317, 313, 311, 307, 293, 283, 281, 277, 271, 269, 263, 257, 251, 241, 239, 233, 229, 227, 223, 211, 199, 197, 193, 191, 181,
			179, 173, 167, 163, 157, 151, 149, 139, 137, 131, 127, 113, 109, 107, 103, 101, 97, 89, 83, 79, 73, 71, 67, 61, 59, 53, 47, 43, 41, 37,
			31, 29, 23, 19, 17, 13, 11, 7, 5, 3, 2);

	public LargeNumber append(int aDigit) {
		number.append(aDigit);
		return this;
	}

	public boolean isUnique() {
		String number = this.number.toString();
		Set<String> digits = Sets.newHashSet(number.split(""));
		return digits.size() == number.length() + 1;
	}

	public Long toLong() {
		return new Long(number.toString());
	}

	public Integer toInteger() {
		if (new Long(number.toString()) > Integer.MAX_VALUE) {
			throw new IllegalArgumentException("Number " + number + " is too large to be changed to an int");
		}
		return new Integer(number.toString());
	}

	@Override
	public String toString() {
		return number.toString();
	}

	public long largestFactor3(long number) {
		long startAt = getStartAt(number);

		// System.out.println("sqrt(" + number + ")=" + sqrt);
		for (long i = startAt; i > 0; i--) {
			if (number % i == 0 && isPrime(i)) {
				// System.out.print("");
				System.out.println("i=" + i + ", number=" + number + ", number%i=" + number % i + ", divition: " + (number / i));
				return i;
			}
		}
		return -1;
	}

	public long largestFactor(long number) {
		long n = number;
		List<Long> factors = Lists.newArrayList();
		for (long i = 2; i <= n / i; i++) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		if (n > 1) {
			factors.add(n);
		}
		return factors.get(factors.size() - 1);
	}

	private long getStartAt(long number) {
		for (Integer prime : lowPrimes) {
			if (number % prime == 0)
				return number / prime;
		}
		return number + 1 / 2;
	}

	public boolean isPrime(long number) {
		long sqrt = new Double(Math.ceil(Math.sqrt(number))).intValue();

		if (number == 1 || number == 2) {
			return true;
		}

		if (number % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= sqrt; i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
