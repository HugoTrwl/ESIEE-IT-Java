package StarWars;

import java.util.ArrayList;

public class Acteur {
	String name;
	String surname;
	
	ArrayList<Personnage> personnageList = new ArrayList<Personnage>();
	
	public static int nbPersonnages(Acteur act) {
		return act.personnageList.size();
	}
	
	public Acteur() {
		/**
		 * constructeur vide
		 */
		this.name = new String();
		this.surname = new String();
	}
	
	public Acteur(String nAct, String sAct) {
		/**
		 * constructeur "plein"
		 */
		this.name = nAct;
		this.surname = sAct;
	}
	
	public void setName(String nAct){
		this.name = nAct;
	}
	public void setSurname(String sAct){
		this.surname = sAct;
	}
	
	public String getName(){
		/**
		 * @return name
		 */
		return this.name;
	}
	public String getSurname(){
		/**
		 * @return surname
		 */
		return this.surname;
	}
	
	
	public String toString() {
		return "(" + this.getClass() + ") " + "Acteur : " + getName() + " " + getSurname();
	}
}
