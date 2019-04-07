package vue;

import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import modele.Medecin;
import modele.dao.MedecinDao;

public class JIFMedecinSuiviVisites extends JInternalFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel p;
	private JScrollPane scrollPane;
	
	public JIFMedecinSuiviVisites(MenuPrincipal uneFenetreContainer) {
		setTitle("Suivi des visites des médecins");
		p = new JPanel();
		ArrayList<Medecin> lesMedecins = MedecinDao.retournerCollectionDesMedecins();
		int nbLignes = MedecinDao.retournerCollectionDesMedecins().size();
		
		JTable table;
		int i=0;
		String[][] data = new String[nbLignes][4];
		for(Medecin unMedecin : lesMedecins) {
			data[i][0] = unMedecin.getCodeMed();
			data[i][1] = unMedecin.getNom();
			data[i][2] = unMedecin.getPrenom();
			data[i][3] = Integer.toString(unMedecin.getjDernierRDV());
			i++;
		}
		String[] columnNames = {"Code", "Nom", "Prenom","Jours depuis dernier RDV"};
		table = new JTable(data, columnNames);
		
		scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(450, 250));
		p.add(scrollPane);
		
		Container contentPane = getContentPane();
		contentPane.add(p);
	}
}
