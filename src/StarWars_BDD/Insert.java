package StarWars_BDD;

import java.sql.*;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			/*String strInsert = "INSERT INTO Acces "
				+ "(id, title, releaseDate, number, cost, receipt) "
				+ "VALUES (1, 'Un nouvel espoir', 1977, 4, 50000, 9000000);";*/
				/*+ "VALUES (2, 'LEmpire contre-attaque', 1980, 5, 70000, 10000000),"
				+ "(3, 'Le Retour du Jedi', 1983, 6, 100000, 50000000);";*/
				
			String strClassName = "org.sqlite.JDBC";
			String dbName= "E:/Content/Travail/Itescia/Cours/L3/Phase 3/Java/Cours4/BDD/BDD_StarWarsTP.db"; 
			String login= ""; 
			String motdepasse= ""; 
			String strUrl = "jdbc:sqlite:" +  dbName;

			Class.forName(strClassName);
			Connection conn = DriverManager.getConnection(strUrl, login, motdepasse);
			
			Statement stAddUser = conn.createStatement();
			//stAddUser.executeUpdate(strInsert);
			
			conn.close();
		}
		catch(ClassNotFoundException e) {  
			System.err.println("Driver non chargé !");  e.printStackTrace();
		} catch(SQLException e) {
			System.err.println("Autre erreur !");  e.printStackTrace();
		}
		
		Select.Select();
		
		//Suppr.Suppr(1);
		
		//ModifTitle.ModifTitle(1);
	}

}
