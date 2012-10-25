package day1.arraylist;

import java.util.ArrayList;

/**
 * Séance de révision du 11/09/2012.
 * @author mallonneau
 *
 */
public class Personne {

	private static int COMPTEUR = 0;

	public static int getNombreInstances() {
		return COMPTEUR;
	}

	private String mNom;
	private String mPrenom;
	private int mAnneeNaissance;
	private String mLogin;
	private String mPassword;
	private ArrayList<Adresse> mAdresse;

	public Personne(String nom, String prenom, int age, ArrayList<Adresse> adresse) {
		COMPTEUR++;
		this.mNom = nom;
		this.mPrenom = prenom;
		this.mAnneeNaissance = age;
		this.mAdresse = adresse;
		generateLogin();
	}

	public void ajouterAdresse(Adresse adr) {
		mAdresse.add(adr);
	}

	private void generateLogin() {
		if (mPrenom != null
				&& mNom != null) {
			String str = "";
			char c = mPrenom.charAt(0);

			str += c;
			str += mNom;

			mLogin = str.toLowerCase();
			mPassword = str.toUpperCase();
		}
	}

	public ArrayList<Adresse> getAdresse() {
		return mAdresse;
	}

	public int getAnneeNaissance() {
		return mAnneeNaissance;
	}

	public String getLogin() {
		return mLogin;
	}

	public String getNom() {
		return mNom;
	}

	public int getNombreAdresses() {
		return mAdresse.size();
	}

	public String getPassword() {
		return mPassword;
	}

	public String getPrenom() {
		return mPrenom;
	}

	public Adresse obtenirAdresse(int i) {
		return mAdresse.get(i);
	}

	public void setAnneeNaissance(int anneeNaissance) {
		this.mAnneeNaissance = anneeNaissance;
	}

	public void setNom(String nom) {
		this.mNom = nom;
		generateLogin();
	}

	/**
	 * Modifie le prénom.
	 * @param prenom - Le nouveau prénom
	 */
	public void setPrenom(String prenom) {
		this.mPrenom = prenom;
		generateLogin();
	}

	public void supprimerAdresse(Adresse adr) {
		mAdresse.remove(adr);
	}

	public void supprimerAdresse(int i) {
		mAdresse.remove(i);
	}

	@Override
	public String toString() {
		return "Nom: " + mNom + "\nPrénom: " + mPrenom
		+ "\nAnnée de naissance: " + mAnneeNaissance
		+ "\nNombre d'adresses: " + mAdresse.size();
	}
}