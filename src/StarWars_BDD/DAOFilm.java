package StarWars_BDD;

import java.sql.*;
import java.util.ArrayList;

public class DAOFilm {
	String strClassName;
	String dbName; 
	String login; 
	String motdepasse; 
	String strUrl;
	
	Connection conn;
	Statement stAddUser;

	
	public DAOFilm() {
		try {
			strClassName = "org.sqlite.JDBC";
			dbName = "E:/Content/Travail/Itescia/Cours/L3/Phase 3/Java/Cours4/BDD/BDD_StarWarsTP.db"; 
			login = ""; 
			motdepasse = ""; 
			strUrl = "jdbc:sqlite:" +  dbName;

			Class.forName(strClassName);
			this.conn = DriverManager.getConnection(strUrl, login, motdepasse);
			
			this.stAddUser = conn.createStatement();
			
		} catch(ClassNotFoundException e) {  
			System.err.println("Driver non chargé !");  e.printStackTrace();
		} catch(SQLException e) {
			System.err.println("Autre erreur !");  e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			this.conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void Lister() {
		try {
			String strSelect = "SELECT *"
				+ "FROM Acces;";
			
			ResultSet rs = stAddUser.executeQuery(strSelect);
			
			while(rs.next()) {
				System.out.println(rs.getString("id") + ", " + rs.getString("title") + ", " + rs.getString("releaseDate")
				+ ", " + rs.getString("number") + ", " + rs.getString("cost") + ", " + rs.getString("receipt"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Ajouter(int id, String title, int releaseDate, int number, int cost, int receipt) {
		try {
			String strInsert = "INSERT INTO Acces "
					+ "(id, title, releaseDate, number, cost, receipt) "
					+ "VALUES (" +  id + ", '" + title + "', " + releaseDate + ", " + number + ", " + cost + ", " + receipt +");";
			
			stAddUser.executeUpdate(strInsert);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Supprimer(int id) {
		try {
			String strSuppr = "DELETE FROM Acces "
					+ "WHERE id = " + id + ";";

			stAddUser.executeUpdate(strSuppr);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Debut Exercice 6
	 * 
	 */
	public ArrayList<Film> ListerFilm() {
		ArrayList<Film> filmList = new ArrayList<Film>();
		
		try {
			String strSelect = "SELECT *"
				+ "FROM Acces;";
			
			ResultSet rs = stAddUser.executeQuery(strSelect);
			
			while(rs.next()) {
				//filmList.add(1, rs);
				//System.out.println(rs.getString("id") + ", " + rs.getString("title") + ", " + rs.getString("releaseDate")
				//+ ", " + rs.getString("number") + ", " + rs.getString("cost") + ", " + rs.getString("receipt"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return filmList;
	}
	
	public void Ajouter(Film a) {
		try {
			String strInsert = "INSERT INTO Acces "
					+ "(id, title, releaseDate, number, cost, receipt) "
					+ "VALUES (" + a + ");";
			
			stAddUser.executeUpdate(strInsert);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Supprimer(Film a) {
		try {
			String strSuppr = "DELETE FROM Acces "
					+ "WHERE id = " + a.getId() + " and title = " + a.getTitle()
					+  " and releaseDate = " + a.getReleaseDate() +  " and number = " + a.getNumber()
					+ " and cost = " + a.getCost() +  " and receipt = " + a.getReceipt() + ";";

			stAddUser.executeUpdate(strSuppr);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Fin Exercice 6
	
	public static void main(String[] args) {
		DAOFilm create = new DAOFilm();
		
		/*
		create.Ajouter(1, "Un nouvel espoir", 1977, 4, 50000, 9000000);
		create.Ajouter(2, "LEmpire contre-attaque", 1980, 5, 70000, 10000000);
		create.Ajouter(3, "Le Retour du Jedi", 1983, 6, 100000, 50000000);
		
		create.Lister();
		
		create.Supprimer(3);*/
		
		//create.Lister();
		
		/**
		 * Exercice 6
		 */
		Film f1 = new Film(3, "'Le Retour du Jedi'", 1983, 6, 100000, 50000000);
		
		//create.ListerFilm();
		//create.Ajouter(f1);
		//create.Supprimer(f1);
		
		create.close();
	}
}
