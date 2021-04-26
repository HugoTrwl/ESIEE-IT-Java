package StarWars;

public class Personnage {
	String name;
	String surname;
	
	public Personnage() {
		/**
		 * constructeur vide
		 */
		this.name = new String();
		this.surname = new String();
	}
	
	public Personnage(String nPers, String sPers) {
		/**
		 * constructeur "plein"
		 */
		this.name = nPers;
		this.surname = sPers;
	}
	
	public void setName(String nPers){
		this.name = nPers;
	}
	public void setSurname(String sPers){
		this.surname = sPers;
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
		return "(" + this.getClass() + ") " + "Personnage : " + getName() + " " + getSurname();
	}
	
}
