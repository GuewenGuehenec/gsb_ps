package modele.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class ConnexionOracle {
	
	static Connection conn;
	
	public ConnexionOracle(){
		conn = null;
	}
	
	public static oracle.jdbc.OracleConnection connectBddOracle() {
		
		try {
			   Class.forName("oracle.jdbc.OracleConnection");
			   String url = "jdbc:oracle:thin:@//192.168.1.58:1521/oracle";
			   String user = "GSBJAVAPROC";
			   String password = "GSBJAVAPROC";
			    conn = DriverManager.getConnection(url, user, password);
			}
		
			catch (Exception e) {
			   e.printStackTrace();
			}
		
		return (oracle.jdbc.OracleConnection) conn;
	}
	
	public static ResultSet execReqSelection(String laRequete){ 
		connectBddOracle();
		ResultSet resultatReq = null;
		try {
				Statement requete = conn.createStatement(); 
				resultatReq =requete.executeQuery(laRequete); 
		} 
		catch(Exception e) {  System.out.println("Erreur requete : "+laRequete);  }
		return resultatReq;	
	}
	
	public static int execReqMaj(String laRequete){
		connectBddOracle();
		int nbMaj =0;
		try {
		Statement s = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        nbMaj = s.executeUpdate(laRequete);
        s.close();}
		catch (Exception er) {
			er.printStackTrace(); 
			System.out.println("echec requête : "+laRequete); }
		return nbMaj;       
	}
	
	public static void fermerConnexionBd(){
		try{conn.close();}
		catch(Exception e) {  System.out.println("Erreur sur fermeture connexion");  } 
	}
	

}
