package Tools;

public class MesDates {
	
	public static String dateFRtoUS(String dateFR) {
		/**
		 * Transforme une date au format FR jj/mm/aaaa en une date au format US aaaa-mm-jj.
		 * @param dateFR
		 * @param dateUS
		 * @return dateUS
		 */
		final String tiret = "-";
		
		Character jj1 = new Character(dateFR.charAt(0));
		Character jj2 = new Character(dateFR.charAt(1));
		String JJ1 = Character.toString(jj1);
		String JJ2 = Character.toString(jj2);
		String jj = JJ1 + JJ2;
		
		Character mm1 = new Character(dateFR.charAt(3));
		Character mm2 = new Character(dateFR.charAt(4));
		String MM1 = Character.toString(mm1);
		String MM2 = Character.toString(mm2);
		String mm = MM1 + MM2;
		
		Character aaaa1 = new Character(dateFR.charAt(6));
		Character aaaa2 = new Character(dateFR.charAt(7));
		Character aaaa3 = new Character(dateFR.charAt(8));
		Character aaaa4 = new Character(dateFR.charAt(9));
		String AAAA1 = Character.toString(aaaa1);
		String AAAA2 = Character.toString(aaaa2);
		String AAAA3 = Character.toString(aaaa3);
		String AAAA4 = Character.toString(aaaa4);
		String aaaa = AAAA1 + AAAA2 + AAAA3 + AAAA4;
		
		String dateUS = aaaa + tiret + mm + tiret + jj;
		
		return dateUS;
	}
	
	public static String dateUStoFR(String dateUS) {
		/**
		 * Transforme une date au format US aaaa-mm-jj en une date au format FR jj/mm/aaaa.
		 * @param dateFR
		 * @param dateUS
		 * @return dateFR
		 */
		final String slash = "/";
		
		String aaaa = dateUS.substring(0,4);
		String mm = dateUS.substring(5,7);
		String jj = dateUS.substring(8,10);
		
		String dateFR = jj + slash + mm + slash + aaaa;
		
		return dateFR;
	}
}
