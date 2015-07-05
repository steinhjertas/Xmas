package no.stein.xmas.day23;

import java.util.List;

import com.google.common.collect.Lists;

public class NumberSplitter {

	public boolean isSplitable(long number) {
		if (!squareRootIsInt(number)) {
			return false;
		}
		String digits = new Long(number).toString();
		int length = digits.length();
		for (int i = 0; i < length; i++) {
			long first = digits.substring(0, i).length() > 0 ? Long.parseLong(digits.substring(0, i)) : 0;
			long second = digits.substring(i, length).length() > 0 ? Long.parseLong(digits.substring(i, length)) : 0;
			long sum = first + second;
			if (number == (sum*sum)) {
				return true;
			}
		}
		return false;
	}

	public boolean squareRootIsInt(long number) {
		Double squareRoot = Math.sqrt(number);
		Integer intPart = new Double(squareRoot).intValue();
		return squareRoot - intPart == 0;
	}
}
