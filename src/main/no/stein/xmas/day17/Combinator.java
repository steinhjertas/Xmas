package no.stein.xmas.day17;

import java.util.List;

import com.google.common.collect.Lists;

public class Combinator {
	Moves moves = new Moves();
	
	public int getPaths(Integer startAt) {
		List<List<Integer>> paths = Lists.newArrayList();
		List<Integer> path = Lists.newArrayList();
		path = dig(startAt, path, 0, paths);
		System.out.println("Integers in path: " + path.size());
		List<List<Integer>> result = splitListIntoListsOf10(path);
		System.out.println("Lists of 10: " + result.size());
		return result.size();
	}

	private List<Integer> dig(int pos, List<Integer> path, int depth, List<List<Integer>> paths) {
		if (depth > 9) {
			return Lists.newArrayList(1);
		}
		for (Integer move : moves.moves.get(pos)) {
			path.addAll(dig(move, path, depth+1, paths));
		}
		paths.add(path);
		return Lists.newArrayList();
	}
	
	private List<List<Integer>> splitListIntoListsOf10(List<Integer> integers) {
		List<List<Integer>> lists = Lists.newArrayList();
		List<Integer> list = Lists.newArrayList();
		int i = 1;
		for(Integer integer : integers) {
			list.add(integer);
			if (i++ % 10 == 0) {
				lists.add(list);
				print(list);
				list=Lists.newArrayList();
			}
		}
		return lists;
	}

	private void print(List<Integer> list) {
		for (Integer integer : list) {
			System.out.print(integer + "\t");
		}
		System.out.println("");
	}
}
