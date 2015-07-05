package no.stein.xmas.day7;

import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Ordering;

public class UsageSorter {

	public int usageCountForThe10thMostUsedColor() {
		int result = 0;
		PixelCounter pixelCounter = new PixelCounter("/The_Scream.jpg");
		Map<Integer, Integer> usages = pixelCounter.usages();

		Ordering<Integer> usageOrdering = Ordering.natural().reverse();

		List<Integer> sortedUsage = ImmutableSortedSet.orderedBy(usageOrdering).addAll(usages.values()).build().asList();
		int index = 0;
		for (Integer integer : sortedUsage) {
			System.out.println("[" + index + "] " + integer);
			if (index++ > 10) {
				break;
			}
		}
		result = sortedUsage.get(9);
		System.out.println("Count for the 10th most used image: " + result);
		return result;
	}

}
