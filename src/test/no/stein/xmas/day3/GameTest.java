package no.stein.xmas.day3;

import static org.junit.Assert.*;
import no.stein.xmas.day3.Color;
import no.stein.xmas.day3.Game;

import org.junit.Test;

public class GameTest {
	@Test
	public void test_200_moves_on_10_by_10() throws Exception {
		Game chess = new Game(10, Color.white);
		long start = System.currentTimeMillis();
		int blackCount = chess.play(10);
		System.out.println("They say " + blackCount + " blacks at end after " + (System.currentTimeMillis() - start) + "ms");
	}
	@Test
	public void test_50_moves_on_10_by_10() throws Exception {
		Game chess = new Game(10, Color.white);
		long start = System.currentTimeMillis();
		int blackCount = chess.play(50);
		System.out.println("They say " + blackCount + " blacks at end after " + (System.currentTimeMillis() - start) + "ms");
	}
}
