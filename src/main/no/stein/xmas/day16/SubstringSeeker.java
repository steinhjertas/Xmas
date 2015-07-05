package no.stein.xmas.day16;

import java.math.BigInteger;

public class SubstringSeeker {
	private String substring;
	private int maxPotens;

	public SubstringSeeker(String substring, int maxPotens) {
		if (substring == null || substring.equals("")) {
			substring = "472047";
		}
		if (maxPotens < 1) {
			maxPotens = 10000;
		}
		this.substring = substring;
		this.maxPotens = maxPotens;
	}

	public long getLowestMatchDouble() {
		int atLeast = Integer.parseInt(substring);
		for (int exp = 1; exp <= maxPotens; exp++) {
			double power = Math.pow(2, exp);
			if (power < atLeast) {
				continue;
			}
			String number = new Double(power).toString();
			if (number.contains(substring)) {
				return Long.parseLong(number);
			}
		}
		return -1;
	}
	public int getLowestMatchBigInteger() {
		for (int exp = 1; exp <= maxPotens; exp++) {
			BigInteger power = new BigInteger("2").pow(exp);
			String number = power.toString();
			if (number.contains(substring)) {
				return exp;
			}
		}
		return -1;
	}

}
