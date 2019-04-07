package service;

import javax.swing.JOptionPane;

import modele.dao.MedicamentDao;

public class MedicamentService {
	public static void ajouterStockMedicament(String codeVisiteur, String codeMedicament, String strQuantite) {
		boolean isValid = false;
		try {
			Integer.parseInt(strQuantite);
			isValid = true;
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"La quantit� entr�e ne correspond pas � un nombre !","Alert",JOptionPane.WARNING_MESSAGE);
		}
		if(isValid == true) {
			MedicamentDao.ajouterQuantite(codeVisiteur,codeMedicament,strQuantite);
		}
	}
}
