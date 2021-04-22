package StarWars;

import java.util.Scanner;

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
	
	public Personnage(String n, String s) {
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
		return "(" + this.getClass() + ") " + "Personnage : " + this.name + " " + this.surname;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personnage p1 = new Personnage("Han", "Solo");
		System.out.println(p1);


	}
}
