package Autres;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ShowText {
	/**
	 * @version 1.0
	 * @param args
	 * @throws IOException
	 */
	public static void main (String[] args) throws IOException {
		FileInputStream in = new FileInputStream("files/fichier.txt");
		for(int a = in.read(); a!=-1; a = in.read()) {
	         System.out.print((char)a);
		}
		in.close();
	}
}

/*
public class ShowText {
	/**
	 * @version 2.0
	 * @param args
	 * @throws IOException
	 *//*
	public static void main (String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("files/fichier.txt"));
		String line;
		while ((line = in.readLine()) != null)
		{
	      // Afficher le contenu du fichier
			  System.out.println (line);
		}
		in.close();
	}
}
*/