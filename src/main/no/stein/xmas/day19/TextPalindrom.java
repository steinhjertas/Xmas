package no.stein.xmas.day19;

public class TextPalindrom {

	public String longestPalindrom(String text) {
		String reversed = reverse(text);
		System.out.println("Text:     " + text + ", " + text.length());
		System.out.println("Reversed: " + reversed);
		String longestPalindrom = "";
		for (int length = 3; length < text.length() + 1; length++) {
			for (int i = 0; i < text.length() +1 - length; i++) {
				String subString = text.substring(i, i + length);
				if (reversed.contains(subString)) {
					if (subString.length() > longestPalindrom.length()) {
						longestPalindrom = subString;
//						System.out.println("A palindrom: " + subString + ", i:" + i + ", length: " + length);
						System.out.println("A palindrom: " + subString);
					}
				}
			}
		}
		return longestPalindrom;
	}

	private String reverse(String text) {
		char[] chars = text.toCharArray();
		StringBuilder reversedChars = new StringBuilder(chars.length);
		for (int i = chars.length - 1; i > -1; i--) {
			reversedChars.append(chars[i]);
		}
		return reversedChars.toString();
	}

}
