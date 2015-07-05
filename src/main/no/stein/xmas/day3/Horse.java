package no.stein.xmas.day3;

import java.util.Collection;
import java.util.List;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

public class Horse {
	public Position pos;

	public Horse(int x, int y) {
		this.pos = new Position(x, y);
	}

	public List<Position> placesToGo(Board board) {
		List<Position> places = Lists.newArrayList();
		places.add(new Position(pos.x - 2, pos.y - 1).isInside(board));
		places.add(new Position(pos.x - 2, pos.y + 1).isInside(board));
		places.add(new Position(pos.x - 1, pos.y - 2).isInside(board));
		places.add(new Position(pos.x - 1, pos.y + 2).isInside(board));
		places.add(new Position(pos.x + 1, pos.y - 2).isInside(board));
		places.add(new Position(pos.x + 1, pos.y + 2).isInside(board));
		places.add(new Position(pos.x + 2, pos.y - 1).isInside(board));
		places.add(new Position(pos.x + 2, pos.y + 1).isInside(board));

		// Remove null === outside the board
		Collection<Position> legals = Collections2.filter(places, new Predicate<Position>() {
			@Override
			public boolean apply(Position input) {
				return input != null;
			}
		});

		// Sort based on number of position
		Function<Position, Integer> getNumberFunction = new Function<Position, Integer>() {
			public Integer apply(Position from) {
				return from.number();
			}
		};

		Ordering<Position> numberOrdering = Ordering.natural().onResultOf(getNumberFunction);

		ImmutableSortedSet<Position> sortedPlaces = ImmutableSortedSet.orderedBy(numberOrdering).addAll(legals).build();
		return sortedPlaces.asList();
	}

	public void moveTo(Position newPos, Board board) {
		this.pos = newPos;
		assert(placesToGo(board).contains(newPos));
	}
}
