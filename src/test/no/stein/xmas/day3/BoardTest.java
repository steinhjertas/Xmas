package no.stein.xmas.day3;

import static org.junit.Assert.*;
import no.stein.xmas.day3.Board;
import no.stein.xmas.day3.Color;
import no.stein.xmas.day3.Position;

import org.junit.Test;

public class BoardTest {
	@Test
	public void test_to_string() throws Exception {
		Board board = new Board(9, Color.black);
		System.out.println(board);
	}

	@Test
	public void test_to_string_with_whites() throws Exception {
		Board board = new Board(9, Color.white);
		System.out.println(board);
	}

	@Test
	public void test_to_string_with_vertical_mixin() throws Exception {
		Board board = new Board(9, Color.black);
		board.set(new Position(5, 5), Color.white);
		board.set(new Position(6, 5), Color.white);
		board.set(new Position(7, 5), Color.white);
		board.set(new Position(8, 5), Color.white);
		System.out.println(board);
	}

	@Test
	public void test_to_string_with_horisontal_mixin() throws Exception {
		Board board = new Board(9, Color.black);
		board.set(new Position(5, 5), Color.white);
		board.set(new Position(5, 6), Color.white);
		board.set(new Position(5, 7), Color.white);
		board.set(new Position(5, 8), Color.white);
		System.out.println(board);
	}

	@Test
	public void test_to_string_with_diagonal_mixin() throws Exception {
		Board board = new Board(9, Color.black);
		board.set(new Position(5, 5), Color.white);
		board.set(new Position(6, 6), Color.white);
		board.set(new Position(7, 7), Color.white);
		board.set(new Position(8, 8), Color.white);
		System.out.println(board);
	}

	@Test
	public void test_9_board_counts_4_whites_and_77_blacks() throws Exception {
		Board board = new Board(9, Color.black);
		board.set(new Position(5, 5), Color.white);
		board.set(new Position(6, 6), Color.white);
		board.set(new Position(7, 7), Color.white);
		board.set(new Position(8, 8), Color.white);
		System.out.println(board);
		assertEquals(4, board.countMatches(Color.white));
		assertEquals(77, board.countMatches(Color.black));
	}

	@Test
	public void test_10_board_counts_four_whites_and_96_blacks() throws Exception {
		Board board = new Board(10, Color.black);
		board.set(new Position(5, 5), Color.white);
		board.set(new Position(6, 6), Color.white);
		board.set(new Position(7, 7), Color.white);
		board.set(new Position(8, 8), Color.white);
		System.out.println(board);
		assertEquals(4, board.countMatches(Color.white));
		assertEquals(96, board.countMatches(Color.black));
	}
}
