package no.stein.xmas.day1;

import java.util.HashMap;
import java.util.Map;

public class PalindromCounter {
	public static void main(String[] args) {
		Map<String,String> palindroms = new HashMap<String,String>();
		long start = System.currentTimeMillis();
		for (int i = 1; i < 1000000; i++) {
			String ten = Integer.toString(i);
			if (isPalindrom(ten)) {
				String eight = Integer.toString(i, 8);
				if (isPalindrom(eight)) {
					System.out.println("Yohoo!!! " + ten + " = " + eight);
					palindroms.put(ten, eight);
				}
			}
		}
		System.out.println("Time: "+(System.currentTimeMillis()-start)+"ms");
		System.out.println("Found " + palindroms.size() + " palindroms");
	}

	public static boolean isPalindrom(String string) {
		if (string == null || string.length() == 0) {
			return false;
		}
		if (string.length() == 1) {
			return true;
		}
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
