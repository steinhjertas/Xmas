package no.stein.xmas.day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class Moves {

	public Map<Integer, List<Integer>> moves = Maps.newHashMap();

	public Moves() {
		moves.put(0, Lists.newArrayList(4, 6));
		moves.put(1, Lists.newArrayList(6, 8));
		moves.put(2, Lists.newArrayList(7, 9));
		moves.put(3, Lists.newArrayList(4, 8));
		moves.put(4, Lists.newArrayList(0, 3, 9));
		moves.put(5, new ArrayList<Integer>());
		moves.put(6, Lists.newArrayList(0, 1, 7));
		moves.put(7, Lists.newArrayList(2, 6));
		moves.put(8, Lists.newArrayList(1, 3));
		moves.put(9, Lists.newArrayList(2, 4));
	}

}
