package StarWars_BDD;

public class Film {
	
	int id;
	String title;
	int releaseDate;
	int number;
	int cost;
	int receipt;
	
	public Film() {
		/**
		 * constructeur vide
		 */
		this.title = new String();
	}
	
	public Film(int id, String t, int rDate, int n, int c, int r) {
		/**
		 * constructeur "plein"
		 */
		this.id = id;
		this.title = t;
		this.releaseDate = rDate;
		this.number = n;
		this.cost = c;
		this.receipt = r;
	}
	
	/**
	 * Setters
	 * @param id,t,rDate,n,c,r
	 */
	public void setId(int id){
		this.id = id;
	}
	public void setTitle(String t){
		this.title = t;
	}
	public void setReleaseDate(int rDate){
		this.releaseDate = rDate;
	}
	public void setNumber(int n){
		this.number = n;
	}
	public void setCost(int c){
		this.cost = c;
	}
	public void setReceipt(int r){
		this.receipt = r;
	}
	
	/**
	 * Getters
	 * @return this.id,this.title,this.releaseDate,this.number,this.cost,this.receipt
	 */
	public int getId(){
		return this.id;
	}
	public String getTitle(){
		return this.title;
	}
	public int getReleaseDate(){
		return this.releaseDate;
	}
	public int getNumber(){
		return this.number;
	}
	public int getCost(){
		return this.cost;
	}
	public int getReceipt(){
		return this.receipt;
	}

	public String toString() {
		return getId() + ", " + getTitle() + ", " + getReleaseDate() + ", " + getNumber() + ", " + getCost() + ", " + getReceipt();
	}

}
