package StarWars_BDD;

import java.sql.*;

public class Select {
	public static void Select() {
		// TODO Auto-generated method stub
		try {
			String strClassName = "org.sqlite.JDBC";
			String dbName= "E:/Content/Travail/Itescia/Cours/L3/Phase 3/Java/Cours4/BDD/BDD_StarWarsTP.db"; 
			String login= ""; 
			String motdepasse= ""; 
			String strUrl = "jdbc:sqlite:" +  dbName;

			Class.forName(strClassName);
			Connection conn = DriverManager.getConnection(strUrl, login, motdepasse);
			
			String strSelect = "SELECT "
				+ "title "
				+ "FROM Acces;";
			
			Statement stAddUser = conn.createStatement();
			ResultSet rs = stAddUser.executeQuery(strSelect);
			
			while(rs.next()) {
				System.out.println(rs.getString("title"));
			}
			
			conn.close();
		}
		catch(ClassNotFoundException e) {  
			System.err.println("Driver non chargé !");  e.printStackTrace();
		} catch(SQLException e) {
			System.err.println("Autre erreur !");  e.printStackTrace();
		}
	}
}
