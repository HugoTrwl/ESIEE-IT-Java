package StarWars;

import java.util.ArrayList;

public class Film {
	/**
	 * @author Hugo
	 * @version 1.0
	 */
	
	String title;
	int releaseDate;
	int filmNumber;
	int cost;
	int receipt;
	
	ArrayList<Acteur> acteurList = new ArrayList<Acteur>();
	ArrayList<Personnage> personnageList = new ArrayList<Personnage>();
	
	public static int nbActeur(Film film) {
		return film.acteurList.size();
	}
	
	public static int nbPersonnages(Film film) {
		return film.personnageList.size();
	}
	
	public static String calculBenefice(Film film) {
		int benefit = film.getReceipt() - film.getCost();
		String b = Integer.toString(benefit);
		
		boolean isBeneficiary;
		
		if (benefit > 0) {
			isBeneficiary = true;
			return "Le film a fait un bénéfice de " + b + "dollars";
		} else {
			isBeneficiary = false;
			return "Le film a fait un déficit de " + b + "dollars";
		}
	}
	
	public static boolean isBefore(Film film, int annee) {
		boolean a;
		
		if (film.getReleaseDate() < annee) {
			return a = true;
		} else {
			return a = false;
		}
	}
	
	public void tri(Film film) {
		//Collections.sort(film.acteurList);
	}
	
	public Film() {
		/**
		 * constructeur vide
		 */
		this.title = new String();
	}
	
	public Film(String t, int rDate, int fNumber, int c, int r) {
		/**
		 * constructeur "plein"
		 */
		this.title = t;
		this.releaseDate = rDate;
		this.filmNumber = fNumber;
		this.cost = c;
		this.receipt = r;
	}
	
	public void setTitle(String t){
		this.title = t;
	}
	public void setReleaseDate(int rDate){
		this.releaseDate = rDate;
	}
	public void setFilmNumber(int fNumber){
		this.filmNumber = fNumber;
	}
	public void setCost(int c){
		this.cost = c;
	}
	public void setReceipt(int r){
		this.receipt = r;
	}
	
	public String getTitle(){
		/**
		 * @return title
		 */
		return this.title;
	}
	public int getReleaseDate(){
		/**
		 * @return releaseDate
		 */
		return this.releaseDate;
	}
	public int getFilmNumber(){
		/**
		 * @return filmNumber
		 */
		return this.filmNumber;
	}
	public int getCost(){
		/**
		 * @return cost
		 */
		return this.cost;
	}
	public int getReceipt(){
		/**
		 * @return receipt
		 */
		return this.receipt;
	}
	
	
	public String toString() {
		return "(" + this.getClass() + ") " + "Épisode " + getFilmNumber()/*this.filmNumber*/ + " : " + getTitle() + ", " + getReleaseDate() + ", " + getCost() + ", " + getReceipt();
	}

}
