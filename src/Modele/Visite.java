package Modele;
/**
 * Code du 1er cours de Java.
 * @author Hugo
 *
 */
public class Visite {
	/**
	 * @version 1.0
	 * 
	 */
	public String etudiant;
	public String date;
	public int note;
	
	public void setEtudiant(String e){
		this.etudiant = e;
	}
	public void setDate(String d){
		this.date = d;
	}
	public void setNote(int n){
		this.note = n;
	}
	
	public String getEtudiant(){
		/**
		 * @return etudiant
		 */
		return this.etudiant;
	}
	public String getDate(){
		/**
		 * @return date
		 */
		return this.date;
	}
	public int getNote(){
		/**
		 * @return note
		 */
		return this.note;
	}
	
	public Visite() {
		/**
		 * constructeur vide
		 */
		this.etudiant = new String();
		this.date = new String();
	}
	
	public Visite(String etudiant, String date, int note) {
		/**
		 * constructeur "plein"
		 */
		this.etudiant = etudiant;
		this.date = date;
		this.note = note;
	}
	
	public String toString() {
		return this.etudiant + " " + this.date + " " + this.note;
	}

	
}
