package no.stein.xmas;

import java.util.Arrays;

import no.stein.xmas.day3.Color;
import no.stein.xmas.day3.Game;

public class Runner {

	public static void main(String[] args) {
		Game chess = new Game(10, Color.white);

		int blackCount = -1;
		int loops = 500;
		long[] timings = new long[loops];
		for (int i = 0; i < loops; i++) {
			long start = System.nanoTime();
			// long start = System.currentTimeMillis();
			blackCount = chess.play(200);
			timings[i] = System.nanoTime() - start;
			// timings[i] = System.currentTimeMillis() - start;
		}
		long sum = 0;
		int skip = new Double(loops * 0.75).intValue();
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		for (int i = 0; i < timings.length; i++) {
			if (i > skip)
				sum += timings[i];
			if (timings[i] < min)
				min = timings[i];
			if (timings[i] > max)
				max = timings[i];
		}
		double average = new Double(sum / (timings.length - skip)) / 1000000;

		System.out.println("Timings: " + Arrays.toString(timings));
		System.out.println(String.format("%d runs. Average: %f ms. Min: %d. Max: %d", timings.length, average, min, max));
		System.out.println("He says " + blackCount + " blacks at end");
	}

}
