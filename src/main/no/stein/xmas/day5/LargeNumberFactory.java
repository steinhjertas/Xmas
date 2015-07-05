package no.stein.xmas.day5;

import java.util.Set;

import com.google.common.collect.Sets;

public class LargeNumberFactory {

	public Set<Long> getNumbers() {
		long addCounter = 0;
		Set<Long> largeNumbers = Sets.newHashSet();
		for (int first = 1; first < 10; first++) {
			for (int second = 1; second < 10; second++) {
				if (second == first)
					continue;
				for (int third = 1; third < 10; third++) {
					if (third == first || third == second)
						continue;
					for (int fourth = 1; fourth < 10; fourth++) {
						if (fourth == first || fourth == second || fourth == third)
							continue;
						for (int fifth = 1; fifth < 10; fifth++) {
							if (fifth == first || fifth == second || fifth == third || fifth == fourth)
								continue;
							for (int sixth = 1; sixth < 10; sixth++) {
								if (sixth == first || sixth == second || sixth == third || sixth == fourth || sixth == fifth)
									continue;
								for (int seventh = 1; seventh < 10; seventh++) {
									if (seventh == first || seventh == second || seventh == third || seventh == fourth || seventh == fifth
											|| seventh == sixth)
										continue;
									for (int eighth = 1; eighth < 10; eighth++) {
										if (eighth == first || eighth == second || eighth == third || eighth == fourth || eighth == fifth
												|| eighth == sixth || eighth == seventh)
											continue;
										for (int ninth = 1; ninth < 10; ninth++) {
											if (ninth == first || ninth == second || ninth == third || ninth == fourth || ninth == fifth
													|| ninth == sixth || ninth == seventh || ninth == eighth)
												continue;
											LargeNumber number = new LargeNumber();
											number.append(first).append(second).append(third).append(fourth).append(fifth).append(sixth)
													.append(seventh).append(eighth).append(ninth);
											if (number.isUnique()) {
												if (!largeNumbers.add(number.toLong())) {
													System.out.println("Adding the same again - strange... " + number.toString());
												}
												addCounter++;
												if (addCounter % 1000 == 0) {
													System.out.print(".");
												}
												if (addCounter % 100000 == 0) {
													System.out.println("");
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("done");
		System.out.println(addCounter + " addings gave large number count: " + largeNumbers.size());
		return largeNumbers;
	}
}
