package no.stein.xmas.day11;

import java.util.List;

public class Day11Checker {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		List<Long> primes = Primeipedia.getPrimesUpTo(100 * 1000 * 1000);
		System.out.println("Getting primes took "+(System.currentTimeMillis()-start)+" ms");
		long calcStart = System.currentTimeMillis();
		Long max = primes.get(primes.size() - 1);
		System.out.println("Prime count: " + primes.size() + ", min: "
				+ primes.get(0) + ", max=" + max);
		for (Long prime : primes) {
			/*
			if (canBeSummed(prime, 3, primes)) {
				System.out.println(prime + " is OK for 3. " + (System.currentTimeMillis() - calcStart));
				if (canBeSummed(prime, 6, primes)) {
					System.out.println("We have a winner : " + prime + " is OK for 7" + (System.currentTimeMillis() - calcStart));
					System.out.println("Total time: " + (System.currentTimeMillis() - start) + " ms");
					return;
				}
			}
			*/
			if (canBeSummed(prime, 541, primes)) {
//				System.out.println(prime + " is OK for 541. " + (System.currentTimeMillis()-calcStart));
				if (canBeSummed(prime, 41, primes)) {
//					System.out.println(prime + " is OK for 4 1" + (System.currentTimeMillis()-calcStart));
					if (canBeSummed(prime, 17, primes)) {
//						System.out.println(prime + " is OK for 17 " + (System.currentTimeMillis()-calcStart));
						if (canBeSummed(prime, 7, primes)) {
							System.out.println("We have a winner : " + prime + " is OK for 7 "+ (System.currentTimeMillis()-calcStart));
							System.out.println("Total time: "+(System.currentTimeMillis()-start)+" ms");
							return;
						}
					}
				}
			}
		}
		System.out.println("Total time: "+(System.currentTimeMillis()-start)+" ms");
		System.out.println("ERROR!");
	}

	private static boolean canBeSummed(long prime, int windowSize,
			List<Long> primes) {

		long sum = 0;
		for (int i = 0; i <= primes.size(); i++) {
			if (sum > prime) return false;
			if (sum == prime && i >= windowSize) {
				return true;
			}
			sum += primes.get(i);
			
			if (i < windowSize) {
				continue;
			}
			sum -= primes.get(i-windowSize);
		}
		return false;
	}

	private static long sum(List<Long> addents) {
		long sum = 0;
		for (long addent : addents)
			sum += addent;
		return sum;
	}

}
