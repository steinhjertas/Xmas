package no.stein.xmas.day14;

import java.util.Map;

import com.google.common.collect.Maps;

public class MirrorableCounter {

	private Map<Character, Character> mappings = Maps.newHashMap();

	public MirrorableCounter() {
		mappings.put('0', '0');
		mappings.put('1', '1');
		mappings.put('6', '9');
		mappings.put('8', '8');
		mappings.put('9', '6');
	}

	public int mirrorsUnder(int max) {
		int mirrors = 0;
		for (int i = 0; i <= max; i++) {
			if (isMirror(i))
				mirrors++;
		}
		return mirrors;
	}

	public boolean isMirror(int number) {
		Integer sameAsNumber = new Integer(number);
		String textNumber = sameAsNumber.toString();
		int length = textNumber.length();
		
		int half = new Double(Math.ceil( (double)length/2)).intValue();
		for (int i = 0; i < half; i++) {
			
			char charOne = textNumber.charAt(i);
			Character charTwo = mappings.get(textNumber.charAt(length-1-i));
			if (charTwo==null || charOne != charTwo)
				return false;
		}
		return true;
	}
}
