package no.stein.xmas.day3;

public enum Color {
	white, black;

	public Color inverse() {
		return this == white ? black : white;
	}

	public String compact() {
		return this.toString().substring(0, 1);
	}
}
