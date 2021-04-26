package StarWars_BDD;

import java.sql.*;

public class Suppr {
	
	public static void Suppr(int id) {
		try {			
			String strClassName = "org.sqlite.JDBC";
			String dbName= "E:/Content/Travail/Itescia/Cours/L3/Phase 3/Java/Cours4/BDD/BDD_StarWarsTP.db"; 
			String login= ""; 
			String motdepasse= ""; 
			String strUrl = "jdbc:sqlite:" +  dbName;
			
			String strSuppr = "DELETE FROM Acces "
					+ "WHERE id = " + id + ";";

			Class.forName(strClassName);
			Connection conn = DriverManager.getConnection(strUrl, login, motdepasse);
			
			Statement stAddUser = conn.createStatement();
			stAddUser.executeUpdate(strSuppr);
			
			conn.close();
		}
		catch(ClassNotFoundException e) {  
			System.err.println("Driver non chargé !");  e.printStackTrace();
		} catch(SQLException e) {
			System.err.println("Autre erreur !");  e.printStackTrace();
		}
	}
}
