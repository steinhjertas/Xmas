package no.stein.xmas.day20;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import no.stein.xmas.day3.Position;

public class MoveCollector {
	MoveValidator navigator = new MoveValidator();

	public int allValidMoves(Position startPos) {
		Set<Position> moves = Sets.newHashSet();
		moves.add(startPos);
		List<Position> nearest = navigator.findMoves(startPos);
		Set<Position> nextNearest = Sets.newHashSet();
		int moveCount = -1;

		while (nearest.size()>0 && moveCount < moves.size()) {
			moveCount = moves.size();
			moves.addAll(nearest);
			for (Position near : nearest) {
				nextNearest.addAll(navigator.findMoves(near));
			}
			nearest = Lists.newArrayList(nextNearest);
		}
		return moves.size();
	}
}
