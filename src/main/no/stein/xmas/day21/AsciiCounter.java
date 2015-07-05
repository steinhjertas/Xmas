package no.stein.xmas.day21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

public class AsciiCounter {

	public int ascii_sum(String fileName, int topWordCount) {
		List<String> words = readFile(fileName);
		List<Integer> asciiSums = summarizeAsciiValues(words);
		ImmutableList<Integer> sortedAsciiSums = ImmutableList.copyOf(Ordering.natural().reverse().sortedCopy(asciiSums));

		int sum = 0;
		for (int i = 0; i < topWordCount; i++) {
			sum += sortedAsciiSums.get(i);
		}
		return sum;
	}

	private List<String> readFile(String fileName) {
		List<String> result = Lists.newArrayList();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = br.readLine()) != null) {
				result.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	private List<Integer> summarizeAsciiValues(List<String> words) {
		List<Integer> asciiSums = Lists.newArrayList();
		for (String word : words) {
			asciiSums.add(asciiSum(word));
		}
		return asciiSums;
	}

	private Integer asciiSum(String word) {
		Integer sum = 0;
		char[] chars = word.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			sum += chars[i];
		}
		return sum;
	}
}
