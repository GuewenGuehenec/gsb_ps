/*
 * Cr�� le 22 f�vr. 2015
 *
 * TODO Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
package modele;

import java.sql.Date;

/**
 * @author Isabelle
 * 22 f�vr. 2015
 * TODO Pour changer le mod�le de ce commentaire de type g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
public class Medecin {
	protected String codeMed ;
	protected String nom;
	protected String prenom;
	protected String adresse;
	protected Localite laLocalite;
	protected String telephone;
	protected String potentiel;
	protected String specialite;
	protected String ville;
	protected int jDernierRDV;
	/**
	 * @param codeMed
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param uneLocalite
	 * @param telephone
	 * @param potentiel
	 * @param specialite
	 */
	public Medecin(String codeMed, String nom, String prenom,
			String adresse, Localite uneLocalite, String ville, String telephone,
			String potentiel, String specialite, int jDernierRDV) {
		this.codeMed = codeMed;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.laLocalite = uneLocalite;
		this.ville = ville;
		this.telephone = telephone;
		this.potentiel = potentiel;
		this.specialite = specialite;
		this.jDernierRDV = jDernierRDV;
		
	}
	public int getjDernierRDV() {
		return jDernierRDV;
	}
	public void setjDernierRDV(int jDernierRDV) {
		this.jDernierRDV = jDernierRDV;
	}
	public Medecin() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return Renvoie codeMed.
	 */
	public String getCodeMed() {
		return codeMed;
	}
	/**
	 * @param codeMed codeMed � d�finir.
	 */
	public void setCodeMed(String codeMed) {
		this.codeMed = codeMed;
	}
	/**
	 * @return Renvoie nom.
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom nom � d�finir.
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return Renvoie prenom.
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom prenom � d�finir.
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return Renvoie adresse.
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse adresse � d�finir.
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return Renvoie laLocalite.
	 */
	public Localite getLaLocalite() {
		return laLocalite;
	}
	/**
	 * @param laLocalite laLocalite � d�finir.
	 */
	public void setLaLocalite(Localite laLocalite) {
		this.laLocalite = laLocalite;
	}
	/**
	 * @return Renvoie ville.
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @param ville ville � d�finir.
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	/**
	 * @return Renvoie telephone.
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone telephone � d�finir.
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return Renvoie potentiel.
	 */
	public String getPotentiel() {
		return potentiel;
	}
	/**
	 * @param potentiel potentiel � d�finir.
	 */
	public void setPotentiel(String potentiel) {
		this.potentiel = potentiel;
	}
	/**
	 * @return Renvoie specialite.
	 */
	public String getSpecialite() {
		return specialite;
	}
	/**
	 * @param specialite specialite � d�finir.
	 */
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
}
