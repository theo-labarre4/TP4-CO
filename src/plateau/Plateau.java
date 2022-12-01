package plateau;

public class Plateau {
	
	private static final int NB_CASES = 63;
	private static Case[] cases = new Case[63];
	
	public Plateau() {
		for (int i = 0; i < NB_CASES; i++) {
			cases[i] = new Case(i);
		}
	}
	
	private void initialisationCasesSpecifique() {
		
	}
	
	public Case donnerCase(int numCase) {
		return cases[numCase];
	}

}
