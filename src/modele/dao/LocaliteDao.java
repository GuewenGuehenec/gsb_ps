/*
 * Cr�� le 22 f�vr. 2015
 *
 * TODO Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
package modele.dao;

import modele.Localite;
import modele.Medecin;

import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;


/**
 * @author Isabelle
 * 22 f�vr. 2015
 * TODO Pour changer le mod�le de ce commentaire de type g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
public class LocaliteDao {
	
	public static Localite rechercher(String codeLocalite){
		Localite uneLocalite=null;
		ResultSet reqSelection = ConnexionOracle.execReqSelection("select * from localite where codepostal='"+codeLocalite+"'");
		try {
			if (reqSelection.next()) {
				uneLocalite = new Localite(reqSelection.getString(2), reqSelection.getString(3));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from LOCALITE where CODEPOSTAL='"+codeLocalite+"'");
			e.printStackTrace();
			}
		ConnexionOracle.fermerConnexionBd();
		return uneLocalite;
	}
	
	public static ArrayList<Localite> retournerListeVilleCp(String unCodeLocalite){
		ArrayList<Localite> collectionDesLocaliteCp = new ArrayList<Localite>();
		ResultSet reqSelection = ConnexionOracle.execReqSelection("select * from localite where codepostal='"+unCodeLocalite+"'");
		try {
			while (reqSelection.next()) {
				Localite ville = new Localite();
				ville.setVille(reqSelection.getString(3));
				collectionDesLocaliteCp.add(ville);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return collectionDesLocaliteCp;		
	}
}

