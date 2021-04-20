import Modele.*;
import Tools.*;
import Autres.*;

public class Principale {
	
	public static void main( String [ ] args ) {
		Visite v1 = new Visite();
		Visite v2 = new Visite("Jean", "20/04/2021", 15);
		v2.setEtudiant("David");
		System.out.println("1. " + v2);
		
		/**
		 * déterminer caractère à une position donnée
		 */
		System.out.println("2. " + v2.getEtudiant().charAt(2));
		
		/**
		 * string to int to string to int
		 */
		String str = "5";
		int num = Integer.parseInt(str);
		System.out.println("3." + num + 4);
		String str2 = Integer.toString(num);
		System.out.println("3." + str2 + 4);
		Integer num2 = new Integer(str2);
		System.out.println("3." + num2.intValue() + 1);
		
		/**
		 * convert date FR to US
		 */
		System.out.println("4." + MesDates.dateFRtoUS("22/04/2021"));
		
		/**
		 * convert date US to FR
		 */
		System.out.println("4." + MesDates.dateUStoFR("2021-04-22"));
		
		/**
		 * tableau from Visite to Planning
		 */
		//System.out.println("5. " + Planning.SupprVisite("Jean"));
		
	}
	
}
