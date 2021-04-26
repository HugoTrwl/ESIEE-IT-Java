package StarWars;

public class PersonnageException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PersonnageException() {
		super("L'acteur a trop de personnages associés");
	}
}
