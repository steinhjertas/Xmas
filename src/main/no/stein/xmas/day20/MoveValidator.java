package no.stein.xmas.day20;

import java.util.Collection;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import no.stein.xmas.day3.Position;

public class MoveValidator {

	public List<Position> findMoves(Position current) {
		List<Position> candidates = getSuroundings(current);

		return filterLargerThan19(candidates);
	}

	private List<Position> filterLargerThan19(List<Position> candidates) {

		// Remove null === outside the board
		Collection<Position> legals = Collections2.filter(candidates, new Predicate<Position>() {
			@Override
			public boolean apply(Position input) {
				return isValidMove(input);
			}

		});
		return Lists.newArrayList(legals);
	}

	public boolean isValidMove(Position input) {
		String x = Integer.toString(Math.abs(input.x));
		String y = Integer.toString(Math.abs(input.y));
		int positionScore = 0;
		for (char digit : (x + y).toCharArray()) {
			positionScore += Integer.parseInt(new String(new char[] { digit }));
		}
		return positionScore <= 19;
	}

	private List<Position> getSuroundings(Position current) {
		List<Position> positions = Lists.newArrayList();
		positions.add(new Position(current.x + 1, current.y));
		positions.add(new Position(current.x - 1, current.y));
		positions.add(new Position(current.x, current.y + 1));
		positions.add(new Position(current.x, current.y - 1));

		return positions;
	}

}
