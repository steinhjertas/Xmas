package no.stein.xmas.day10;
import static no.stein.xmas.day10.GuestState.*;
public class Guest {

	private GuestState state = funny;
	private int id;
	private Guest next;

	public Guest(int id, Guest next) { this.id = id;
	this.next = next; }

	public boolean isAlive() { return state==funny; }
	public void drink() { state=dead; }
	public Guest next() { return next; }

	public void setNext(Guest next) {
		this.next = next;
	}

	public int id() { return id; }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guest other = (Guest) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
