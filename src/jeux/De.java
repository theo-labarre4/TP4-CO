package jeux;

import java.util.Random;

public class De {
	
	private static final Random rand = new Random();
	
	public int lancer() {
		return rand.nextInt(1,6);
	}

}
