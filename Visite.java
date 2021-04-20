
public class Visite {
	String etudiant;
	String date;
	int note;
	
	void setEtudiant(String e){
		this.etudiant = e;
	}
	void setDate(String d){
		this.date = d;
	}
	void setNote(int n){
		this.note = n;
	}
	
	String getEtudiant(){
		return this.etudiant;
	}
	String getDate(){
		return this.date;
	}
	int getNote(){
		return this.note;
	}
	
	Visite() {
		// constructeur vide
		this.etudiant = new String();
		this.date = new String();
	}
	
	Visite(String etudiant, String date, int note) {
		// constructeur "plein"
		this.etudiant = etudiant;
		this.date = date;
		this.note = note;
	}
	
	static String ConvertDateFRtoUS(String dateFR) {
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
	
	static String ConvertDateUStoFR(String dateUS) {
		final String slash = "/";
		
		String aaaa = dateUS.substring(0,4);
		String mm = dateUS.substring(5,7);
		String jj = dateUS.substring(8,10);
		
		String dateFR = jj + slash + mm + slash + aaaa;
		
		return dateFR;
	}
	
	public String toString() {
		return this.etudiant + " " + this.date + " " + this.note;
	}

	public static void main( String [ ] args ) {
		Visite v1 = new Visite();
		Visite v2 = new Visite("Jean", "20/04/2021", 15);
		v2.setEtudiant("David");
		System.out.println("1. " + v2);
		
		// déterminer caractère à une position donnée
		System.out.println("2. " + v2.getEtudiant().charAt(2));
		
		// string to int to string to int
		String str = "5";
		int num = Integer.parseInt(str);
		System.out.println("3." + num + 4);
		String str2 = Integer.toString(num);
		System.out.println("3." + str2 + 4);
		Integer num2 = new Integer(str2);
		System.out.println("3." + num2.intValue() + 1);
		
		// convert date FR to US
		System.out.println("4." + ConvertDateFRtoUS("22/04/2021"));
		
		// convert date US to FR
		System.out.println("4." + ConvertDateUStoFR("2021-04-22"));
		
	}
}
