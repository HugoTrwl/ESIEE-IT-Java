package Autres;

public class Calcul {
	static int a = 6;
	static int b = 2;
	
	public void setIntA(int a){
		this.a = a;
	}
	public void setIntB(int b){
		this.b = b;
	}
	
	public int getIntA(){
		/**
		 * @return a
		 */
		return this.a;
	}
	public int getIntB(){
		/**
		 * @return b
		 */
		return this.b;
	}
	
	
	public static int Division() {
		return a/b;
	}
	public static int Addition() {
		return a+b;
	}
	public static int Soustraction() {
		return a-b;
	}
	public static int Multiplication() {
		return a*b;
	}
	
	public Calcul () {}
	public Calcul (int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public static void main( String [ ] args ) {
		try {
			System.out.println(Division());
		}
		catch(ArithmeticException ex) {
			System.out.println("Une exception arithmétique a été levée");
			System.out.println("Message : " + ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println(Addition());
		System.out.println(Soustraction());
		System.out.println(Multiplication());
	}
}
