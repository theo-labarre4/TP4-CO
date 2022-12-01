package jeuOie;

import jeux.De;
import jeux.Journal;
import plateau.Plateau;

public class Oie {
	
	private String couleur;
	private De de;
	private Plateau plateau;
	private Journal journal;
	
	public Oie(String couleur, Plateau plateau, De de) {
		this.couleur = couleur;
		this.plateau = plateau;
		this.de = de;
	}
	
	public String getCouleur() {
		return this.couleur;
	}
	
	public boolean action() {
		
	}
	
	public int lancerDe() {
		return de.lancer();
	}
	
	public void ajouterMessage(String message) {
		this.journal.ajouterMessage(message);
	}
	
	
	

}
