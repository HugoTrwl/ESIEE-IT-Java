package StarWars_BDD;

import java.sql.*;

public class ModifTitle {
	public static void ModifTitle(int id) {
		try {			
			String strClassName = "org.sqlite.JDBC";
			String dbName= "E:/Content/Travail/Itescia/Cours/L3/Phase 3/Java/Cours4/BDD/BDD_StarWarsTP.db"; 
			String login= ""; 
			String motdepasse= ""; 
			String strUrl = "jdbc:sqlite:" +  dbName;
			
			String strModif = "UPDATE Acces "
					+ "SET title = 'new title'"
					+ "WHERE id = " + id + ";";

			Class.forName(strClassName);
			Connection conn = DriverManager.getConnection(strUrl, login, motdepasse);
			
			Statement stAddUser = conn.createStatement();
			stAddUser.executeUpdate(strModif);
			
			conn.close();
		}
		catch(ClassNotFoundException e) {  
			System.err.println("Driver non charg� !");  e.printStackTrace();
		} catch(SQLException e) {
			System.err.println("Autre erreur !");  e.printStackTrace();
		}
	}
}
