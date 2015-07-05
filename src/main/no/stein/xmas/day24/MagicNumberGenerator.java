package no.stein.xmas.day24;

public class MagicNumberGenerator {
	
	public int generate(){
		for (int i=6; i<Integer.MAX_VALUE;i+=10){
			if (isMagic(i)) {
				System.out.println(i +"!!!");
				return i;
			}
		}
		return -1;
	}

	private boolean isMagic(int i) {
		int swapped = moveLastCharToStart(new Integer(i).toString());
		return (i*4 == swapped);
	}

	public int moveLastCharToStart(String string) {
		String swapped = string.substring(string.length()-1) + string.substring(0, string.length()-1);
		return Integer.parseInt(swapped);
	}

}
