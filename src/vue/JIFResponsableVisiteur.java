package vue;

import modele.Medicament;
import modele.dao.MedicamentDao;
import service.MedicamentService;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JIFResponsableVisiteur extends JInternalFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel p;
	private JPanel pTexte;
	private GridLayout tableau;
	
	private JLabel JLplaceHolder0;
	private JLabel JLplaceHolder1;
	private JLabel JLplaceHolder2;
	
	private JLabel JLUnite;
	private JLabel JLResponsable;
	private JLabel JLVisiteur;
	
	private ArrayList<String> codesVisiteurs;
	private ArrayList<String> codesMedicaments;
	
	private JComboBox JCBcodeVisiteur;
	private JComboBox JCBResponsable;
	private JComboBox JCBVisiteur;
	
	private JButton JBajouter;
	
	public JIFResponsableVisiteur() {
		setTitle("Ajout d'un responsable à un visiteur");
		p = new JPanel();
		tableau = new GridLayout(5,2);
		tableau.setVgap(20);
		pTexte = new JPanel(tableau);
		
		JLplaceHolder0 = new JLabel("PlaceHolder");
		JLplaceHolder1 = new JLabel("PlaceHolder");
		JLplaceHolder2 = new JLabel("PlaceHolder");
		JLplaceHolder0.setVisible(false);
		JLplaceHolder1.setVisible(false);
		JLplaceHolder2.setVisible(false);
		
		JLUnite = new JLabel("Unité");
		JLResponsable = new JLabel("Responsable");
		JLVisiteur = new JLabel("Visiteur");
		
		JCBcodeVisiteur = new JComboBox();
		JCBResponsable = new JComboBox();
		JCBVisiteur = new JComboBox();
		
		codesVisiteurs = MedicamentDao.getLesCodeVisiteurs();
		JCBcodeVisiteur.addItem("Choisir une unité");
		for(String code : codesVisiteurs) {
			JCBcodeVisiteur.addItem(code);
		}
		
		codesMedicaments = MedicamentDao.getLesCodeMedicaments();
		JCBResponsable.addItem("Choisir un responsable");
		for(String code : codesMedicaments) {
			JCBResponsable.addItem(code);
		}
		
		//codesMedicaments = MedicamentDao.getLesCodeMedicaments();
		JCBVisiteur.addItem("Choisir un visiteur");
		//for(String code : codesMedicaments) {
		//	JCBdepotLegal.addItem(code);
		//}
		
		JBajouter = new JButton("Ajouter Responsable");
		JBajouter.addActionListener(this);
		
		pTexte.add(JLplaceHolder0);
		pTexte.add(JLplaceHolder1);
		pTexte.add(JLUnite);
		pTexte.add(JCBcodeVisiteur);
		pTexte.add(JLResponsable);
		pTexte.add(JCBResponsable);
		pTexte.add(JLVisiteur);
		pTexte.add(JCBVisiteur);
		pTexte.add(JLplaceHolder2);
		pTexte.add(JBajouter);
		
		p.add(pTexte);
		Container contentPane = getContentPane();
        contentPane.add(p);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		Object source = evt.getSource();
		if (source == JBajouter){
			MedicamentService.ajouterStockMedicament(null, null, null);
		}
	}

}
