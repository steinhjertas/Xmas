package no.stein.xmas.day8;

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
			long start = System.currentTimeMillis();
			IntDivisors computer = new IntDivisors(10000);
			//System.out.println(computer.listIntDivisors());
			computer.listIntDivisors();
			timings[i] = System.currentTimeMillis() - start;
		}
		long sum = 0;
		for (int i = startAt; i < timings.length; i++) {
			sum += timings[i];
			// System.out.println(timings[i]);
		}
		System.out.println("Average:" + sum / (timings.length - startAt));
	}
}
