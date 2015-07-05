package no.stein.xmas.day3;

public class Position {

	public int x;
	public int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int number() {
		return 10 * x + y;
	}

	public boolean inside(Board board) {
		return x > -1 && y > -1 && x < board.size() && y < board.size();
	}

	public Position isInside(Board board) {
		return inside(board) ? this : null;
	}

	@Override
	public String toString() {
		return "("+x+","+y+")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
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
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
