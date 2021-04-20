package Autres;

public class InterfaceInstruments {
	
}

interface Instrument {
	void play();
	
	void what();
	
	void adjust();
}

class Wind implements Instrument {
	public void play() {
		String affiche = "Fiouuuuuuu";
	}
	
	public void what() {
	}
	
	public void adjust() {
	}
	
	public static void main(final String[] args) {
		String afficheInstanceWind = new String("Fiouuuuuuu");
		System.out.println(afficheInstanceWind);
	}
}

class Percussion implements Instrument {
	public void play() {
		String affiche = "Poum";
	}
	
	public void what() {
	}
	
	public void adjust() {
	}
	
	public static void main(final String[] args) {
		String afficheInstancePercu = new String("Poum");
		System.out.println(afficheInstancePercu);
	}
}

class Stringed implements Instrument {
	public void play() {
	}
	
	public void what() {
	}
	
	public void adjust() {
	}
}

class Woodwind extends Wind {
	public void play() {
		String affiche = "Wiouuuuuuu";
	}
	
	public void what() {
	}
	
	public static void main(final String[] args) {
		String afficheInstanceWind = new String("Wiouuuuuuu");
		System.out.println(afficheInstanceWind);
	}
}
class Brass extends Wind {
	public void play() {
	}
	
	public void what() {
	}
}
