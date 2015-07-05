package no.stein.xmas.day10;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PartyTester {

	@Test
	public void test_party_fixer() throws Exception {
		Party party = new Party(1500);
		assertThat(party.partyStarter().id(), is(1));
	}

	@Test
	public void test_the_ultimate_party() throws Exception {
		Party party = new Party(1500);
		assertEquals(953, party.comeOnBarbyLetsGoParty());
	}

}
