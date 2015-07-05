package no.stein.xmas.day22;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class SquareSumComputer {

	public SquareSumComputer() {
	}

	public boolean resolvesTo1(int number) {
		Set<Integer> squareSums = Sets.newHashSet();
		int squareSum = computeSquareSum(number);
		while (!squareSums.contains(squareSum) && squareSums.add(squareSum)) {
			squareSum = computeSquareSum(squareSum);
			if (squareSum == 1) {
				System.out.println("Success on " + number + ": " + squareSums + " at " + squareSum);
				return true;
			}
		}
		//System.out.println("Gave up on " + number + ": " + squareSums + " at " + squareSum);
		return false;
	}

	private int computeSquareSum(int square) {
		String[] digits = new Integer(square).toString().split("");
		int result = 0;
		for (String digit : digits) {
			if (digit != null && digit.length() > 0) {
				Integer number = Integer.parseInt(digit);
				result += (number * number);
			}
		}
		return result;
	}
}
