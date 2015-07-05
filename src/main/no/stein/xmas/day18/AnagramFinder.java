package no.stein.xmas.day18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

public class AnagramFinder {
	
	public void searchFileAndPrintBestWord() {
		List<String> anagrams = readFile();
		ImmutableList<String> sortedAnagrams = ImmutableList.copyOf(Ordering.natural().sortedCopy(anagrams));
		System.out.println("anagrams: " + anagrams.size() + ", sorted: " + sortedAnagrams.size());

		PrintWriter out=null;
		try {
			out = new PrintWriter("/prosjekt/sorted.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for(String string : sortedAnagrams){
			out.println(string);
		}
		out.close();
		int max = 0;
		String maxWord = "";
		String prev = "";
		int hits = 1;
		for (String anagram_ : sortedAnagrams) {
			if (prev.equals(anagram_)) {
				hits++;
			} else {
				hits = 1;
			}
			if (hits > max) {
				max = hits;
				maxWord = anagram_;
			}
			prev = anagram_;
		}
		System.out.println("Answer: " + max + " '" + maxWord + "'");
	}

	public List<String> readFile() {
		List<String> anagrams = Lists.newArrayList();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("/prosjekt/words.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				char[] chars = line.toLowerCase().toCharArray();
				Arrays.sort(chars);
				anagrams.add(new String(chars));
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
		return anagrams;
	}
}
