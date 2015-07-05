package no.stein.xmas.day3;

import static no.stein.xmas.day3.Color.black;
import static no.stein.xmas.day3.Color.white;

import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class Game {

	private Board board;

	public Game(int boardSize, Color initColor) {
		board = new Board(boardSize, initColor);
	}

	public int play(int moves) {

		Horse horse = new Horse(0, 0);

		for (int i = 0; i < moves; i++) {
			Color currentColor = board.colorAt(horse.pos);
			List<Position> candiates = horse.placesToGo(board);
			Position newPos = null;
			List<Position> matchingColors = onlySameColor(candiates, currentColor);
			if (matchingColors.size() > 0) {
				newPos = matchingColors.get(0);
			} else {
				newPos = candiates.get(candiates.size() - 1);
			}
			board.flip(horse.pos);
			horse.moveTo(newPos, board);
			//System.out.println((i + 1) + " :: " + board.toString());
		}
		//System.out.println("Blacks at end: " + board.countMatches(black));
		//System.out.println("Whites at end: " + board.countMatches(white));

		return board.countMatches(black);
	}

	private List<Position> onlySameColor(List<Position> candidates, final Color color) {
		// Remove all with wrong color
		Iterable<Position> filtered = Iterables.filter(candidates, new Predicate<Position>() {
			@Override
			public boolean apply(Position input) {
				return board.colorAt(input) == color;
			}
		});
		return Lists.newArrayList(filtered);
	}
}
