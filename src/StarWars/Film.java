package StarWars;

import java.util.Scanner;

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
		return "(" + this.getClass() + ") " + "Épisode " + this.getFilmNumber()/*this.filmNumber*/ + " : " + this.title + ", " + this.releaseDate + ", " + this.cost + ", " + this.receipt;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Attributs écrits en dur
		 */
		Film f1 = new Film("Un nouvel espoir", 1977, 4, 5000, 20000);
		Film f2 = new Film("L'empire contre-attaque", 1980, 5, 10000, 50000);
		System.out.println(f1);
		System.out.println(f2);
		
		/**
		 * Attributs demandés interactivement à l'utilisateur
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Saississez \"Titre d'un film Star Wars\", Année de sortie, Numéro de l'épisode, Coût, Recette :");
		String content = sc.nextLine();
		String [] tab = content.split(",");
		// transformer les attributs string en int pour suivre méthode avec les bons paramètres 'Film(String, int, int, int, int)'
		int rDate = Integer.parseInt(tab[1]);
		int fNumber = Integer.parseInt(tab[2]);
		int c = Integer.parseInt(tab[3]);
		int r = Integer.parseInt(tab[4]);
		Film f3 = new Film(tab[0],rDate,fNumber,c,r);
		System.out.println(f3);


	}

}
