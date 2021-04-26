package StarWars_BDD;

import java.sql.*;

public class Select {
	public static void Select() {
		// TODO Auto-generated method stub
		try {
			
			String strSelect = "SELECT "
					+ "title "
					+ "FROM Acces;";
			
			String strClassName = "org.sqlite.JDBC";
			String dbName= "E:/Content/Travail/Itescia/Cours/L3/Phase 3/Java/Cours4/BDD/BDD_StarWarsTP.db"; 
			String login= ""; 
			String motdepasse= ""; 
			String strUrl = "jdbc:sqlite:" +  dbName;

			Class.forName(strClassName);
			Connection conn = DriverManager.getConnection(strUrl, login, motdepasse);
			
			Statement stAddUser = conn.createStatement();
			stAddUser.executeUpdate(strSelect);
			
			conn.close();
		}
		catch(ClassNotFoundException e) {  
			System.err.println("Driver non chargé !");  e.printStackTrace();
		} catch(SQLException e) {
			System.err.println("Autre erreur !");  e.printStackTrace();
		}
	}
}
