package no.stein.xmas.day10;

public class MesureTime {

	public static void main(String[] args) {
		int loops = 1;
		int startAt = 0;
		if (args != null && args.length == 2) {
			loops = Integer.parseInt(args[0]);
			startAt = Math.min(Integer.parseInt(args[1]), loops - 1);
		}
		long[] timings = new long[loops];
		for (int i = 0; i < loops; i++) {
			//long start = System.nanoTime();
			long start = System.currentTimeMillis();
			Party party = new Party(1500);
			//System.out.println(computer.listIntDivisors());
			party.comeOnBarbyLetsGoParty();
			timings[i] = System.currentTimeMillis() - start;
//			timings[i] = System.nanoTime() - start;
		}
		long sum = 0;
		for (int i = startAt; i < timings.length; i++) {
			sum += timings[i];
			// System.out.println(timings[i]);
		}
		System.out.println("Sum: " + sum + ", Average:" + new Double(sum / (timings.length - startAt)).toString());
	}
}
