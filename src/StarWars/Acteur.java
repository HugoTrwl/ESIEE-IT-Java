package StarWars;

public class Acteur {
	String name;
	String surname;
	
	public Acteur() {
		/**
		 * constructeur vide
		 */
		this.name = new String();
		this.surname = new String();
	}
	
	public Acteur(String n, String s) {
		/**
		 * constructeur "plein"
		 */
		this.name = n;
		this.surname = s;
	}
	
	public void setName(String n){
		this.name = n;
	}
	public void setSurname(String s){
		this.surname = s;
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
		return "(" + this.getClass() + ") " + "Acteur : " + this.name + " " + this.surname;
	}
}
