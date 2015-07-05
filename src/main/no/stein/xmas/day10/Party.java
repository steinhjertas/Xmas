package no.stein.xmas.day10;

public class Party {
	private Guest partyStarter;

	public Party(int guests) {
		Guest lastGuest = new Guest(guests, null);
		Guest veryLastGuest = lastGuest;
		Guest newGuest = null;
		for (int id = guests - 1; id > 0; id--) {
			newGuest = new Guest(id, lastGuest);
			lastGuest = newGuest;
		}
		// Point the end of the chain to the start
		veryLastGuest.setNext(newGuest);
		this.partyStarter = newGuest;
	}

	public int comeOnBarbyLetsGoParty() {
		Guest lastManStanding = partyTilLastManStanding(partyStarter);
		return lastManStanding == null ? -1 : lastManStanding.id();
	}

	private Guest partyTilLastManStanding(Guest pourer) {
		Guest drinker = null;
		while (pourer!=drinker) {
			drinker = findDrinkingFriend(pourer);
			if (drinker == pourer) return pourer;
			drinker.drink();
			pourer = findNextPourer(drinker);
		}
		return null;
	}

	private Guest findDrinkingFriend(Guest pourer) {
		return findNextPartyAnimal(pourer);
	}

	private Guest findNextPourer(Guest drinker) {
		return findNextPartyAnimal(drinker);
	}

	private Guest findNextPartyAnimal(Guest pourer) {
		Guest next = pourer.next();
		while (!next.isAlive()) {
			next = next.next();
		}
		return next;
	}

	public Guest partyStarter() {
		return this.partyStarter;
	}

}
