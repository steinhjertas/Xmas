package no.stein.xmas.day9;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void test_calculation() throws Exception {
		Calculator calculator = new Calculator();
		long start = System.currentTimeMillis();
		System.out.println(calculator.smallestAddent() + ", timing: "+(System.currentTimeMillis()-start)+"ms");
	}
	
	@Test
	public void test_string_splitting() throws Exception {
		String[] firstDigits = "324".toString().split("");
		String[] secondDigits = "765".toString().split("");
		String[] sumDigits = "1089".toString().split("");
		System.out.println("first " + firstDigits.length + ": " + Arrays.toString(firstDigits));
		System.out.println("second " + secondDigits.length + ": " + Arrays.toString(secondDigits));
		System.out.println("sum " + sumDigits.length + ": " + Arrays.toString(sumDigits));

	}
}
