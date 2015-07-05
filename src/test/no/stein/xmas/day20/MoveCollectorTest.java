package no.stein.xmas.day20;

import static org.junit.Assert.*;
import no.stein.xmas.day3.Position;

import org.junit.Test;

public class MoveCollectorTest {
@Test
public void test_move_count() throws Exception {
	MoveCollector collector = new MoveCollector();
	System.out.println("Answer: " + collector.allValidMoves(new Position(0,0)));
}
}
