package plateau;

import jeuOie.Oie;

public class Case {
	
	private int numCase;
	
	public Case(int numCase) {
		this.numCase = numCase;
	}
	
	public String getNom() {
		return "Numero: "+ this.numCase;
	}
	
	public int getNum() {
		return this.numCase;
	}
	
	public Case depart(Oie oie) {
		
	}
	
	public Case arrivee(Oie oie) {
		
	}
	
	protected Case suivante(Oie oie, int numCaseDestination) {
		
	}

}
