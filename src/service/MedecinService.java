/*
 * Cr�� le 23 f�vr. 2015
 *
 * TODO Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
package service;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

import modele.Medecin;
import modele.dao.ConnexionMySql;
import modele.dao.MedecinDao;
import modele.dao.VisiteurDao;

/**
 * @author Isabelle
 * 23 f�vr. 2015
 * TODO Pour changer le mod�le de ce commentaire de type g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
public class MedecinService {
	
	public static Medecin rechercherMedecin(String unCodeMedecin){
		Medecin unMedecin = null;
		try{
		if (unCodeMedecin==null) {
            throw new Exception("Donn�e obligatoire : code");
        }
		unMedecin = MedecinDao.rechercher(unCodeMedecin);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return unMedecin;
	}

	public static void VisiteServiceCodeMed(String data) {
		boolean codMed = MedecinDao.rechercherCodMed(data);
		try {
			if(codMed == true) {
				JOptionPane.showMessageDialog(null,"Le Code m�decin existe d�j� !","Alert",JOptionPane.WARNING_MESSAGE);
			}
		}catch(Exception e) {

		}	
		
	}
	
		
}

