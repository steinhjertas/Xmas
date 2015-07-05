package no.stein.xmas.day3;

import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class Board {
	List<List<Color>> board;
	private int size;

	public Board(int size, Color color) {
		this.size = size;
		initBoard(size, color);
	}

	private void initBoard(int size, Color color) {
		List<Color> row = Lists.newArrayList();
		board = Lists.newArrayList();
		for (int i = 0; i < size; i++)
			row.add(color);
		for (int i = 0; i < size; i++)
			board.add(Lists.newArrayList(row));
	}

	public boolean inside(Position pos) {
		return pos.x < size() && pos.y < size();
	}

	public Color get(int x, int y) {
		return board.get(x).get(y);
	}

	public Color get(Position pos) {
		return get(pos.x, pos.y);
	}

	public void set(int x, int y, Color color) {
		board.get(x).set(y, color);
	}

	public Color colorAt(Position pos) {
		return get(pos.x, pos.y);
	}

	public void set(Position pos, Color color) {
		set(pos.x, pos.y, color);
	}

	public int size() {
		return size;
	}

	public void flip(Position pos) {
		Color current = get(pos);
		set(pos, current.inverse());
	}

	public int countMatches(final Color color) {
		List<Color> matches = Lists.newArrayList();

		for (List<Color> row : board) {
			// Remove all with wrong color
			Iterable<Color> filtered = Iterables.filter(row, new Predicate<Color>() {
				@Override
				public boolean apply(Color input) {
					return input == color;
				}
			});
			matches.addAll(Lists.newArrayList(filtered));
		}
		return matches.size();
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder(size * size);
		string.append("Board [ size=").append(size).append(" ]\n");
		for (List<Color> row : board) {
			for (Color color : row) {
				string.append(color.compact()).append(" ");
			}
			string.append("\n");
		}
		return string.toString();
	}
}
