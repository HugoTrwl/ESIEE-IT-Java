package Autres;

import Modele.Visite;

public class Planning {
	Visite [] tab1;
	
	int nombre = 0;
	
	public Planning() {
		/**
		 * constructeur vide
		 */
	}
	
	public Planning(Visite [] tab1) {
		/**
		 * constructeur "plein"
		 */
		this.tab1 = tab1;
	}
	
	public void AjoutVisite(Visite v) {
		tab1[nombre] = v;
		nombre ++;
	}
	
	public void SupprVisite(String etudiant) {
		do {
			nombre ++;
		} while(tab1[nombre].etudiant != etudiant);
		
		tab1[nombre].etudiant = "";
	}
}
