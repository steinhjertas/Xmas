package no.stein.xmas.day20;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import no.stein.xmas.day3.Position;

import org.junit.Test;

public class MoveValidatorTest {
	MoveValidator mover = new MoveValidator();

	@Test
	public void test_0_0() throws Exception {
		assertThat(mover.findMoves(new Position(0, 0)).size(), is(4));
	}

	@Test
	public void test_20_20() throws Exception {
		assertThat(mover.findMoves(new Position(20, 20)).size(), is(4));
	}

	@Test
	public void test_223_20() throws Exception {
		assertThat(mover.findMoves(new Position(223, 20)).size(), is(4));
	}

	@Test
	public void test_99_19() throws Exception {
		assertThat(mover.findMoves(new Position(99, 19)).size(), is(1));
	}
	
	@Test
	public void test_996_19() throws Exception {
		assertThat(mover.findMoves(new Position(996, 19)).size(), is(0));
	}
	

}
