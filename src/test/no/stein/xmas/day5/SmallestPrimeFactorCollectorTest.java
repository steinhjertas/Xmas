package no.stein.xmas.day5;

public class SmallestPrimeFactorCollectorTest {


	public static void main(String[] args) {
		SmallestPrimeFactorCollector collector = new SmallestPrimeFactorCollector();
		long start = System.currentTimeMillis();
		System.out.println("\nAnswer: " + collector.smallestPrimeOfAll() + " in " +(System.currentTimeMillis()-start)+ "ms");
	}

}
