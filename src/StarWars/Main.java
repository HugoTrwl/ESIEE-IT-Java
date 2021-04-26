package StarWars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Main for Film.java
		 */
		
		//Attributs �crits en dur
		Film f1 = new Film("Un nouvel espoir", 1977, 4, 5000, 20000);
		Film f2 = new Film("L'empire contre-attaque", 1980, 5, 10000, 50000);
		
		ArrayList<Film> filmList = new ArrayList<Film>();
		
		/*<<<<<*/
		//Attributs demand�s interactivement � l'utilisateur
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Saississez <Titre d'un film Star Wars>,<Ann�e de sortie>,<Num�ro de l'�pisode>,<Co�t>,<Recette> :");
			String content = sc.nextLine();
			String [] tab_f3 = content.split(",");
			// transformer les attributs string en int pour suivre m�thode avec les bons param�tres 'Film(String, int, int, int, int)'
			int rDate_f3 = Integer.parseInt(tab_f3[1]);
			int fNumber_f3 = Integer.parseInt(tab_f3[2]);
			int c_f3 = Integer.parseInt(tab_f3[3]);
			int r_f3 = Integer.parseInt(tab_f3[4]);
			Film f3 = new Film(tab_f3[0],rDate_f3,fNumber_f3,c_f3,r_f3);
			
			filmList.add(f1);
			filmList.add(f2);
			filmList.add(f3);
			
			ListIterator<Film> lit = filmList.listIterator();
			
			while(lit.hasNext())
				System.out.println(lit.next());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Un Integer a �t� entr� � la place d'un String ou inversement");
			e.printStackTrace();
		}
		
		
		/**
		 * Main for Personnage.java
		 */

		//Map<Acteur, Personnage> personnageList = new HashMap<Acteur, Personnage>();

		
		Acteur a1 = new Acteur("Harrisson", "Ford");
		
		f1.acteurList.add(a1);
		
		Personnage p1 = new Personnage("Han", "Solo");
		Personnage p2 = new Personnage("Indiana", "Jones");
		//Personnage p3 = new Personnage("Rick", "Deckard");
		
		a1.personnageList.add(p1);
		a1.personnageList.add(p2);
		//a1.personnageList.add(p3);
		
		/**
		 * Exception qui v�rifie que chaque acteur n'a pas plus de 2 personnages associ�s
		 */
		try {
			testNumPerso(a1);
			System.out.println(a1.personnageList);
		} catch (PersonnageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/**
		 * Indique le nombre de personnages incarn�s par a1
		 */
		System.out.println(a1 + " a incarn� " + Acteur.nbPersonnages(a1) + " personnage(s)");
		
		
		makeBackUp(filmList);
		
	}
	
	public static void testNumPerso(Acteur a1) throws PersonnageException {
		int a = Acteur.nbPersonnages(a1);
		if(a > 2) {
			throw new PersonnageException();
		}
	}
	
	public static void makeBackUp(ArrayList<Film> a) {
		ListIterator<Film> lit = a.listIterator();
		int i = 0;
		
		while(lit.hasNext()) {
			System.out.println(a.get(i).getReleaseDate() + " - " + a.get(i).getTitle() + " - " + a.get(i).getReceipt());
			lit.next();
			i++;
		}
	}

}
